package com.foxminded.vdmpskn.task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCreatorTest {

	@ParameterizedTest
	@NullAndEmptySource
	void nullOrEmptyInputShouldThrowException(String str) {
		assertThrows(NullPointerException.class, () -> AnagramCreator.createSentenceAnagram(str));
	}

	@ParameterizedTest
	@ValueSource(strings = {" ", "             "})
	void stringOfSpacesShouldThrowNullPointerException(String input) {
		assertThrows(NullPointerException.class, () -> {
			AnagramCreator.createSentenceAnagram(input);
		});
	}

	@ParameterizedTest
	@CsvSource({
		"a, a",
		"aaAaAAa, aAAaAaa",
		"foxminded, dednimxof",
		"%#!&@*$9313#!, %#!&@*$9313#!",
		"Hi my name is Vadym, iH ym eman si mydaV",
		"H1 my n@me 1s V@dym!, H1 ym e@mn 1s m@ydV!"
	})
	void testCreateSentenceWithWordsAndSymbolsAnagram(String input, String expectedOutput) {
		assertEquals(expectedOutput, AnagramCreator.createSentenceAnagram(input));
	}
}