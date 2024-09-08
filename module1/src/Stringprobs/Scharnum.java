package Stringprobs;

public class Scharnum {

	public static void main(String[] args) {
		String s = "a12b3c10",s2="";
		int j,num=0,count=1,sum=0;
		char c,c1;
		for(int i=0;i<s.length();i++) 
		{
			count=0;
			s2 = "";
			c = s.charAt(i);
			if(Character.isAlphabetic(c)) {
			for(j=i+1;j<s.length();) {
				if(Character.isDigit(s.charAt(j))) {
					count++;
				s2 = s2+s.charAt(j);
					j++;
				}
				else
					break;
			}
			num = Integer.valueOf(s2);
			sum = sum + num;
			
//			for(int k=0;k<num;k++) {
//				System.out.print(c);
//			}
			}
			}
		System.out.println(sum);
		}
	}	


