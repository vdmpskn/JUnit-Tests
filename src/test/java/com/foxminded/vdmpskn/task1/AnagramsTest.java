package com.foxminded.vdmpskn.task1;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AnagramsTest {

	@ParameterizedTest
	@NullAndEmptySource
	void nullOrEmptyInputShouldThrowException(String str) {
		assertThrows(NullPointerException.class, () -> Anagrams.reverseWord(str));
	}

	@ParameterizedTest
	@ValueSource(strings = {" ", "             "})
	void stringOfSpacesShouldThrowNullPointerException(String input) {
		assertThrows(NullPointerException.class, () -> {
			Anagrams.reverseWord(input);
		});
	}

	@ParameterizedTest
	@CsvSource({
		"a, a",
		"aaAaAAa, aAAaAaa",
		"foxminded, dednimxof",
		"%#!&@*$9313#!, %#!&@*$9313#!",
	})
	void testReverseWordWithLettersAndSymbolsAnagram(String input, String expectedOutput) {
		assertEquals(expectedOutput, Anagrams.reverseWord(input));
	}
}