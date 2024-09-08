package Stringprobs;

public class Stringcase {

	public static void main(String[] args) {
		String s1 = "hElL@,o";
		String s2="";
		for(int x=0;x<s1.length();x++) {
			if(s1.charAt(x)>='A' && s1.charAt(x)<='Z') {
				int b = (int)s1.charAt(x)+32;
				s2 = s2+(char)b;
			}
			else if(s1.charAt(x)>='a' && s1.charAt(x)<='z'){
				s2 = s2+s1.charAt(x);
			}
		}
		System.out.println(s2);
	}

}
