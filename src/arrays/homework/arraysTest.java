package arrays.homework;

import static org.junit.jupiter.api.Assertions.*;
import static arrays.homework.ArraysHomework.*;

import org.junit.jupiter.api.Test;

class arraysTest {
	
	@Test
	void insertNumberTest() {
		int[] array = {1,2,3,4};
		int[] expRes = {1,2,5,3,4};
		assertArrayEquals(expRes, insertNumber(array,5,2));
	}
	
	@Test
	void searchKeyTest() {
		int[] array = {1,2,3,4};
		int expNum = 1;
		assertEquals(expNum, searchKey(array,2));
	}

@Test
void sortArrayTest() {
	int[] array = {1,4,3,1};
	int[] exp = {1,1,3,4};;
	assertArrayEquals(exp, sortArray(array));
}

@Test
void insertNumberInSortedArrayTest() {
	int[] array = {1, 2, 4, 8};
	int[] exp = {1, 2, 4, 5, 8};
	assertArrayEquals(exp, insertNumberInSortedArray(array,5));
}

}