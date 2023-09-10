package com.dp.designpatterns.singleton;

public class SingletonMultiThread {

	private volatile static SingletonMultiThread uniqueInstance;
	
	private SingletonMultiThread() {}
	
	public static SingletonMultiThread getInstance() {
		if(uniqueInstance == null) {
			synchronized (SingletonMultiThread.class) {
				if(uniqueInstance == null) {
					uniqueInstance = new SingletonMultiThread();
				}
			}
		}
		return uniqueInstance;
	}
}
