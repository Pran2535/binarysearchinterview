package recursion;

public class binarysearch_ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5};
System.out.print(search(arr,3,0,4));
	}
	public static int search(int arr[], int item,int low, int high) {

		int mid=(low+high)/2;
if((mid==high)||(mid==low)){
	return -1;
}
if(arr[mid]==item) {
	return mid;
}
else if(arr[mid]>item) {
	high=mid-1;
}
else {
	low=mid+1;
}
return search(arr,item,low,high);
}
}
