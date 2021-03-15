package com.tactfactory.designpatternniveau1.observer.tp1.observers;

public class ObsHexa implements Observer {

	@Override
	public void update(int nbr) {
		System.out.println("Hex String: " + Integer.toHexString(nbr).toUpperCase());
	}
}
