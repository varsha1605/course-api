package io.neha.springbootquickstart.singleton;

public class TestSingleton {

	public static void main(String args[]) {
		SyncSingleton singleton = SyncSingleton.getInstance();
		singleton.setName("Singleton");
		System.out.println(singleton.getName());
	}
}
