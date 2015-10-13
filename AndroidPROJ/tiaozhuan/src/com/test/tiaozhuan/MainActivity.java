package com.test.tiaozhuan;


import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/*
		 * 跳转到指定的Activity
		 */
		findViewById(R.id.btn_TiaoZhuan).setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View arg0) {
				//跳转到指定的Activity
//				startActivity(new Intent(MainActivity.this,TiaoZhuanAcivity.class));
				//打开指定的网页。
				startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("http://baidu.com")));
			}
		});
		
		findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,LoginActivity.class));
				
			}
		});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
