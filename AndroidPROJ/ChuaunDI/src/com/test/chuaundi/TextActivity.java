package com.test.chuaundi;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class TextActivity extends Activity {
	
	private TextView tv;
	private EditText editText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_text);
		Intent i = getIntent();
		editText = (EditText) findViewById(R.id.EditText);
		tv = (TextView) findViewById(R.id.tv);
//		Bundle data = i.getExtras();  *2

//		tv.setText(i.getStringExtra("data"));  *1
	//	tv.setText(String.format("name=%s,age=%d", data.getString("name"),data.getInt("age")));  *2
	//	User user = (User) i.getSerializableExtra("user");*3
		User user = i.getParcelableExtra("user");//*4
		tv.setText(String.format("User info (name = %s,age = %d)", user.getName(),user.getAge()));
		
		findViewById(R.id.btn_fanhui).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				Intent i  = getIntent();
				i.putExtra("data", editText.getText().toString());
				setResult(1, i);
				finish();
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.text, menu);
		return true;
	}

}
