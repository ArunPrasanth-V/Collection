public class FactorialOfANumber {
	public static void main(String args[])
	{
		System.out.println(reverse(12345));
//		int n=12345;
//		int sum=0;
//		while(n>0)
//		{
//			int temp=n%10;
//			n/=10;
//			sum=sum*10+temp;
//			System.out.println(sum);
//		}
//		System.out.println(sum);
	}
	static int fact(int n)
	{
		if(n==1)
			return 1;
		return n* fact(n-1);
		
	}
	static int sum(int n)
	{
		if(n==1)
			return 1;
		return n+sum(n-1);
	}
	static int digit(int n)
	{
		if(n<10)
			return n;
		return  (n%10)*10 +digit(n/10);
	}
	static int reverse(int n)
	{
		if(n<10)
			return n;
		return digit(n/10)+(n%10);
	}

}
