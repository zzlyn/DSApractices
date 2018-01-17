package ds;


public class MyStack {

	private int capacity;
	private int size;
	private int[] arr;
	private int back;

	public MyStack(int c) {
		capacity = c;
		size = 0;
		arr = new int[c];
		back = -1;
	}

	public void stackPush(int n) {

		if (size == capacity) {
			System.out.println("Full Stack!");
			return;
		}

		back++;
		arr[back] = n;
		size++;
	}

	public void pop() {
		if (size == 0) {
			System.out.println("Empty Stack!");
			return;
		}
		back--;
		size--;
	}

	@Override
	public String toString() {

		String s = "[";
		for (int i = 0; i <= back; i++) {
			s += arr[i] + ", ";
		}
		s += "]";
		return s;
	}

}
