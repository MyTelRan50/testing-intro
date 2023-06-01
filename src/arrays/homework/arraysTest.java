package arrays.homework;

import static org.junit.jupiter.api.Assertions.*;
import static arrays.homework.ArraysHomework.*;

import org.junit.jupiter.api.Test;

class arraysTest {

	@Test
	void testInsertInMiddle() {
		int[] array = {1, 2, 3, 4};
		int[] expRes = {1, 2, 3, 3, 4};
		assertArrayEquals(expRes, insertNumberInSortedArray(array,3));
	}
	
	@Test
	void testInsertInBeginning() {
		int[] array = {2, 2, 3};
		int[] expRes = {1, 2, 2, 3};
		assertArrayEquals(expRes, insertNumberInSortedArray(array,1));
	}
	@Test
	void testInsertInEnd() {
		int[] array = {1, 2, 3, 4};
		int[] expRes = {1, 2, 3, 4, 5};
		assertArrayEquals(expRes, insertNumberInSortedArray(array,5));
	}
	@Test
	void testInsertNegative() {
		int[] array = {1, 2, 3, 4};
		int[] expRes = {-5,1, 2, 3, 4};
		assertArrayEquals(expRes, insertNumberInSortedArray(array,-5));
	}
	
	@Test
	void testOnlyNegatives() {
		int[] array = {-1, -2, -3, -4};
		int[] expRes = {-5,-4, -3, -2, -1};
		assertArrayEquals(expRes, insertNumberInSortedArray(array,-5));
	}
}
