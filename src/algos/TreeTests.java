package algos;

import java.util.Stack;

import ds.TreeNode;

public class TreeTests {

	private static void preOrderDFS(TreeNode root) {
		if (root == null)
			return;
		Stack<TreeNode> stk = new Stack<TreeNode>();
		stk.push(root);
		while (!stk.empty()) {
			TreeNode temp = stk.pop();
			System.out.println(temp.data + " ");
			if (temp.right != null)
				stk.push(temp.right);
			if (temp.left != null)
				stk.push(temp.left);
		}
	}
	

	public static void main(String[] args) {
		TreeNode si = new TreeNode(4, null, null);
		TreeNode wu = new TreeNode(5, null, null);
		TreeNode liu = new TreeNode(6, null, null);
		TreeNode qi = new TreeNode(7, null, null);
		TreeNode er = new TreeNode(2, si, wu);
		TreeNode san = new TreeNode(3, liu, qi);
		TreeNode yi = new TreeNode(1, er, san);
		preOrderDFS(yi);
	}

}
