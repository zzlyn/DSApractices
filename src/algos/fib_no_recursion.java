package algos;

public class fib_no_recursion {

	public static void dpFib(int k) {
		if (k == 1) {
			System.out.println(1);
			return;
		}

		int[] dp = new int[k];

		dp[0] = 1;
		dp[1] = 2;

		for (int i = 2; i < k; i++) {
			dp[i] = dp[i - 2] + dp[i - 1];
		}

		System.out.println(dp[k-1]);
	}

	public static int fib(int k) {
		int a = 0;
		int b = 1;
		if (k == 1)
			return a;
		if (k == 2)
			return b;
		int j = 3;
		int res = 0;
		while (j <= k) {
			res = a + b;
			a = b;
			b = res;
			j++;
		}
		return res;
	}

	public static void main(String[] args) {
		dpFib(10);

	}

}
