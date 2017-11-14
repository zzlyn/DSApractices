package algos;

import java.util.Arrays;
import java.util.Random;

public class Sortings {

	// Merge Sort

	public static void merge(int[] arr, int[] aux, int low, int mid, int high) {

		for (int i = low; i <= high; i++) {
			aux[i] = arr[i];
		}

		int l = low;
		int m = mid + 1;
		for (int k = low; k <= high; k++) {
			if (l > mid) {
				arr[k] = aux[m++];
				continue;
			}

			if (m > high) {
				arr[k] = aux[l++];
				continue;
			}

			if (aux[l] <= aux[m]) {
				arr[k] = aux[l];
				l++;
			} else {
				arr[k] = aux[m];
				m++;
			}
		}

	}

	static public void mSort(int[] arr, int[] aux, int low, int high) {
		if (low == high) {
			return;
		}

		int mid = (low + high) / 2;

		mSort(arr, aux, low, mid);
		mSort(arr, aux, mid + 1, high);

		merge(arr, aux, low, mid, high);

	}

	// Quick Sort

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = low;
		int l = low;
		int h = high;

		low = low + 1;

		while (true) {

			while (arr[low] <= arr[pivot]) {
				if (low == h)
					break;
				low++;
			}

			while (arr[high] >= arr[pivot]) {
				if (high == l)
					break;
				high--;
			}

			if (low < high) {
				swap(arr, low, high);
			}else{
				break;
			}

		}
		swap(arr, high, pivot);
		return high;
	}

	public static void qSort(int[] arr, int low, int high) {
		if (low >= high)
			return;

		int p = partition(arr, low, high);

		qSort(arr, low, p - 1);
		qSort(arr, p + 1, high);

	}

	public static int[] generateRandomIntArray() {

		int[] newArr = new int[new Random().nextInt(30)];
		for (int c = 0; c < newArr.length; c++) {
			newArr[c] = new Random().nextInt(50);
		}
		return newArr;
	}

	public static void main(String[] args) {
		int[] aa = { 3, 6, 1, 123, -10, 52, 1, 12, 0, 2, 7, 1, 16, 1 };
		int[] aux = new int[aa.length];

		mSort(aa, aux, 0, aa.length - 1);

		int[] arr = generateRandomIntArray();
		System.out.println("Before: " + Arrays.toString(arr));
		qSort(arr, 0, arr.length - 1);
		System.out.println("After: " + Arrays.toString(arr));

	}

}
