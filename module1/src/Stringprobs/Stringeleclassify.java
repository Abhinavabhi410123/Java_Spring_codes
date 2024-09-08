package Stringprobs;

public class Stringeleclassify {

	public static void main(String[] args) {
		String s = "a man, a plan @ a canal? panama....";
		int countUC=0,countLC=0,countSC=0,countNU=0;
		for(int x=0;x<s.length();x++) {
			if(s.charAt(x)>='A'&&s.charAt(x)<='Z')
				countUC++;
			else if(s.charAt(x)>='a'&&s.charAt(x)<='z')
				countLC++;
			else if(s.charAt(x)>='0'&&s.charAt(x)<='9')
				countNU++;
			else 
				countSC++;
			
		}
		System.out.println(countUC+" uppercase letters");
		System.out.println(countLC+" lowercase letters");
		System.out.println(countSC+" special charecters");
		System.out.println(countNU+" numbers");
	}

}
