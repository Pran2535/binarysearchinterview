package binarysearch_in2d_array;

public class searchinmatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[][]= {
		{1,2,3},
		{5,6,7},
		{8,9,10}
};
System.out.print(search(arr,11));

	}
	public static int[] search(int arr[][],int item) {
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(arr[i][j]==item) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};

}}
