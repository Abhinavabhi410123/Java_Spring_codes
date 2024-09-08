package Stringprobs;

public class Stringpalin2 {

	public static void main(String[] args) {
		String s = "a man, a plan @ a canal? panama....",s1="";
		for(int x=s.length()-1;x>=0;x--) {
			if((s.charAt(x)>='a')&&(s.charAt(x)<'z')||(s.charAt(x)>='A')&&(s.charAt(x)<='Z')) {
				s1 = s1+s.charAt(x);
			}
		}
		StringBuffer sb = new StringBuffer(s1);
		sb.reverse();
		String s3 = sb.toString();
		System.out.println(s3+" string buffer");
		//System.out.println(s1);
		//System.out.println(sb);
		if(s1.contentEquals(sb))
				System.out.println("palindrome");
		else
			System.out.println("not a palindorme");
	}

}
