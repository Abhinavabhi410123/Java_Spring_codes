package Stringprobs;

public class Stringpro {

	public static void main(String[] args) {
		String s = "Hello this is the codinghub user";
		int l=s.length();
		int mid=l/2;
		String arr[]=s.split(" ");
		String temp ;
		StringBuffer sb = new StringBuffer();
		temp=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=temp;
		temp="";
	for(int i=1;i<arr.length-1;i++) {
		sb.delete(0, arr[i].length());
			if(i%2!=0) {
				sb.append(arr[i]);
				sb.reverse();
				arr[i]="";
				arr[i]=arr[i]+sb;
			}
		}
	for(int i=1;i<=(arr.length-2)/2+1;i++) {
		temp = arr[i];
		arr[i]=arr[arr.length-i-1];
		arr[arr.length-i-1]=temp;
		}
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	}

}
