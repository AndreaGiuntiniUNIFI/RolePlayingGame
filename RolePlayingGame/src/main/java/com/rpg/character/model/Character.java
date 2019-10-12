package com.rpg.character.model;

public class Character {
	private String name;
	private double currentLifePoints;
	private double maximumLifePoints;
	private double potions;

	public Character() {

	}

	public Character(String name, double currentLifePoints, double maximumLifePoints, double potions) {
		this.name = name;
		this.currentLifePoints = currentLifePoints;
		this.maximumLifePoints = maximumLifePoints;
		this.potions = potions;
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

	public double getPotions() {
		return potions;
	}

	public void setPotions(double potions) {
		this.potions = potions;
	}

}
