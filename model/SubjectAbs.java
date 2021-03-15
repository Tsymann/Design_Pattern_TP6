package com.tactfactory.designpatternniveau1.observer.tp1.model;

import java.util.ArrayList;
import java.util.List;
import com.tactfactory.designpatternniveau1.observer.tp1.observers.*;

public abstract class SubjectAbs {

	
	private final List<Observer> observers = new ArrayList<Observer>();

		public void attach(Observer observer) {
		if (!observers.contains(observer)) {
			this.observers.add(observer);
		}
	}

	public void detach(Observer observer) {
		if (observers.contains(observer)) {
			this.observers.remove(observer);
		}
	}

	protected void notifyObservers(int nbr) {
		for (Observer observer : observers) {
			observer.update(nbr);
		}
	}
}
