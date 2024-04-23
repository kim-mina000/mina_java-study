package main;

import java.util.Scanner;

public class 연탄배달의시작 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        scanner.nextLine();
        String str = scanner.nextLine();

        String[] villageList = str.split(" ");
        int[] intVillageList = new int [villageList.length];
        
        int Max = 0;
        int Min = 99;

        for (int i = 0; i < villageList.length; i++) {
        	intVillageList[i] = Integer.parseInt(villageList[i]);
        	if (intVillageList[i] > Max) {
        		Max = intVillageList[i];
        	}
        	if (intVillageList[i] < Min) {
        		Min = intVillageList[i];
        	}
        }
        int distance = Max - Min;
        int result =0;
        
        for (int i = 0;  i+1 < intVillageList.length;  i++) {
        	if ( intVillageList[i+1] - intVillageList[i] <= distance ) {
        		distance = intVillageList[i+1] - intVillageList[i];
        	}
        }
        for (int i = 0;  i < intVillageList.length;  i++) {
        	if ( intVillageList[i+1] - intVillageList[i] == distance ) {
        		result++;
        	}
        }
        
        
        System.out.println(result);

}
}
