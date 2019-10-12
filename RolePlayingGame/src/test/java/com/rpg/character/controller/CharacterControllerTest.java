package com.rpg.character.controller;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;
import org.mockito.Mock;

import com.rpg.character.view.CharacterView;

import static org.mockito.Mockito.*;

public class CharacterControllerTest {
	
	@Mock
	CharacterView characterView;
	
	@Test
	public void test() {
		assertThat("1").isEqualTo("1");
	}

}
