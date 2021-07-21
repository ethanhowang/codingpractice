import java.util.*;

class Program {
  // This is the class of the input root. Do not edit it.
  public static class BinaryTree {
    int value;
    BinaryTree left;
    BinaryTree right;

    BinaryTree(int value) {
      this.value = value;
      this.left = null;
      this.right = null;
    }
  }

  public static List<Integer> branchSums(BinaryTree root) {
    // Write your code here.
		ArrayList<Integer> result = new ArrayList<Integer>();
		
    branchSumsHelper(root, root.value, result);
		
		return result;
  }
	
	public static void branchSumsHelper(BinaryTree node, int currSum, ArrayList<Integer> result) {
		if (node.left != null) {
			branchSumsHelper(node.left, currSum + node.left.value, result);
		}
		if (node.right != null) {
			branchSumsHelper(node.right, currSum + node.right.value, result);
		}
		if (node.right == null && node.left == null) {
			result.add(currSum);
		}
	}
}
