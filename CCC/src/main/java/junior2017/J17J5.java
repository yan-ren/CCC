package junior2017;

import java.io.BufferedReader;
import java.util.Arrays;
import java.util.Scanner;

/*
 * length of each wood
 * 1 <= L <= 2000
 * 
 * length of each board
 * 1 < L <= 4000
 * 
 * use array index to represent the length of wood, value on each index represents number of wood.
 * if a board height is 5, it can only be made from two wood length less than 5
 * 
 * we need to find how many board with same height, and then for different height of board how many time the board number is the same
 */
public class J17J5 {
	public String run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		// skip first line
		sc.nextLine();
		int[] input = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		sc.close();
		int[] woods = new int[2001];
		int[] boards = new int[4001];
		for (int i = 0; i < input.length; i++) {
			woods[input[i]] += 1;
		}

		for (int i = 0; i < woods.length; i++) {
			// no wood with height i
			if (woods[i] == 0) {
				continue;
			}
			for (int j = i; j < woods.length; j++) {
				if (woods[j] == 0) {
					continue;
				}
				if (j == i) {
					boards[i + j] += woods[i] / 2;
				} else {
					boards[i + j] += Math.min(woods[i], woods[j]);
				}
			}
		}
		int fenceLength = 0;
		int combines = 0;
		for (int i = 0; i < boards.length; i++) {
			if(boards[i] == 0) {
				continue;
			}
			if(boards[i] > fenceLength) {
				fenceLength = boards[i];
				combines = 1;
			}else if(boards[i] == fenceLength) {
				combines += 1;
			}
		}

		return fenceLength + " " + combines;
	}
}
