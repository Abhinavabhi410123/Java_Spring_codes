package Jarraysums;

public class Insertsortarr {

	public static void main(String[] args) {
		int arr1[] = {1,2,3,4,5,6};
		int arr2[] = {7,8,9,10};
		int l1 = arr1.length,l2=arr2.length, l3 = l1+l2,count1=0,count2=0;
		int arr3[] = new int[l3];
		for(int i=0,j=0,l=i+j;l<arr3.length;l++) {
			if(arr1[i]<arr2[j]) {
				count1++;
				arr3[l]= arr1[i];
				if(i<arr1.length)
				i++;
				else if(i==arr1.length-1 && j<arr2.length)
					j++;
			}
			else {
				count2++;
				arr3[l]=arr2[j];
				if(j<arr2.length)
					j++;
					else if(j==arr2.length && i<arr1.length)
						i++;
			}
		}
		for(int k:arr3)
			System.out.println(k);
	}

}
