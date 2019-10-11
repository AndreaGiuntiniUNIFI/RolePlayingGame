package com.rpg.character;

public class Character {
	String name;
	double currentLifePoints;
	double maximumLifePoints;

	public Character() {

	}

	public Character(String name, double currentLifePoints, double maximumLifePoints) {
		this.name = name;
		this.currentLifePoints = currentLifePoints;
		this.maximumLifePoints = maximumLifePoints;
	}

}
