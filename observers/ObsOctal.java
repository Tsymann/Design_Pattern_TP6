package com.tactfactory.designpatternniveau1.observer.tp1.observers;

public class ObsOctal implements Observer {


	@Override
	public void update(int nbr) {
		System.out.println("Octal String: " + Integer.toOctalString(nbr));
	}
}
