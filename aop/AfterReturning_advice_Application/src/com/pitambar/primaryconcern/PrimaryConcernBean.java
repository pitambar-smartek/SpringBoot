package com.pitambar.primaryconcern;

public class PrimaryConcernBean {
	public int addition( int numberOne,int numberTwo){
		System.out.println("CoreConcernBean's Business method should be executed First");
		return numberOne+numberTwo;
	}

}
