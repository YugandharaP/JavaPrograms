package com.bridgelabz.creationaldesignpattern.singletonpatterns;

public class ThreadSafeSingletonUsingSynchronized {
	private static ThreadSafeSingletonUsingSynchronized instance;
	private ThreadSafeSingletonUsingSynchronized() {} 
	public static ThreadSafeSingletonUsingSynchronized getInstance() {
		if(instance==null)
			synchronized(ThreadSafeSingletonUsingSynchronized.class) {
				if(instance==null)
					instance=new ThreadSafeSingletonUsingSynchronized();
					
			}return instance;
	}
}
