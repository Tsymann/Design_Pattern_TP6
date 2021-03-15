package com.tactfactory.designpatternniveau1.observer.tp1.model;

public class Subject extends SubjectAbs {

	private int data;

	
	public void setData(int data) {
		this.data = data;
		System.out.println(String.format("First state change: " + this.data));
		this.notifyObservers(this.data);
	}

}
