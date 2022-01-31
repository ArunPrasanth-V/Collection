public class TargetInArray {
  public static void main(String args[])
  {
	  int arr[]= {1,2,3,4,5,6,7,8,9,10};
	  System.out.println(give(arr,0,9));
  }
  static int give(int []arr,int start,int target)
  {
	  
	  if(arr[start]==target)
		  return start;
	  else if(arr.length==start)
		  return -1;
	  else 
		  return give(arr,start+1,target);
  }
}
