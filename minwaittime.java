import java.util.*;

class Program {

  public int minimumWaitingTime(int[] queries) {
    // Write your code here.
		// better way to add
		Arrays.sort(queries);
		
		int waitTime = 0;
		for (int i = 0; i < queries.length - 1; i++) {
			waitTime += (queries.length - 1 - i) * queries[i];
		}
		
    return waitTime;
  }
}
