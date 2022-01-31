public class Nto1 {
	public static void main(String args[])
	{
		int n=5;
		call(5);
	}

	static void recur(int n)
	{
		if(n>1)
		   recur(n-1);
		System.out.println(n);
	}
	static void call(int n)
	{
		if(n==0)
			return;
		System.out.println(n);
		call(n-1);
	}
}
