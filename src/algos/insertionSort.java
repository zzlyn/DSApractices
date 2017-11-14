package algos;

import java.util.Arrays;

public class insertionSort {
	
	public static int[] ISORT(int[] arr_){
		int arr[] = new int[arr_.length];
		System.arraycopy(arr_, 0, arr, 0, arr_.length);
		
		int js=1;
		for(;js<arr.length;js++){
			int j=js;
			int key = arr[j];
			int i=j-1;
			while(i!=-1 && arr[i]>key){
				arr[j] = arr[i];
				i--;
				j--;
			}
			arr[j]=key;
		}
		
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		//int[] arr = new int[]{2,5,6,1,4};
		int[] arr2 = new int[]{10,9,19};
		System.out.println(Arrays.toString(arr2)+"\n"+Arrays.toString(ISORT(arr2)));
	}

}
