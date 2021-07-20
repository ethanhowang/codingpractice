import java.util.*;

class Program {
  public static int binarySearch(int[] array, int target) {
    // Write your code here.
		// method: find the middle element, compare, if greater, recursively call on upper half
		// of the array, else call on lower half of the array
		return binarySearch(array, target, 0, array.length - 1); 
		
  }
	
	public static int binarySearch(int[] array, int target, int start, int end) {
		if (start > end) {
			return -1;
		}
		int middle = (start + end) / 2;
		int potentialMatch = array[middle];
		if (potentialMatch == target) {
			return middle;
		} else if (target > potentialMatch) {
			return binarySearch(array, target, middle + 1, end);
		} else {
			return binarySearch(array, target, start, middle - 1);
		}
	}
	
}
