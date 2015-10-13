package com.test.learnintent;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

/*
 * 
 * ��ʾ  ���� 	startActivity(new Intent(MainActivity.this,MyAty.class));��ָ��Ҫ������activity  
 * ����һ���� ����ʵ�ֱ���ӵ�һ��Activity��������
 *   ����һ��������̳�Activity    ��д onCreate����  �ڷ�����ӹsetContentView ���ҵ���Ӧ��Ҫ���õ�layout
 *   
 *   ��androidmanifest.xml��<app***></app***>�м���  <activity  android:name =".��Ӧ�������"/>
 *   
 *   �Ϳ�����
 *   
 *   
 *   ��ʿ�Ļ�  
 *   ��androidManife.xml������activity�м���intent-filter  �м�
 *     <activity android:name=".MyAty"  >
            <intent-filter >
                <category android:name="android.intent.category.DEFAULT"/>
                <action android:name="abc"/>
            </intent-filter>
        </activity>
        Ȼ����startActivity(new Intent(MainActivity.this,MyAty.class));  Intent�Ĳ����м���abc�Ϳ�����
        
        һ��action name �������ǰ���.intent.action.Ҫ������activity
        ������   com.test.learnintent.intent.action.MyAty
        
        һ���ǰ�����ַ��ŵ�һ����̬������
        public static final String ACTION ="com.test.learnintent.intent.action.MyAty";
        startActivity(new Intent(MyAty.ACTION)); �Ϳ�����
        
        
        ������������Ӧ�����������activity   **  ֻҪ��סactivity��androidmanif�����õ�action
        
        �����   <activity android:name=".MyAty"  Android��expoted="false"> �Ͳ����Ա�����
        
        Toask.makeText(mainActivity.this,"�޷�����ָ����Activity",Toast.LENGTH_SHORT).show();  һ��С����ʾ��
        
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
