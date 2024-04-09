package array;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = {{ 2, 4, 6 },{ 3, 6, 9 }};
		int [][] arr1 = new int[2][3];
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]+ " ");
			} System.out.println();
		} 
	}

}
