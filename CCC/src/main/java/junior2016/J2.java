package junior2016;

import java.io.BufferedReader;
import java.util.Scanner;

public class J2 {

	public String compute(BufferedReader br) {
		Scanner sc = new Scanner(br);
		int n = 0;
		int[][] input = new int[4][4];
		while (n < 4) {
			String[] tmp = sc.nextLine().split(" ");
			for(int i = 0; i < input[n].length; i++) {
				input[n][i] = Integer.parseInt(tmp[i]);
			}
			n++;
		}
		
		return q2(input);
	}
	
	public static String q2(int[][] input){
		int compare = 0;
		for(int i = 0; i < input.length; i++){
			int sum = 0;
			for(int j = 0; j<input[i].length; j++){
				sum = input[i][j] + sum;
			}
			if(i == 0){
				compare = sum;
			}
			if(compare != sum){
				return "not magic";
			}
		}
		return "magic";
	}
}
