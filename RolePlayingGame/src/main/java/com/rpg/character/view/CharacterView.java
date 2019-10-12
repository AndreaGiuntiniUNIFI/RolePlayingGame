package com.rpg.character.view;

import com.rpg.character.model.Character;

public interface CharacterView {
	void showPotions(double numPotions);
	void showLifePoints(Character character);
	void showError(String message);
}
