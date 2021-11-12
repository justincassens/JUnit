package edu.augustana.csc305.labs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HannaldousTesting {

	@Test
	public void numBadPasswordsTest() {
		String[] test1 = new String[] { "fasdefsfg", "pie", "how&&&in" };
		String[] test2 = new String[] { "bigmoose$", "emusareawesome", "123goodbye", "ok&y", "17", "cat" };
		String[] test3 = new String[] { "buddy", "bu$", "@$%^&**", "$upboiiiiii?", "CoZy" };

		assertEquals(2, Hannaldous.numBadPasswords(8, test1));
		assertEquals(4, Hannaldous.numBadPasswords(8, test2));
		assertEquals(3, Hannaldous.numBadPasswords(4, test3));

	}

	@Test
	public void CheckCharacterTest() {

		assertEquals("y", Hannaldous.CheckCharacter("alphabeTT"));
		assertEquals("n", Hannaldous.CheckCharacter("1ceUpon@ime"));
		assertEquals("y", Hannaldous.CheckCharacter("yes"));
	}

}
