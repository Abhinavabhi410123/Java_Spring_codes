package Jarraysums;

public class Mixsortarr {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5,6};
		int[] arr2 = {4,6,8,10};
		int[] arr3 = new int[arr1.length+arr2.length];
		boolean k;
		for(int j=0,i=0,l=i+j;l<arr3.length ;l++) {
			//System.out.println(i+j+" total value");
			k = (arr1[i]<arr2[j] && (i<arr1.length-1));
			arr3[l]=(k)?arr1[i]:arr2[j];
			//System.out.println(l+"enterred values");
			if(k) {
				//System.out.println(i+"ivalue"+"\n");
				if(i<arr1.length) {
					i++;
				}
			}
			else
				if(j<arr2.length) {
					j++;
					//System.out.println(j+"j values"+"\n");
					if(j>arr2.length-1)
						break;
					
				}
		}
		for(int t:arr3)
			System.out.println(t);

	}

}
