package Stringprobs;

public class Smaxvowels {

	public static void main(String[] args) {
		String s = "hi good morningiii all how are you";
		String s2 = "";
		StringBuffer sb=new StringBuffer();
						//s3=	"1    2      6       2   1    2   2      ";
		String arr[]= s.split(" ");
		int arr1[]=new int[arr.length];
		char[] temp=new char[10];
		int count=0,max=0;
		for(int i=0;i<arr.length;i++) {
			count=0;
			temp =arr[i].toCharArray();
			for(int j=0;j<temp.length;j++) {
				if (temp[j] == 'a' || temp[j] == 'e' || temp[j] == 'i' || temp[j] == 'o' || temp[j] == 'u' ||
					    temp[j] == 'A' || temp[j] == 'E' || temp[j] == 'I' || temp[j] == 'O' || temp[j] == 'U') {
				count++;	
				arr1[i]=count;
				}	
			}
			if(max<arr1[i])
				max=count;
		}
		for(int k=0;k<arr.length;k++) {
			if(arr1[k]==max)
				System.out.println(arr[k]+" max vowels word "+max);
		}

	}

}
