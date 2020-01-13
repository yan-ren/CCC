package junior2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

public class J1 {
	
	public int select(BufferedReader br) throws IOException{
		Scanner sc = new Scanner(br);
		int counter = 6;
		int win = 0;
		while(counter >=1 ){
			String input = sc.nextLine().toUpperCase();
			if(input.contains("W")){
				win++;
			}
			counter--;
		}
		sc.close();
		if(win >= 5){
			return 1;
		}
		if(win >= 3){
			return 2;
		}
		if(win >= 1){
			return 3;
		}
		return -1;	
	}
}
