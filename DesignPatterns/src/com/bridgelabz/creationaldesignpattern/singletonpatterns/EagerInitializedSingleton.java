package com.bridgelabz.creationaldesignpattern.singletonpatterns;

public class EagerInitializedSingleton {
	private static final EagerInitializedSingleton instance=new EagerInitializedSingleton();
	private EagerInitializedSingleton() {
		int count=1;
		System.out.println((count++)+" object created");
	}
	public static EagerInitializedSingleton getInstance()
	{
		System.out.println("instance method");
		return instance;
	}
}
