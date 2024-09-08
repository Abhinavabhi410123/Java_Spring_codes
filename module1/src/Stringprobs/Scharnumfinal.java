package Stringprobs;

public class Scharnumfinal {

		public static void main(String[] args) {
			String s = "a12b23c11",s2="";
			s.
			int num=0,sum=0,j;
			char c;
			for(int i=0;i<s.length();i++) {
				s2 = "";//12
				num=0;
				if(!(Character.isDigit(s.charAt(i)))) {
					continue;	
			}
			else {
				c = s.charAt(i-1);
				for( j=i;j<s.length()&&Character.isDigit(s.charAt(j));j++) {
					s2 = s2 + s.charAt(j);
				}
				i=j;
				num = Integer.valueOf(s2);
				for(int k=0;k<num;k++) {
					System.out.println(c);
				}
				//System.out.println(num+"num");
				//sum = sum +num;
			}
		}
			//System.out.println(sum);
		}

	}


