package com.rpg.character.actions;

import com.rpg.character.model.Character;

public class CharacterActions {
	public void restoreLifePoints(Character character) {
		character.setCurrentLifePoints(character.getMaximumLifePoints());
	}
}
