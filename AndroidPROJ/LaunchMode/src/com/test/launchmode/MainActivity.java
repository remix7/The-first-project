package com.test.launchmode;

/*
 * ������ʽ �ְ�  AndroidManife.xml�ļ��е�Activity������
 * ��ͬ��������ʽ������dЧ��Ҳ��һ��
 * Ĭ�ϵ�������ʽ  standard    ����ͬ��ջ   ֧�ֺ��˼����� 
 * singletop������ʽ    ʹ����ͬ��ջ   ���ػ��˻���һ������
 * singleTask������ʽ   ����ʹ����ͬ��ջ  ���˻��˳�  �����л���  ԭ���Ľ���ᱻ�ͷ�
 * singleInsatce������ʽ   ������ò�ͬ��ջ   ���������Ч��  ���˻᷵����һ������
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
