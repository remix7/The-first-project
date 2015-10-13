package com.test.tiaozhuan;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TiaoZhuanAcivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tiao_zhuan_acivity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tiao_zhuan_acivity, menu);
		return true;
	}

}
