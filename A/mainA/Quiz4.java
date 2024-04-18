package mainA;

import java.util.Arrays;

public class Quiz4 {

	public static void main(String[] args) {

		int[] arr = new int[5];	
		
		int j = 0;
		for (int i = 1; i <= 10; i++){
			if (i%2 ==0) {
				arr[j] = i;
				j++;
			}
		}		
		System.out.println(Arrays.toString(arr));
		
		for ( int i : arr) {
			System.out.print(i+" ");
		}
	}

}
