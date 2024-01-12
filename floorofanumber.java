package revision;
//floor means getting a number in an array which is just less than the target we have so 
public class floorofanumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {2,3,5,9,14,16,18};
		System.out.println(floor(arr,4));
	}
	public static int floor(int arr[],int target) {
		int low=0;
		int high=arr.length-1;
		int sec=-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(arr[mid]==target) {
				return arr[mid];
			}
			else if(arr[mid]>target) {
				high=mid-1;
				
			}
			else {
				low=mid+1;
				sec=arr[mid];
			}
		}
		return sec;
	}

}
