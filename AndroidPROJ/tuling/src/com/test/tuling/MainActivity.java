package com.test.tuling;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

public class MainActivity extends Activity implements HttpGetDataListener,OnClickListener {
	private HttpData httpData;
	private List<ListData> lists;
	private ListView lv;
	private EditText sendtext;
	private Button send_btn;
	private String content_str;
	private TextAdapter adapter;
	private String[] welcom_array;
	private double currentTime,oldTime = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		initView();
		
	}
	
	private void initView(){
		lv = (ListView) findViewById(R.id.lv);
		sendtext = (EditText) findViewById(R.id.editText);
		send_btn = (Button) findViewById(R.id.send_btn);
		lists = new ArrayList<ListData>();
		send_btn.setOnClickListener(this);
		adapter = new TextAdapter(lists, this);
		lv.setAdapter(adapter);
		ListData listData;
		listData = new ListData(getRandomWelcomTips(), ListData.RECEIVER,getTime());
		lists.add(listData);
	}

	private String getRandomWelcomTips(){
		String welcom_tips = null;
		welcom_array = this.getResources().getStringArray(R.array.welcom_tips);
		int index =(int)( Math.random()*(welcom_array.length-1));
		welcom_tips = welcom_array[index];
		return welcom_tips;
	}
	@Override
	public void getDataUrl(String data) {
//		System.out.println(data);
		parseText(data);
	}

	public void parseText(String str){
		
		try {
			JSONObject jb = new JSONObject(str);
//			System.out.println(jb.getString("code"));
//			System.out.println(jb.getString("text"));
			ListData listData;
			listData = new ListData(jb.getString("text"),ListData.RECEIVER,getTime());
			lists.add(listData);
			adapter.notifyDataSetChanged();
		} catch (JSONException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void onClick(View v) {
	
		getTime();
		content_str = sendtext.getText().toString();
		sendtext.setText("");
		String dropk = content_str.replace(" ", "");
		String drop = dropk.replace("\n", "");
		ListData listData;
		listData = new ListData(content_str, ListData.SEND,getTime());
		lists.add(listData);
		if (lists.size()>30) {
			for (int i = 0; i < lists.size(); i++) {
				lists.remove(i);
			}
		}
		httpData = (HttpData) new HttpData(
				"http://www.tuling123.com/openapi/api?key=30f1786d28abc487c901f9352999820c&info="
						+drop, this).execute();
	}
	
	private String getTime(){
		currentTime = System.currentTimeMillis();
		SimpleDateFormat format = new SimpleDateFormat("yyyyÄêMMÔÂddÈÕ HH:mm:ss");
		Date curData = new Date();
		String abc = format.format(curData);
		if (currentTime - oldTime >= 5*60*1000) {
			oldTime = currentTime;
			return abc;
		} else{
			return "";
		}
		
	}
}
