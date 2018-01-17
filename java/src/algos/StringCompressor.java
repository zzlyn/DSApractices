package algos;

public class StringCompressor {

	public String compress(String orig) {
		if(orig == null)
			return null;
		
		StringBuilder sb = new StringBuilder();

		int i = 0;
		while (i < orig.length()) {

			char anchor = orig.charAt(i);
			int count = 0;
			while (i < orig.length() && orig.charAt(i) == anchor) {
				i++;
				count++;
			}
			sb.append(anchor + Integer.valueOf(count).toString());
		}
		return sb.toString();

	}

	public static void main(String[] argv) {
		StringCompressor sc = new StringCompressor();
		String test = "zzzddq";
		System.out.println("Compressing " + test + " ....");
		System.out.println("Compressed: " + sc.compress(test));
	}

}
