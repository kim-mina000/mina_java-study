package level_2;

import java.util.Scanner;

public class 진정한효도 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[][] ground = new int[3][3];
		int[] resultList = new int[5];
		
		String str = "";
		String[] strList = new String[3];
		
		for( int i = 0; i < ground.length; i++) {
			str = scanner.nextLine();
			strList = str.split(" ");
			for (int j= 0; j < ground[i].length; j++) {
				ground[i][j] = Integer.parseInt(strList[j]);
			}
		}
		
		// 행 비교
		int Max = Integer.MAX_VALUE;
		int Min = 0;
		
		for(int i = 0; i < ground.length; i++) {
			for(int j = 0; j<ground[i].length; j++) {
				if( ground[i][j] < Min) {
					Min = Integer.valueOf(ground[i][j]);
				}
				if ( ground[i][j] > Max ){
					Max = Integer.valueOf(ground[i][j]);
				}
			}
			
		}
		
		System.out.println(Max+" "+ Min);
		
		
		
//		********************************
		for( int i = 0; i < ground.length; i++) {
			for (int j= 0; j < ground[i].length; j++) {
				System.out.print(ground[i][j]+" ");
			}
			System.out.println();
		}
	}

}
