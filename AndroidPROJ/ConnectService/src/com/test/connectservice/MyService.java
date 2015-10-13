package com.test.connectservice;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class MyService extends Service {
	private boolean running = false;
	private String data = "这是默认信息！";

	@Override
	public IBinder onBind(Intent arg0) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public int onStartCommand(Intent intent, int flags, int startId) {
		// TODO Auto-generated method stub
		data = intent.getStringExtra("data");
		return super.onStartCommand(intent, flags, startId);
	}
	@Override
	public void onCreate() {
		running = true;
		// TODO Auto-generated method stub
		super.onCreate();
		new Thread(){
			public void run() {
				while(running){
					System.out.println(data);
					try {
						sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			};
		}.start();
	}
	
	@Override
	public void onDestroy() {
		running = false;
		
		
		// TODO Auto-generated method stub
		super.onDestroy();
	}

}
