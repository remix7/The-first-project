package com.test.chuaundi;

/*
 * 实现数据（字符串）在不同的Activity中的传递
 *  首先通过创建两个以上的Activity  在mainActivity中接跳转TextActivity  代码如下
 *  findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
*			public void onClick(View v) {
*				Intent i = new Intent(MainActivity.this,TextActivity.class);
*				i.putExtra("data", "ni ai wo ma ");
*				startActivity(i);
*			}
*		});
*
*又在TextActivity中接收到传递的值
*	setContentView(R.layout.activity_text);
		Intent i = getIntent();
		tv = (TextView) findViewById(R.id.tv);
		tv.setText(i.getStringExtra("data"));
		
		
		在TextActivity的Xml文件中给TextView 属性加一个ID
		
		就可以做到了
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
				
				i.putExtra("user", new User("xiaoming", 121));//  使用承Serializable  *3  *4
				
//				startActivity(i);
				startActivityForResult(i, 0);
			}
		});
		
	}
	
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		textView.setText("另一个ACTIVITy返回的数据是："+data.getStringExtra("data"));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
