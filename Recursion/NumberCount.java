public class NumberCount {

	public static void main(String[] args) {
		number(5);
	}
	static void message(int count)
	{
		if(count>0){
			System.out.println("Hello World !");
		    message(--count);}
	}
	
	//print 1st 5 number
	static void number(int count)
	{
		if(count>1)
		{
			 number(   count);
			 System.out.println(count);
		}
		
	}

}
