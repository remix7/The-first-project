package com.test.launchmode;

/*
 * 启动方式 字啊  AndroidManife.xml文件中的Activity中设置
 * 不同的启动方式所带来d效果也不一样
 * 默认的启动方式  standard    用相同的栈   支持后退键导航 
 * singletop启动方式    使用相同的栈   返回回退回上一个界面
 * singleTask启动方式   界面使用相同的栈  后退会退出  界面切换后  原来的界面会被释放
 * singleInsatce启动方式   界面会用不同的栈   会产生动画效果  后退会返回上一个界面
 */

import android.os.Bundle;
import android.R.string;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView tv;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		tv = (TextView) findViewById(R.id.TextView);
		tv.setText(String.format("TaskID:%s\nCurrent Activity ID :%s", getTaskId(),toString()));
		findViewById(R.id.BtnStartSelf).setOnClickListener(new View.OnClickListener() {
			public void onClick(View arg0) {
				startActivity(new Intent(MainActivity.this,MainActivity.class));
			}
		});
		findViewById(R.id.btn_BAty).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,BAty.class));
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
