package Stringprobs;

public class Stringcount {

	public static void main(String[] args) {
		String s = "a man,a plan@ a canal? panama hi...."+"\nhello all";
		int count=0,countw=0;
		for(int x=0;x<s.length();x++) {
			if(s.charAt(x)>='a'&&s.charAt(x)<='z')
				count++;
			if((int)s.charAt(x)==32||(int)s.charAt(x)==44)
				countw++;
		}
		System.out.println(count+" charecters");
		System.out.println(countw+" words");
		System.out.println();
	}

}
