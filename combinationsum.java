import java.util.*;

public class combinationsum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(candidates);
        
        find(result, target, candidates, 0, new ArrayList<>());
        return result;
    }

    public void find(List<List<Integer>> result, int target, int[] candidates, int index, ArrayList<Integer> temp) {
        if (target == 0) {
            result.add(temp);
            System.out.println(result);
            return;
        }
        if (target < candidates[index]) {
            return;
        }

        for (int i = 0; i < candidates.length; i++) {
            temp.add(candidates[i]);
            find(result, target - candidates[i], candidates, index, temp);
            temp.remove(temp.size() - 1);

        }
    }
    public static void main(String[] args) {
        combinationsum test = new combinationsum();
        int[] testcand = new int[]{2, 3, 6, 7};
        int testtarg = 7;
        System.out.println(test.combinationSum(testcand, testtarg));

    }
}


/* 
Test Example
Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.
*/