package io.neha.springbootquickstart.singleton;

public class SyncSingleton {
	private volatile static SyncSingleton singleton;
	private String name;

	private SyncSingleton() {
		
	}

	public static SyncSingleton getInstance() {
		if (singleton == null) {
			synchronized(SyncSingleton.class){
				if(singleton == null) {
					singleton = new SyncSingleton();	
				}
			}
		}
		return singleton;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
