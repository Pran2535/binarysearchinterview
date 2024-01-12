package revision;

public class ceilingofanumber {
//ceiling of a number means find the number which is just greater than or equal to the target value 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {2,3,5,9,14,16,18};
System.out.println(ceiling(arr,15));
	}
	public static int ceiling(int arr[],int target) {
		int low=0;
		int high=arr.length-1;
		while(low<=high) {
//			if(low==high) {
//				return arr[low];
//			}
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				return target;
			}
			else if(arr[mid]>target) {
				high=mid-1;
				
			}
			else {
				low=mid+1;
			}
		}
		if(low<arr.length) {
		return arr[low];
	}
		return -1;
	}

}
