package junior2015;

import java.io.BufferedReader;
import java.util.Scanner;

public class J15J5 {
	/*
	 * classic problem: b indistinguishable balls distribute to u indistinguishable boxes, no box empty
	 * 
	 * partition function Pu(b) = Pu-1(b-1) + Pu(b-u)
	 */
	public int run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		int b = sc.nextInt();
		int u = sc.nextInt();
		int[][] dp = new int[b + 1][u + 1];
		for (int i = 1; i <= b; i++) {
			for (int j = 1; j <= u; j++) {
//				base case
				if (j == 1 || i == j) {
					dp[i][j] = 1;
				} else if (j > i) {
					dp[i][j] = 0;
				} else {
					dp[i][j] = dp[i - 1][j-1] + dp[i - j][j];
				}

			}
		}

		return dp[b][u];
	}
}
