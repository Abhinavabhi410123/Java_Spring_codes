package Stringprobs;

public class Psubstrings2 {

	public static void main(String[] args) {
		String s = "abc";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<=s.length();j++) {
				if(!s.substring(i,j).equals(s))
				System.out.println(s.substring(i,j));
			}
		}
	}

}
