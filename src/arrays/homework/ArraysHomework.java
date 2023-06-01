//TASK: to insert number in rught place in sorted already array
//LIMITS: No sort after inserting. Only binarySearch and arraycopy.

package arrays.homework;
import java.util.Arrays;

public class ArraysHomework {

	public static int[] insertNumberInSortedArray (int[] inputArray, int key) {
		int[] res = new int[inputArray.length+1]; //create aim array
		Arrays.sort(inputArray); //sorting array
			int keyIndex=-2; //if all array elements are bigger
			for (int i=0; i<=32767; i++) { //searching for the key element or closest smaller
				keyIndex = Arrays.binarySearch(inputArray, key-i); 
				//possible values 1 - key is first; n - key or closes smaller; -1 – all elements bigger;
				if (keyIndex > -1) break; //
			}
			if (keyIndex == -1) keyIndex = 0; //all elements bigger than key
			if (keyIndex == inputArray.length-1) keyIndex = inputArray.length; //all elements smaller than key
			System.arraycopy(inputArray, 0, res, 0, keyIndex);		
			res[keyIndex] = key;
			System.arraycopy(inputArray, keyIndex, res, keyIndex+1,res.length-1-keyIndex);	
		return res;
	}

}
