//TASK: to insert number in right place in already sorted array
//LIMITS: No sort after inserting. Only binarySearch and arraycopy.

package arrays.homework;
import java.util.Arrays;

public class ArraysHomework {
	public static int[] res;
	public static int keyIndex;
	
	public static int[] insertNumberInSortedArray (int[] inputArray, int key) {
		sortArray(inputArray);
		searchKey(inputArray, key);
		return insertNumber(inputArray,key,keyIndex);
	}
	
	public static int[] sortArray (int[] inputArray) {
		Arrays.sort(inputArray); //sorting array
		return inputArray; 
	}
	
	public static int searchKey (int[] inputArray, int key) {
		keyIndex = Arrays.binarySearch(inputArray, key); 
		if (keyIndex < 0) keyIndex = -(keyIndex + 1);
		return keyIndex; 
	}
	
	public static int[] insertNumber (int[] inputArray, int key, int keyIndex) {
		res = new int[inputArray.length+1]; //create aim array
		System.arraycopy(inputArray, 0, res, 0, keyIndex);	
		res[keyIndex] = key;
		System.arraycopy(inputArray, keyIndex, res, keyIndex+1,inputArray.length-keyIndex);	
		return res; 
	}

}
