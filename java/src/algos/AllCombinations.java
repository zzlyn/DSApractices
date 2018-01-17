package algos;

import java.util.ArrayList;
import java.util.List;

public class AllCombinations {

	public static List<List<Integer>> combine(int n, int k) {
		ArrayList<List<Integer>> result = new ArrayList<List<Integer>>();
		backTrackComb(result, new ArrayList<Integer>(), 1, n, k);
		return result;
	}

	public static void backTrackComb(List<List<Integer>> result, List<Integer> current, int start, int n, int k) {
		if (k == 0) {
			result.add(new ArrayList<Integer>(current));
			return;
		}

		for (int i = start; i <= n; i++) {
			current.add(i);
			backTrackComb(result, current, i + 1, n, k - 1);
			current.remove(current.size() - 1);
		}

	}

	public static void main(String[] args) {
		System.out.println(combine(6, 2).toString());
	}

}
