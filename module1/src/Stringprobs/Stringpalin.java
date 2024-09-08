package Stringprobs;

public class Stringpalin {

	public static void main(String[] args) {
		String s1 = "amanaplanacanalpanama";
		int count=0;
		for(int x =0,y=s1.length()-1;x<(s1.length())/2;x++,y--) {
			if(s1.charAt(x)==s1.charAt(y)) {
				count++;
				continue;
			}
			else
				break;
		}
		if(count==s1.length()/2)
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");

	}

}
