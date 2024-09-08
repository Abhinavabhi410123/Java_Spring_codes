package Stringprobs;

public class Stringrep {

	public static void main(String[] args) {
		String s = "hi good morning , good good morning morning ";
		StringBuffer sb = new StringBuffer(s);
		String[] arr = s.split(" ");
		StringBuffer sb1 = new StringBuffer();
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(sb.indexOf(arr[i])!=sb.lastIndexOf(arr[i])) {
					if(sb1.indexOf(arr[i])==-1) {
						count++;
						sb1.append(arr[i]);
					}
			}
		}
		System.out.println(sb1+" no of repeated words are"+count);
	}

}
