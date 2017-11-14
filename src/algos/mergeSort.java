package algos;

import java.util.ArrayList;
import java.util.Arrays;


//INCORRECT YET
public class mergeSort {

	static public ArrayList<Integer> merge(ArrayList<Integer> arr, int p, int q, int r){
		ArrayList<Integer> Left = new ArrayList<Integer>(arr.subList(p, q));
		ArrayList<Integer> Right = new ArrayList<Integer>(arr.subList(q, r));
		
		
		System.out.println(Left+"\n"+Right);
		
		int lc=0; int rc=0;
		for(int count = 0 ; count<arr.size(); count++){
			System.out.println(arr);
			
			
			if( lc!=Left.size() && rc != Right.size() && Left.get(lc)<Right.get(rc)){
				arr.set(count, Left.get(lc));
				lc++;
			}else if ( rc != Right.size() && lc!=Left.size() && Left.get(lc)>=Right.get(rc)){
				arr.set(count, Right.get(rc));
				rc++;
			}
		}
		
		
		return arr;
	}
	
	static public void combine(ArrayList<Integer> arr, int p, int q){
		if(!(q-p<=1)){
			System.out.println("p: "+p+" q: "+q+" (p+q)/2: "+(p+q)/2);
			combine(arr, p, (p+q)/2);
			combine(arr, (p+q)/2, q);
			merge(arr, p, (p+q)/2, q);
		}
	}
	
	
	static public void main(String[] argv){
		ArrayList<Integer> arr= new ArrayList<Integer> (Arrays.asList(7,3,8,4,0,1,2));
		System.out.println(arr.toString());
		combine(arr,0,arr.size());
		System.out.println(arr.toString());
	}
}
