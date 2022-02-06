package LongestRepeatingSequence;

/*public class LongestRepeatingSequence {
	//Checks for the largest common prefix
	public static String Icp(String s, String t) {
		int n = Math.min(s.length(),t.length());
		for(int i=0; i<n; i++) {
			if(s.charAt(i)!=t.charAt(i)) {
				return s.substring(0,i);
			}
		}
		return s.substring(0,n);
	}

	public static void main(String[] args) {
		String str = "acbdfghybdfahrabdf";
		String lrs = "";
		int n = str.length();
		for(int i=0; i<n; i++) {
			for(int j=0; j<n;j++) {
				//Checks for the largest common factors in every substring
				String x = lcp[str.substring(i,n),str.substring(j,n)];
				//if the current prefix is greater than previous one
				//then it takes the current one as longest repeating sequence
				if(x.length()>lrs.length()) lrs = x;
			}
		}

	}

}*/

public class removeWhiteSpace{
	public static void main(String [] args) {
		String str1 = "Remove white spaces";
		//Removes the white spaces using regex
		str1 = str1.replaceAll("\\s+", "");
		System.out.println("String after removing all the white space: "+ str1);
	}
}
