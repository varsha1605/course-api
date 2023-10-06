package io.neha.springbootquickstart.singleton;

public class Singleton {

	private static Singleton singleton;
	private String name;

	private Singleton() {
		
	}
	
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
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
