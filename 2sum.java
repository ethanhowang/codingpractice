import java.util.*;

class 2sum {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		/* brute force: double for loop check every pair
		*/
		/* use the water tank method*/
        /* This method takes in an integer array and an integer target. If there are a pair of integers
        in the array that sum to the target integer, it will return the array of the two integers. Otherwise,
        it would just return an empy array*/
		
		Hashtable<Integer, Integer> lookup = new Hashtable<Integer, Integer>();
		
		
		for (int i : array) {
			lookup.put(i, i);
		}
		
		for (int j = 0; j < array.length; j++) {
			if (lookup.contains(targetSum - array[j]) && (targetSum - array[j] != array[j])) {
				return new int[]{targetSum - array[j], array[j]};
			}
		}
		
    return new int[]{};
  }

  public static void main(String[] args) {
      System.out.println("True");
      }
}

    