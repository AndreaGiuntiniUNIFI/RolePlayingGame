package com.rpg.character.controller;

import com.rpg.character.actions.CharacterActions;
import com.rpg.character.view.CharacterView;
import com.rpg.character.model.Character;

public class CharacterController {
	private CharacterActions characterActions;
	private CharacterView characterView;

	public CharacterController(CharacterActions characterActions, CharacterView characterView) {
		this.characterActions = characterActions;
		this.characterView = characterView;
	}

	public void usePotion(Character character) {
		double numPotions = character.getPotions();

		if (numPotions == 0) {
			characterView.showError("You do not have any potion");
			return;
		}

		characterActions.restoreLifePoints(character);
		characterView.showPotions(character.getPotions());
	}

	public void verifyCharacterName(Character character, String name) {
		int nameLength = name.length();

		if (name.isEmpty()) {
			characterView.showError("Name is empty");
			return;
		}

		int index = 0;
 
		while (index < nameLength) {
			if (java.lang.Character.isWhitespace(name.charAt(index))) {
				characterView.showError("Name is not valid, contains white spaces");
				return;
			}
			index ++;
		}
		character.setName(name);
	}
}
