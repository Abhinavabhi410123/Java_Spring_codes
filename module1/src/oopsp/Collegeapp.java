package oopsp;
import java.util.Scanner;
public class Collegeapp 
{
public static void main(String[] args) {
		// sc = new Scanner(System.in);
		Selection se= new Selection();
		se.display();
	}
}

class University1{
Scanner sc = new Scanner(System.in);
String uname = "JNTU";
}
class College1 extends University1{
String name = "Cmr";

void display() {
	System.out.println("welcome to "+name+" college under university "+uname);
	System.out.println("choose your latest qualification 1.Intermediate 2.UG");
}
}
class Selection extends College1{
	int x ;
	Ug1 u = new Ug1();
	Pg1 p = new Pg1();
	void display() {
		super.display();
		x = sc.nextInt();
		if(x==1) {
			u.display();
		}
		else if(x==2) {
			p.display();
		}
	}
}
class Ug1 extends College1{
	int fees = 100000,rank;
	int y ;
	String course1 = "";
	String course2 = "";
	String course3 = "";
	String course4 = "";
	void display() {
		System.out.println("congrats on passing 12th exams, please select between B.sc or B.tech");
		y = sc.nextInt();
		if(y==1) {
			Bsc1 b = new Bsc1();
			b.courses();
		}
		else if(y==2) {
			Btech1 bt = new Btech1();
			bt.courses();
		}
	}
	int finalfees ;
	void courses() {
		//CollegeApplication ca = new CollegeApplication();
		int choices;
		System.out.println("Courses available for  are"+"\n"+course1+"\n"+course2+"\n"+course3+"\n"+course4);
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

class Pg1 extends College1{
	String course1 ;
	String course2 ;
	String course3 ;
	String course4 ;
	
	int fees = 100000,rank,finalfees ;;
	int b ;
	
	void display() {
		System.out.println("congrats on passing UG , please select between M.sc or M.tech");
		b = sc.nextInt();
		if(b==1)
		{
			Msc1 m = new Msc1();
			m.courses();
		}
		else if(b==2) {
			Mtech1 mt = new Mtech1();
			mt.courses();
		}
			
		else
			System.err.println("enter correct values");
	}
	
	void courses() {
		System.out.println("Courses available for are  "+course1+" "+course2+" "+course3+" "+course4+" "+"\nplease choose a course");
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


class Bsc1 extends Ug1
{
	Bsc1()
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


class Btech1 extends Ug1{
	Btech1(){
	 super.course1 = "cse";
	 super.course2 = "ece";
	 super.course3 = "eee";
	 super.course4 = "mech";
	 //this.courses();
	}
	
	}
class Mtech1 extends Pg1{
	Mtech1(){
	super.course1 = "cse";
	super.course2 = "ece";
	super.course3 = "eee";
	super.course4 = "mech";
	}
	}
		

class Msc1 extends Pg1{
	Msc1(){
	super.course1 = "msc Physics";
	super.course2 = "msc Chemistry";
	super.course3 = "msc maths";
	super.course4 = "msc computers";
	}
}
	
