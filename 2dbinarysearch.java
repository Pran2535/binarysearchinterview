package binarysearch_in2d_array;

public class binarysearchin_a_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {
		{10,20,30,40},
		{15,25,35,45},
		{28,29,37,49},
		{33,34,38,50}
};
System.out.println(search(arr,43));
	}
	public static boolean search(int arr[][], int item) {
		int i=0;
		int j=arr[i].length-1;
		while(i<arr.length&&j>=0) {
			
				if(arr[i][j]==item) {
					return true;
				}
				else if(arr[i][j]>item) {
					j--;
				}
				else {
					i++;
				}
			}
		
		return false;
	}

}
