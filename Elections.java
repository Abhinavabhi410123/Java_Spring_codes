class Age{
	public static void main(String args[]){
	int age = 4 , gyear = 2019;
	String edu = "graduated";
	if(age<18)
	System.out.println("he is a minor");
	else if(age<25)
		System.out.println("eligible to vote");
	else if(age<50){
		if(gyear<=2020)
		System.out.println("eligible for mlc elections");
		else
		System.out.println("not eligible for mlc , eligible for mla");
		}
	else if(age>=50){
		if(edu == "graduated")
		System.out.println("old eligible for mlc");
		else
		System.out.println("old eligible for mla");
}
}
}