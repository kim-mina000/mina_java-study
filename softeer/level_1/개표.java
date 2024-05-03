package level_1;

import java.util.Scanner;

public class 개표 {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        for (int i = 0; i < T; i++){
            int n = scanner.nextInt();
            
            int n2 = n / 5;
            for (int j = 0; j < n2; j++){
                for (int h = 0; h <4; h++){
                    System.out.print("+");
                } System.out.print(" ");
            }
            
            int p = n % 5;
            for (int l = 0; l < p; l++){
                System.out.print("|");
            } System.out.println();
        }
	}

}
