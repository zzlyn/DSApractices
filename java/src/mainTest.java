import java.util.Scanner;

import ds.ListNode;
import ds.MySingleton;
import ds.MyStack;

public class mainTest {

	public static void mySingletonTest() {
		MySingleton ms = MySingleton.getInstance();
		MySingleton ms2 = MySingleton.getInstance();

		System.out.println(ms.hashCode() + ":" + ms2.hashCode());

		Object k = new Object();
		Object k2 = new Object();

		System.out.println(k.hashCode() + ":" + k2.hashCode());

	}

	@SuppressWarnings("resource")
	public static void myStackTest() {
		MyStack ms = new MyStack(10);
		while (true) {
			String s = new Scanner(System.in).nextLine();

			if (s.equals("p")) {

				int i = new Scanner(System.in).nextInt();
				ms.stackPush(i);

			}
			
			
			if(s.equals("pop")){
				ms.pop();
			}
			
			
			
			System.out.println(ms.toString());

		}
	}
	
	static public void setNow(ListNode node){
        node = null;
    }
    
    
	public static void listNodePBRtest(){
		ListNode head = new ListNode(1);
		ListNode two = new ListNode(2);
		head.next = two;
		@SuppressWarnings("unused")
		ListNode three = new ListNode(3);

		System.out.println(head);
		setNow(head);
		System.out.println(head);
		
	}
	
	public static void main(String[] args) {

		listNodePBRtest();
	}

}
