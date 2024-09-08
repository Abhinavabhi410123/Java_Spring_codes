class Conversion{
	public static void main(String args[]){
		char b = '$';
		int c = b;
		if(c>=65 && c<91){
		c = c + 32;
		b = (char) c;
		System.out.println(b);
		}
		else if(c>=97 && c<123){
		c = c - 32;
		b = (char) c;
		System.out.println(b);
		}
		else
		System.out.println("Not an alphabet");
		}
		}
