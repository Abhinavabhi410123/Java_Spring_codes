package Stringprobs;

public class Stringcasechange {

	public static void main(String[] args) {
		String s = "hEl@,.Lo",s1="";
		for(int x=0;x<s.length();x++) {
			if(s.charAt(x)>='A' && s.charAt(x)<='Z') {
				int b = (int)s.charAt(x)+32;
				s1 = s1+(char)b;
			}
			else if(s.charAt(x)>='a' && s.charAt(x)<='z') {
				int c = (int)s.charAt(x)-32;
				s1 = s1 +(char)c;
			}
		}
		System.out.println(s1);

	}

}
