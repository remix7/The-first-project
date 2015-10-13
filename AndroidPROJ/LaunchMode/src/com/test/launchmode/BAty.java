package com.test.launchmode;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class BAty extends Activity {
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_baty);
		tv = (TextView) findViewById(R.id.TextView);
		tv.setText(String.format("TaskID:%s\nCurrent Activity ID :%s", getTaskId(),toString()));
		findViewById(R.id.Btn_MainActivity).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				startActivity(new Intent(BAty.this,MainActivity.class));
			}
		});
		findViewById(R.id.btn_BAty).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(BAty.this,BAty.class));
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.baty, menu);
		return true;
	}

}
