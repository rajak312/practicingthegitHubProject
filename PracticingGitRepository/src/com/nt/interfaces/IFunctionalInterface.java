package com.nt.interfaces;

@FunctionalInterface
public interface IFunctionalInterface {
	
	public  void showtheColors(int a, int b);
	
	public default void getAccessofInterface() {
		System.out.println("We have Successfully entered into the inteface");
	}

}
