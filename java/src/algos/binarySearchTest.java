package algos;

import java.util.Arrays;

public class binarySearchTest {

	public static void main(String[] args) {
		int[] arr = new int[] { 9, 46, 85, 12, 37, 94, 5, 6, 8, 4, 5, 6, 8, 9, -10, 5, 4, 7, 5, 2, 3, 99, 8, 855, -7,
				-827, 799, 10006 };
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int i = binarySearch(arr, 0, arr.length - 1, 6);

		if (i == -1)
			System.out.println("no such element");
		else
			System.out.println("found element at pos " + i);

	}

	private static int binarySearch(int[] arr, int i, int j, int target) {
		if (arr.length == 0)
			return -1;

		int mid = (i + j) / 2;

		if (arr[mid] == target)
			return mid;

		if (i == j)
			return -1;

		if (arr[mid] > target)
			return binarySearch(arr, i, mid, target);
		else
			return binarySearch(arr, mid + 1, j, target);

	}

}
