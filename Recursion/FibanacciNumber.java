public class FibanacciNumber {
  public static void main(String args[])
  {
	  System.out.println(fibanaci(6));
	  fibonacci_normal_way(6);
  }
	  
	  static void fibonacci_normal_way(int n)
	  {
		  int precount=0;
		  int currentcount=1;
		  System.out.println(precount);
		  System.out.println(currentcount);
		  for(int i=2;i<=n;i++)
		  {
			  int temp=currentcount;
			  System.out.println(currentcount=currentcount+precount);
			  precount=temp;
			  
		  }
		  
	  }
	   
	  static int fibanaci(int n)
	  {
		  if(n<2)
			  return n;  
		  return fibanaci(n-1)+fibanaci(n-2);
	  }

}
