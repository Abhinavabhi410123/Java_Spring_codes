package Stringprobs;

public class Subpalin {

		public static boolean isPalindrome(String s) {
			int len=s.length();
			for(int j=0;j<len/2;j++) {
				if(s.charAt(j)!=s.charAt(len-j-1)) {
					return false;
				}
			}
			return true;
		}
		public static void main(String[] args) {
			String s = "himadamaaaanew",s2="",smax="";
			int count=0,len=0,fi=0,li=0,score=0,max=0;
			boolean b=false;
			for(int i=0;i<s.length();i++) {
//				if(s.indexOf(s.charAt(i))!=s.lastIndexOf(s.charAt(i))) 					
					for(int z=s.length();z>i;z--) {
						fi = i;
						li = z;
						s2 = s.substring(fi,li);
						len = s2.length();
						
						if(isPalindrome(s2) && s2.length()>1)
						{
								if(max<s2.length())
								{
									max = s2.length();
									smax = s2;
								}
								
						}
						
					}
			}
			System.out.println(smax);
		
		
		}

	}


