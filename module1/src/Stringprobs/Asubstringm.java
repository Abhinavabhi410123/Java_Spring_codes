package Stringprobs;

public class Asubstringm {

	public static void main(String[] args) {
		String b = "abc";
		for(int x=0;x<b.length();x++) {
			System.out.println(b.substring(x,x+1));
		}
		for(int x=0;x<b.length()-1;x++) {
			for(int y=x+2;y<=b.length();y++) {
			System.out.print(b.substring(x,y));
			System.out.println();
			}
		}

	}

}
