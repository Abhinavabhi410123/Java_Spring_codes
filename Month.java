class Days{
	public static void main(String args[]){
		String b = "feb";
		int year = 2000;
		if(b=="Jan"|| b=="May"||b=="july"||b=="Aug"||b=="Oct"||b=="Dec")
		System.out.println("31 days in this month");
		else if (b=="April"||b=="June"||b=="Sept"||b=="Nov")
		System.out.println("30 days in this month");
		else if(b=="feb"){
		if(year%4==0 && year%100!=0||year%400==0)
		System.out.println("leap year 29 days in this month");
		else
		System.out.println("28 days in this month");
		}
		}
		}