package com.test.chuaundi;

/*
 * ʵ�����ݣ��ַ������ڲ�ͬ��Activity�еĴ���
 *  ����ͨ�������������ϵ�Activity  ��mainActivity�н���תTextActivity  ��������
 *  findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
*			public void onClick(View v) {
*				Intent i = new Intent(MainActivity.this,TextActivity.class);
*				i.putExtra("data", "ni ai wo ma ");
*				startActivity(i);
*			}
*		});
*
*����TextActivity�н��յ����ݵ�ֵ
*	setContentView(R.layout.activity_text);
		Intent i = getIntent();
		tv = (TextView) findViewById(R.id.tv);
		tv.setText(i.getStringExtra("data"));
		
		
		��TextActivity��Xml�ļ��и�TextView ���Լ�һ��ID
		
		�Ϳ���������
 * 
 * 
 */

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView textView;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		textView = (TextView) findViewById(R.id.TextVeiw);
		findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
			public void onClick(View v) {
				Intent i = new Intent(MainActivity.this,TextActivity.class);
//				Bundle bundle = new Bundle();  *2
//				bundle.putString("name", "liutao");  *2
//				bundle.putInt("age", 20);  *2
//				i.putExtras(bundle);  *2
//				//i.putExtra("data", "ni ai wo ma ");  *1
				
				i.putExtra("user", new User("xiaoming", 121));//  ʹ�ó�Serializable  *3  *4
				
//				startActivity(i);
				startActivityForResult(i, 0);
			}
		});
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		textView.setText("��һ��ACTIVITy���ص������ǣ�"+data.getStringExtra("data"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
