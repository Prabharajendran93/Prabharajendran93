package week1.day2.assignment;


import java.util.Arrays;
import java.util.Iterator;

public class FindMissingNumberArray {

	public static void main(String[] args) {
		
		
		int[] arr= {1,2,3,4,5,6,8};
		
		Arrays.sort(arr);
		// TODO Auto-generated method stub
		for (int i = 0; i < arr.length; i++) {
			if (arr[i+1]!=arr[i]+1) {
				System.out.println(arr[i]+1);
				break;
			}
			
		}
	}

}
