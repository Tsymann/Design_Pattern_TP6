package com.tactfactory.designpatternniveau1.observer.tp1.observers;

public class ObsBin implements Observer {

	  @Override
	  public void update(int nbr) {
		System.out.println("Binary String: " + Integer.toBinaryString(nbr));
	}
}
