package Stringprobs;

public class Stringupdate {

	public static void main(String[] args) {
		String s = "<<<>>";
		String s2 = "hello";
		String s1 = "";
		int l;
		if(s.length()%2==0)
		{
			l=s.length()/2;
		}
		else
			l=s.length()/2+1;
		//System.out.println(l+"l value");
		for(int i=0;i<l;i++) {
			s1 = s1+s.charAt(i);
		}
		s1 = s1+s2;
		for(int j=s.length()/2;j<s.length();j++)
			s1 = s1+s.charAt(j);
		
		System.out.println(s1);
	}
	

}
