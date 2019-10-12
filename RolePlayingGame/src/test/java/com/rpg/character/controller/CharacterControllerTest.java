package com.rpg.character.controller;

import static org.assertj.core.api.Assertions.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.rpg.character.actions.CharacterActions;
import com.rpg.character.view.CharacterView;

import static org.mockito.Mockito.*;

public class CharacterControllerTest {

	@Mock
	private CharacterView characterView;
	
	@Mock 
	private CharacterActions characterActions;

	@InjectMocks
	private CharacterController characterController;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void test() {
		assertThat("1").isEqualTo("1");
	}

}
