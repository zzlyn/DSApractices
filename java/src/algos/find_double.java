package algos;
import java.util.*;

public class find_double {
	
	public static int find(ArrayList<Integer> arr){
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		for(int k=0; k<arr.size(); k++){
			if(ht.get(arr.get(k))!=null)
				return arr.get(k);
			
			ht.put(arr.get(k), arr.get(k));
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr = new ArrayList<Integer>(Arrays.asList(4,5,6,7,8,9,6));
		System.out.println(find(arr));
		
	}

}
