import java.util.*;

class 2sum {
  public static int[] twoNumberSum(int[] array, int targetSum) {
    // Write your code here.
		/* brute force: double for loop check every pair
		*/
		/* use the water tank method*/
		
		HashSet<Integer> lookup = new HashSet<Integer>();
		
		for (int j = 0; j < array.length; j++) {
			int cand = targetSum - array[j];
			if (lookup.contains(cand)) {
				return new int[]{cand, array[j]};
			} else {
				lookup.add(array[j]);
			}
		}
		
    return new int[]{};
  }

  public static void main(String[] args) {
	  System.out.println("This is a working solution");
  }
}
