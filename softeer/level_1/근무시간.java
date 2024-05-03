package level_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 근무시간 {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int sum = 0;
		
		int aHour = 0;
		int bHour = 0;
		int aMinute=0;
		int bMinute=0;
		
		String[] list = new String[5];
		for ( int i = 0; i < list.length; i++) {
			list[i] = reader.readLine();
			
			String a = list[i].substring(0,list[i].indexOf(" "));
			String b = list[i].substring(list[i].indexOf(" ")+1);
			
			aHour = Integer.valueOf(a.substring(0,a.indexOf(":")))*60;
			aMinute = Integer.valueOf(a.substring(a.indexOf(":")+1));
			bHour = Integer.valueOf(b.substring(0,b.indexOf(":")))*60;
			bMinute = Integer.valueOf(b.substring(b.indexOf(":")+1));
			
			sum += (bHour+bMinute) - (aHour+aMinute);
			
//			hour = Integer.valueOf(a.substring(0,a.indexOf(":")))+Integer.valueOf(b.substring(0,b.indexOf(":")));
//			minute = Integer.valueOf(a.substring(a.indexOf(":")+1))+Integer.valueOf(b.substring(b.indexOf(":")+1));
			
//			sum += Integer.valueOf(b.replace(":", "")) - Integer.valueOf(a.replace(":", ""));
		}
		System.out.println(sum);

	}
}
