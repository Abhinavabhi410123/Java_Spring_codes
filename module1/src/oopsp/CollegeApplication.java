package oopsp;
import java.util.Scanner;
public class CollegeApplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//University u = new University();
		//Ug g = new Ug();
		Bsc b = new Bsc();
		Pg p = new Pg();
		
		Btech bt = new Btech();
		Mtech mt  = new Mtech();
		Msc m = new Msc();
		College c = new College();
		System.out.println("welcome to "+b.name+" college under university "+b.uname);
		System.out.println("choose your latest qualification 1.Intermediate 2.UG");
		String s = sc.next(),s1="Intermediate",s2 = "UG";
		if(s.equalsIgnoreCase(s1)) {
			b.display();
			s = sc.next();
		}
		else if(s.equalsIgnoreCase(s2)) {
			p.display();
			s = sc.next();
		}
		System.out.println("you choosed "+s);
		switch(s){
			case "bsc":
				b.courses(s);
				break;
			case "btech":
				bt.courses(s);
				break;
			case "msc":
				m.courses(s);
				break;
			case "mtech":
				mt.courses(s);
				break;
			default:
				System.out.println("please enter a valid course");
		}
	}
}

class University{
	Scanner sc = new Scanner(System.in);
String uname = "JNTU";
}
class College extends University{
String name = "Cmr";
}
class Ug extends College{
	int fees = 100000,rank;
	String a = "";
	String course1 = "";
	String course2 = "";
	String course3 = "";
	String course4 = "";
	void display() {
		System.out.println("congrats on passing 12th exams, please select between B.sc or B.tech");
	}
	int finalfees ;
	void courses(String s) {
		CollegeApplication ca = new CollegeApplication();
		int choices;
		System.out.println("Courses available for "+ s +" are"+"\n"+course1+"\n"+course2+"\n"+course3+"\n"+course4);
		choices = sc.nextInt();
		System.out.println("please enter your eamcet rank");
		rank = sc.nextInt();
		if(rank<=10000) {
			System.out.println("50% fees scholarship");
			finalfees = fees-fees/2;
		}
		else if(rank <=20000) {
			System.out.println("20% fees scholarship");
			finalfees = fees - fees/5;
		}
		else
			System.out.println("no scholarship");
		
		switch(choices) {
		case 1:
			p();
			break;
		case 2:
			c();
			break;
		case 3:
			m();
			break;
		case 4:
			co();
			break;
		default:
			System.out.println("choose between given courses");
		}
	}
		void p() {
			System.out.println("you have choosen "+course1+"  with fees: "+ finalfees);
			System.out.println("Thank you for choosing our college");
		}
		void c() {
			System.out.println("you have choosen "+course2+"  with fees: "+finalfees);
			System.out.println("Thank you for choosing our college");
		}
		void m() {
			System.out.println("you have choosen "+course3+" with fees :"+finalfees);
			System.out.println("Thank you for choosing our college");
		}
		void co() {
			System.out.println("you have choosen "+course4+"with fees: "+finalfees);
			System.out.println("Thank you for choosing our college");
		}
}

class Pg extends College{
	String course1 ;
	String course2 ;
	String course3 ;
	String course4 ;
	int fees = 100000,rank,finalfees ;;
	String a = "";
	void display() {
		System.out.println("congrats on passing UG , please select between M.sc or M.tech");
	}
	
	void courses(String s) {
		System.out.println("Courses available for are "+s+" "+course1+" "+course2+" "+course3+" "+course4+" "+"\nplease choose a course");
		int choices;
		choices  = sc.nextInt();
		System.out.println("please enter your Gate rank");
		rank = sc.nextInt();
		if(rank<=10000) {
			System.out.println("50% fees scholarship");
			finalfees = fees-fees/2;
		}
		else if(rank <=20000) {
			System.out.println("20% fees scholarship");
			finalfees = fees - fees/5;
		}
		else
			System.out.println("no scholarship");	
		switch(choices) {
		case 1:
			cse();
			break;
		case 2:
			ece();
			break;
		case 3:
			eee();
			break;
		case 4:
			mech();
			break;
		default:
			System.out.println("choose between given courses");
		}
	}
		void cse() {
			System.out.println("you have choosen "+course1+" with fees: "+ finalfees);
			System.out.println("Thank you for choosing our college");
		}
		void ece() {
			System.out.println("you have choosen "+course2+" with fees: "+finalfees);
			System.out.println("Thank you for choosing our college");
		}
		void eee() {
			System.out.println("you have choosen "+course3+" with fees :"+finalfees);
			System.out.println("Thank you for choosing our college");
		}
		void mech() {
			System.out.println("you have choosen "+course4+" with fees :"+finalfees);
			System.out.println("Thank you for choosing our college");
		}
	}


class Bsc extends Ug
{
	Bsc()
	{
	super.course1="bsc Physics";
	super.course2="bsc Chemistry";
	super.course3="bsc maths";
	super.course4="bsc computers";
	}
}

//	String course1 = "bsc Physics";
//	String course2 = "bsc Chemistry";
//	String course3 = "bsc maths";
//	String course4 = "bsc computers";


class Btech extends Ug{
	Btech(){
	 super.course1 = "cse";
	 super.course2 = "ece";
	 super.course3 = "eee";
	 super.course4 = "mech";
	}
	}
class Mtech extends Pg{
	Mtech(){
	super.course1 = "cse";
	super.course2 = "ece";
	super.course3 = "eee";
	super.course4 = "mech";
	}
	}
		

class Msc extends Pg{
	Msc(){
	super.course1 = "msc Physics";
	super.course2 = "msc Chemistry";
	super.course3 = "msc maths";
	super.course4 = "msc computers";
	}
}
	
