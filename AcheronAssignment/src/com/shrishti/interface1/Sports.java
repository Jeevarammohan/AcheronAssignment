package com.shrishti.interface1;

public interface Sports {
	void showSports();
	default void printName(){
		System.out.println("Sports interface");
	}
}
