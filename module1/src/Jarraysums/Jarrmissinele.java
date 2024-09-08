package Jarraysums;

public class Jarrmissinele {

	public static void main(String[] args) {
		int arr1[]=new int[]{1,2,3,4,5,7,9,10};
		int arr2[]=new int[]{4,5,6,7,8,9,10,11,12,13,14,15};
		int count1 = arr1.length,count2 = arr2.length;
		int arr3[]= new int[arr1.length+arr2.length];
		for(int i=0,j=0,k=i+j;k<arr3.length;k++){
		    if(i<arr1.length && j<arr2.length){
		    if(arr1[i]<=arr2[j]){
		        count1--;
		    arr3[k]=arr1[i];
		    i++;
		    }
		    else{
		        count2--;
		        arr3[k]=arr2[j];
		        j++;
		    }
		    }
		     else{
		        if(count1==0 && count2>0){
		        arr3[k]=arr2[j];
		        j++;
		        }
		        else if(count2==0 && count1>0){
		        arr3[k]=arr1[i];
		        i++;
	}	        
}
		    System.out.print(arr3[k]+" ");
}
//		for(int t:arr3)
//			System.out.print(t+" ");
	}
}