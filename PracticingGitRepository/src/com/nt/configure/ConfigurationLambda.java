package com.nt.configure;

import com.nt.interfaces.IFunctionalInterface;

public class ConfigurationLambda implements IFunctionalInterface{
	
	IFunctionalInterface face=(a,b)->{
		System.out.println(a+b);
	};

	@Override
	public void showtheColors(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println(a+b+b+a);
		
	}
	

}
