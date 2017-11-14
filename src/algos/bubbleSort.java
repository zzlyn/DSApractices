package algos;

import java.util.ArrayList;
import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		Boolean sorted = false;
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(3,20,0,1));
		
		while(!sorted){
			Boolean std = true;
			
			for(int p1=0; p1<arr.size()-1; p1++){
				if(arr.get(p1)>arr.get(p1+1)){
					Integer key = arr.get(p1+1);
					arr.set(p1+1, arr.get(p1));
					arr.set(p1, key);
					std = false;
				}
			}
			
			sorted = std;
		}
		
		System.out.println(arr.toString());
		

	}

}
