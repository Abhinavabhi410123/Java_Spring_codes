package Stringprobs;

public class Psubstrings {

	public static void main(String[] args) {
		String s = "abcd";
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		for(int i=0;i<s.length()-1;i++) {
			for(int j=i;j<=i+1;j++) {
				System.out.print(s.charAt(j));
			}
			System.out.println();
		}

	}

}
