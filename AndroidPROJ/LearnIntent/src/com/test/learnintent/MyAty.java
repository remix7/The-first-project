package com.test.learnintent;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MyAty extends Activity {
	
	public static final String ACTION = "com.test.learnintent.Intent.Action.MyAty";
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.myaty);
		findViewById(R.id.btn_main).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MyAty.this,MainActivity.class));
			}
		});
	}
}
