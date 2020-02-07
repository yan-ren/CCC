package junior2018;

import java.io.BufferedReader;
import java.util.Scanner;

public class J18J4 {
	public int[][] run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		int[][] table = init(sc);
		boolean done = false;
		while(!done) {
			if (checkTable(table)) {
				done = true;
			}
			else {
				table = rotate(table);
			}
		}
		return table;
	}

	public static int[][] init(Scanner sc) {
		int dimension = sc.nextInt();
		int[][] arr = new int[dimension][dimension];
		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		return arr;
	}
	
	public static int[][] rotate(int[][] table) {
		int[][] newArr = new int[table.length][table.length];
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[i].length; j ++) {
				newArr[j][table.length - 1 - i] = table[i][j];
			}
		}
		return newArr;
	}
	
	public static boolean checkTable(int[][] table) {
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[i].length - 1; j ++) {
				if(table[i][j] > table[i][j + 1]) {
					return false;
				}
			}
		}
		
		for(int i = 0; i < table.length; i++) {
			for(int j = 0; j < table[i].length - 1; j ++) {
				if(table[j][i] > table[j + 1][i]) {
					return false;
				}
			}
		}
		return true;
	}
}
