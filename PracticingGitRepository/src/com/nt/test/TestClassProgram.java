package com.nt.test;

import com.nt.interfaces.IFunctionalInterface;

public class TestClassProgram {
	
	public static void main(String[] args) {
		System.out.println("Welcomt to the First Stage of the git");
		System.out.println("Staging is now Started");
		calculation();
		IFunctionalInterface c=(a,b)->{
			System.out.println("Calling the Interface");
			System.out.println("TestClassProgram.main()");
		};
		c.getAccessofInterface();
		TestClassProgram p=new TestClassProgram();
		p.calculation();
		c.showtheColors(10, 45);
	}
	
	public static void calculation() {
		System.out.println(10+20+50);
	}


}
