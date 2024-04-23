package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrenDelFinDelMundo {

	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.valueOf(reader.readLine());
        String str = "";
        String result = "";

        int a = 0;
        int key = 0;
        
        for (int i = 0; i < N; i++) {
        	str = reader.readLine();
        	int n1 = Integer.valueOf(str.substring(0, str.indexOf(" ")));
        	int n2 = Integer.valueOf(str.substring(str.indexOf(" ")+1));
        	
        	a = Math.abs(n1 - n2);
        	
        	if( key < a ) {
        		key = a;
        		result = str;
        	}
        	
        }
        System.out.println(result);
        
	}

}
