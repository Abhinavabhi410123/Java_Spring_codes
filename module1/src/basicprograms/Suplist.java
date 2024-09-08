package basicprograms;
import java.util.*;
public class Suplist {

	public static void main(String[] args) {
		System.out.println("Enter range");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(),count=n,a=2,count2=0;
		List <Integer> list = new LinkedList<Integer>();
		for(int i=1;i<=n;i++) {
			list.add(i);
		}
		for(int i=0;i<list.size() && a<=list.size() ;i++) {
			count2++;
			if(count2==a) {
				System.out.println(list.get(i)+"removal values");
				list.remove(i);
				i = i-1;
				count2=0;
				count = count-1;
			}
			if(i==list.size()-1 && a<count ) {
				i=0;
				a++;
			}
		}
		list.remove(list.size()-1);
		for(int i=0;i<list.size();i++)
			System.out.println(list.get(i));
	}

}
