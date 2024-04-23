package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class XmarksTheSpot2 {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int lineNum = Integer.parseInt(reader.readLine());
        StringBuilder result = new StringBuilder();
        int index = 0;
        
        for(int i = 0; i < lineNum; i++){
            String str = (reader.readLine()).toUpperCase();
            index = str.indexOf(' ')+str.indexOf('X');
                
            result.append(str.substring(index+1, index+2));
        }
        System.out.print(result.toString());
    }
}
