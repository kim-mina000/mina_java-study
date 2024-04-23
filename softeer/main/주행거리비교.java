package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 주행거리비교 {

	public static void main(String[] args) throws IOException {
		 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	        String distance = reader.readLine();
	        
	        int A = Integer.parseInt(distance.substring(0,distance.indexOf(" ")));
	        int B = Integer.parseInt(distance.substring(distance.indexOf(" ")+1));

	        if ( A > B ){
	            System.out.println("A");
	        } else if ( B > A ){
	            System.out.println("B");
	        } else if ( A == B ){
	            System.out.println("same");
	        }
	}

}
