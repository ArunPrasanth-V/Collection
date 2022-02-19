public class BinarySearch {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6,7,8,9};
		int start=0,end=arr.length-1;
		System.out.println(search(arr,2,start,end));
	}

	
	static int search(int arr[],int target,int start,int end)
	{
		if(start>end){
			return -1;}
		else {
			int mid=start+(end-start)/2;
			if(arr[mid]==target)
				return mid;
			if(arr[end]>target)
			{
				return search(arr,target,0,mid-1);
			}
			else
			{
				return search(arr,target,mid+1,arr.length-1);
			}
		}
	}
}
