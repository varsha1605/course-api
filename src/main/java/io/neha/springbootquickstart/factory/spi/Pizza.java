package io.neha.springbootquickstart.factory.spi;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
	protected String dough;
	protected String name;
	protected String sauce;
	protected List<String> toppings;

	public Pizza() {
		toppings = new ArrayList<>();
	}

	public void prepare() {
		System.out.println("Preparing: " + name);
		System.out.println("Tossing dough");
		System.out.println("Adding sauce");
		System.out.println("Adding toppings: ");
		for (String t : toppings) {
			System.out.println(" " + t);
		}
	}

	public void bake() {
		System.out.println("Baking pizza");
	}

	public  abstract void cut();

	public void box() {
		System.out.println("Packing the pizza");
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}
