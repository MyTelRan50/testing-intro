package telran.numbers;

import static org.junit.jupiter.api.Assertions.*;
import static telran.numbers.Calculator.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testSum() {
		assertEquals(4, sum(2,2));
		assertEquals(0, sum(2,-2));
		assertEquals(-4, sum(-2,-2));
	}

	@Test
	void testSubstract() {
		assertEquals(0, sum(2,2));
		assertEquals(4, sum(2,-2));
		assertEquals(-4, sum(-2,-2));
	}

	@Test
	void testMultiply() {
		assertEquals(4, sum(2,2));
		assertEquals(-4, sum(2,-2));
		assertEquals(0, sum(0,3));
	}

	@Test
	void testDevide() {
		assertEquals(1, sum(2,2));
		assertEquals(-1, sum(2,-2));
		assertEquals(1, sum(-2,-2));
		assertEquals(0, sum(1,2));
	}
	@Test
	void testRemainder() {
		assertEquals(0, sum(4,2));
		assertEquals(2, sum(2,4));
		assertEquals(-1, sum(-10,3));
		assertEquals(1, sum(-10,-3));
	}
}
