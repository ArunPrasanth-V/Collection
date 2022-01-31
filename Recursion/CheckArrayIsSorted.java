public class CheckArrayIsSorted {
	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		System.out.println(check(arr,0));
		
	}
	
   static boolean check(int arr[],int start)
   {
		   if(start >=arr.length-1)
			   return true;
	   return arr[start]<arr[start+1] && check(arr,++start);
   }
}
