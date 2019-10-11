package com.rpg.character.model;

public class Character {
	private String name;
	private double currentLifePoints;
	private double maximumLifePoints;

	public Character() {

	}

	public Character(String name, double currentLifePoints, double maximumLifePoints) {
		this.setName(name);
		this.setCurrentLifePoints(currentLifePoints);
		this.setMaximumLifePoints(maximumLifePoints);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getCurrentLifePoints() {
		return currentLifePoints;
	}

	public void setCurrentLifePoints(double currentLifePoints) {
		this.currentLifePoints = currentLifePoints;
	}

	public double getMaximumLifePoints() {
		return maximumLifePoints;
	}

	public void setMaximumLifePoints(double maximumLifePoints) {
		this.maximumLifePoints = maximumLifePoints;
	}

}
