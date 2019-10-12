package com.rpg.character.controller;

import com.rpg.character.actions.CharacterActions;
import com.rpg.character.view.CharacterView;

public class CharacterController {
	private CharacterActions characterActions;
	private CharacterView characterView;

	public CharacterController(CharacterActions characterActions, CharacterView characterView) {
		this.characterActions = characterActions;
		this.characterView = characterView;
	}
}
