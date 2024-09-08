package Stringprobs;

public class Stringnumadd {

	public static void main(String[] args) {
		String s = "hello 12 and 123 @ 136",s2="";
		int num=0,sum=0,j;
		s2.
		for(int i=0;i<s.length();i++) {
			s2 = "";//12
			if(!(Character.isDigit(s.charAt(i)))) {
				continue;	
		}
		else {
			for( j=i;j<s.length()&&Character.isDigit(s.charAt(j));j++) {
				s2 = s2 + s.charAt(j);
			}
			i=j;
			num = Integer.valueOf(s2);
			//System.out.println(num+"num");
			sum = sum +num;
		}
	}
		System.out.println(sum);
	}
}
