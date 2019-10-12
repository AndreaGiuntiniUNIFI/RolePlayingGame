package com.rpg.character.controller;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;

import com.rpg.character.actions.CharacterActions;
import com.rpg.character.view.CharacterView;
import com.rpg.character.model.Character;

import static org.mockito.Mockito.*;

public class CharacterControllerTest {

	private static final int CURRENT_LIFE_POINTS = 80;

	private static final int MAX_LIFE_POINTS = 100;

	private static final int POTIONS_NUMBER = 1;

	@Spy
	private CharacterActions characterActions;

	@Mock
	private CharacterView characterView;

	@InjectMocks
	private CharacterController characterController;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testUsePotionRestoreHealth() {
		// setup
		Character character = new Character();
		character.setPotions(POTIONS_NUMBER);
		character.setMaximumLifePoints(MAX_LIFE_POINTS);
		character.setCurrentLifePoints(CURRENT_LIFE_POINTS);
		// exercise
		characterController.usePotion(character);
		// verify
		assertThat(character.getCurrentLifePoints()).isEqualTo(character.getMaximumLifePoints());
		verify(characterView).showPotions(character.getPotions());

	}

	@Test
	public void testUsePotionWhenNoPotionAreAvailable() {
		// setup
		Character character = new Character();
		character.setPotions(0);
		// exercise
		characterController.usePotion(character);
		// verify
		verify(characterView).showError("You do not have any potion");
		verifyNoMoreInteractions(ignoreStubs(characterActions));
	}

}
