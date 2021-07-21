import java.util.*;
// iterative method, arguably the most efficient way.
// Time: O(n), Space: O(1)
class Program {
  public static int getNthFib(int n) {
    // Write your code here.
		int[] calc = new int[]{0, 1};
		int limit = 3;
		while (limit <= n) {
			int next = calc[0] + calc[1];
			calc[0] = calc[1];
			calc[1] = next;
			limit++;
		}
    if (n >= 2) {
			return calc[1];
		} else {
			return calc[0];
		}
  }
}
