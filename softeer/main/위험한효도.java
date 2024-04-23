package main;

import java.util.Scanner;

public class 위험한효도 {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] conArr = scanner.nextLine().split(" ");

//        for (int i = 0; i < conArr.length; i++){
//        	System.out.println(conArr[i]);
//        }

        int d = Integer.parseInt(conArr[2]);
        int a = Integer.parseInt(conArr[0]);
        int b = Integer.parseInt(conArr[1]);
                
        int location = 1;
        int sec = 0;

        
        // 7 3 10
        for (int i = 1; i <= d; i++) {
        	System.out.println(location);
        	sec ++;
        	location ++;
        	if (location == d) {break;}
        	if ( location % a == 0 ) {
        		sec += b;
            	System.out.println("정지"+location);
        	}
        }
        System.out.println("sec"+sec);
        for (int i = 1; i <= d; i++) {
        	System.out.println(location);
        	sec++;
        	location --;
        	if (location == 0) { sec++; break;}
        	if (location % b == 0) {
        		sec += a;
            	System.out.println("정지"+location);
        	}
        }
        System.out.println(sec);
                
	}

}
