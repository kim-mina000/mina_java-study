package level_2;

import java.util.Scanner;

public class 진정한효도3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] ground = new int[3][3];
		int result = 0;
		
		int[] resultListRow = new int[3];
		int[] resultListCol = new int[3];
		
		String str = "";
		String[] strList = new String[3];
		
		for( int i = 0; i < ground.length; i++) {
			str = scanner.nextLine();
			strList = str.split(" ");
			for (int j= 0; j < ground[i].length; j++) {
				ground[i][j] = Integer.parseInt(strList[j]);
			}
		}
		
		
		for (int i = 0; i < resultListRow.length; i++) {
			resultListRow[i] = Max(ground[i][0],ground[i][1],ground[i][2])-Min(ground[i][0],ground[i][1],ground[i][2]);
			resultListCol[i] =  Max(ground[0][i],ground[1][i],ground[2][i])-Min(ground[0][i],ground[1][i],ground[2][i]);
		}
		
		result = Min(resultListRow[0],resultListRow[1],resultListRow[2]) < Min(resultListCol[0],resultListCol[1],resultListCol[2]) ? Min(resultListRow[0],resultListRow[1],resultListRow[2]):Min(resultListCol[0],resultListCol[1],resultListCol[2]);

		System.out.println(result);
//		********************************
		for( int i = 0; i < ground.length; i++) {
			for (int j= 0; j < ground[i].length; j++) {
				System.out.print(ground[i][j]+" ");
			}
			System.out.println();
			
			
		}
		for( int i = 0; i < resultListCol.length; i++) {
			System.out.print(resultListCol[i]);
		}
		System.out.println("***");
		for( int i = 0; i < resultListRow.length; i++) {
			System.out.print(resultListRow[i]);
		}
		
	}
	public static int Max (int a, int b, int c) {
		return a > b ? (a > c ? a : c) : (b > c ? b : c);
	}
	
	public static int Min (int a, int b, int c) {
		return a < b ? (a < c ? a : c) : (b < c ? b : c);
	}

}
