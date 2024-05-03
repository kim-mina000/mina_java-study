package level_1;

import java.util.Scanner;

public class 연탄배달의시작2 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        int N = scanner.nextInt();
	        scanner.nextLine();
	        String[] villageList = scanner.nextLine().split(" ");

	        if (N < 2) {
	            System.out.println(0);
	            return;
	        }

	        int[] intVillageList = new int[N];
	        for (int i = 0; i < N; i++) {
	            intVillageList[i] = Integer.parseInt(villageList[i]);
	        }
	        
	        int minDistance = Integer.MAX_VALUE;
	        int result = 0;

	        // 최소 거리 및 해당 거리의 발생 횟수를 한 번의 루프로 찾기
	        for (int i = 0; i < N - 1; i++) {
	            int currentDistance = intVillageList[i + 1] - intVillageList[i];
	            if (currentDistance < minDistance) {
	                minDistance = currentDistance;
	                result = 1; // 새로운 최소값이 발견될 때마다 카운트 초기화
	            } else if (currentDistance == minDistance) {
	                result++;
	            }
	        }
	        
	        System.out.println(result);
	}

}
