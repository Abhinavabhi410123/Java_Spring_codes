package Stringprobs;

public class Stringnum {

	public static void main(String[] args) {
		String s = "hello 12 and 123 @ 136",s2="";
		int num=0,sum=0;
		char c = ' ';
		for(int i=0,j=i;i<s.length()-1;i++) {//12
			
			if(!(Character.isDigit(s.charAt(i)))) 
			{
				continue;	
		}
		else {
			if(i<s.length()&&Character.isDigit(s.charAt(i)))
			{
				if(Character.isDigit(s.charAt(i+1)))
				{
					if(i==s.length()-2) 
					{
						s2 = s2 + s.charAt(i);
					s2 = s2 + s.charAt(i+1);
					}
					else
						s2 = s2 + s.charAt(i);
				}
				else 
				{
					num = Integer.valueOf(s2);
					//System.out.println(num);
					sum = sum+num;
				}
			
					
			}
			
			//System.out.println(s2);
			//num = Integer.valueOf(s2);
			//System.out.println(num+"num");
			//sum = sum +num;
		}
	}
		
		//System.out.println(s2+"string);
		System.out.println(sum);
	}
	}


