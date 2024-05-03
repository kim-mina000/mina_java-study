package level_2;

import java.util.Scanner;

public class 진정한효도2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] ground = new int[3][3];
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
		
		int cost = 0;
		int cost2 = 0;
		
		for (int i = 0; i < resultListRow.length; i++) {
			resultListRow[i] = 3 - ((ground[i][0]+ground[i][1]+ground[i][2])%3);
			resultListCol[i] = 3 - ((ground[0][i]+ground[1][i]+ground[2][i])%3);
		}
		
		
//		********************************

		for( int i = 0; i < resultListCol.length; i++) {
			System.out.print(resultListCol[i]);
		}
		System.out.println("***");
		for( int i = 0; i < resultListRow.length; i++) {
			System.out.print(resultListRow[i]);
		}
	}
	

}
