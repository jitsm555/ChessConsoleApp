package tests;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

import helper.InputHandler;

class InputHandlerTest {

	@Test
	void testInputValidation() {
		String value = "Horse E3";
		InputHandler handler = new InputHandler(value);
		assertEquals("E3", handler.getTile());
	}

	@Test
	void testInputValidationException() {
		String value = "Horse Z1";
		InputHandler handler = new InputHandler(value);
		try {
			assertEquals("Z1", handler.getTile());
			fail();
		} catch (IllegalArgumentException exception) {
			assertEquals("Enter tile value is incorrect: Z1", exception.getMessage());
		}
	}

}
