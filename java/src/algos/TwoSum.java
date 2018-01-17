package algos;

import java.util.HashMap;

public class TwoSum {

	public static void FindTarget(int[] arr, int target) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (hm.containsKey(target - arr[i])) {
				System.out.println(hm.get(target - arr[i]) + " + " + i + " = " + target);
			} else {
				hm.put(arr[i], i);
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 4, 42, 15, 97, 43, 31, 5, 59, 16, 73 };
		int target = 102;
		FindTarget(arr, target);
	}

}
