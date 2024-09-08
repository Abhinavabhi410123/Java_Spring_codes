package Stringprobs;

public class Stringwordlen {

	public static void main(String[] args) {
		String s = "hi good morning everyone everyoneeeee";
		String arr[] = s.split(" ");
		String maxl = "";
		int length=0,max = Integer.MIN_VALUE;
		for(int x=0;x<arr.length;x++) {
			maxl="";
			length = arr[x].length();
			if(max<length) {
				max = length;
				maxl = maxl+arr[x];
			}
		}
		System.out.println(max);
		System.out.println(maxl);
	}

}
