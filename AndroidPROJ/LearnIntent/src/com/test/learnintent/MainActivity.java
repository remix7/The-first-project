package com.test.learnintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

/*
 * 
 * 显示  是在 	startActivity(new Intent(MainActivity.this,MyAty.class));中指明要启动的activity  
 * 创建一个类 让其实现被添加到一个Activity中这样做
 *   创建一个类让其继承Activity    复写 onCreate方法  在方法中庸setContentView 来找到对应想要调用的layout
 *   
 *   在androidmanifest.xml的<app***></app***>中加入  <activity  android:name =".对应类的名字"/>
 *   
 *   就可以了
 *   
 *   
 *   隐士的话  
 *   在androidManife.xml中所在activity中加入intent-filter  中间
 *     <activity android:name=".MyAty"  >
            <intent-filter >
                <category android:name="android.intent.category.DEFAULT"/>
                <action android:name="abc"/>
            </intent-filter>
        </activity>
        然后再startActivity(new Intent(MainActivity.this,MyAty.class));  Intent的参数中加入abc就可以了
        
        一般action name 的名字是包名.intent.action.要启动的activity
        这里是   com.test.learnintent.intent.action.MyAty
        
        一般是吧这段字符放到一个静态常量中
        public static final String ACTION ="com.test.learnintent.intent.action.MyAty";
        startActivity(new Intent(MyAty.ACTION)); 就可以了
        
        
        这样做可以在应用中启动别的activity   **  只要记住activity在androidmanif中配置的action
        
        如果在   <activity android:name=".MyAty"  Android：expoted="false"> 就不可以被复制
        
        Toask.makeText(mainActivity.this,"无法启动指定的Activity",Toast.LENGTH_SHORT).show();  一个小的提示框
        
 */
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		findViewById(R.id.btn_next).setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				startActivity(new Intent(MainActivity.this,MyAty.class));
				
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
