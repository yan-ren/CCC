package senior2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.Stream;

public class S4 {

	public static void main(String[] args) {

	}

	public int run(BufferedReader br1) throws IOException {
		br1.readLine();
		int[] input = Stream.of(br1.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

		// dp solution
		return dp(input);
	}

	/*
	 * DP solution:
	 * runtime = O(n^4) worst case n = 400 takes ~ 6s
	 * can be improved to O(n^3)
	 * 
	 * input = [14, 12, 12, 3, 9, 9, 3] l and r are the index of rice roll dp[l][r]
	 * = true if [l, r] can be combined = false otherwise
	 * 
	 * if r = l, dp[l][r] = true if r - l <= 2, dp[l][r] = true if input[l] ==
	 * input[r] if r - l > 2, dp[l][r] = true if input[l] == input[r] and dp[l +
	 * 1][r] == true
	 * 
	 * 
	 */
	public static int dp(int[] input) {
		int[][] dpCombineMap = new int[input.length][input.length];
		int[][] dpValueMap = new int[input.length][input.length];

		for (int k = 0; k < input.length; k++) {
			for (int i = 0; i + k < input.length; i++) {
				int j = i + k;
				if (i == j) {
					dpCombineMap[i][j] = 1;
					dpValueMap[i][j] = input[i];
				} else if (j - i == 1) {
					if (input[i] == input[j]) {
						dpCombineMap[i][j] = 1;
						dpValueMap[i][j] = dpValueMap[i][i] + dpValueMap[j][j];
					} else {
						dpValueMap[i][j] = Math.max(dpValueMap[i][i], dpValueMap[j][j]);
					}
				}
				else {
					for (int l = i; l < j; l++) {
						if (dpCombineMap[i][l] == 1
								&& dpCombineMap[l + 1][j] == 1 & dpValueMap[i][l] == dpValueMap[l + 1][j]) {
							dpCombineMap[i][j] = 1;
							dpValueMap[i][j] = dpValueMap[i][l] + dpValueMap[l + 1][j];
						}
					}
					for (int gap = 1; gap <= j - i; gap++) {
//						case: i < l < l+gap < j
//						3, 9, 9, 3
//						72, 15, 72, 771, 159
//						12, 12, 3, 9, 9, 3
						for (int l = i + 1; l + gap - 1 < j; l++) {
							if (dpCombineMap[i][l - 1] == 1 && dpCombineMap[l][l + gap - 1] == 1
									&& dpCombineMap[l + gap][j] == 1
									&& dpValueMap[i][l - 1] == dpValueMap[l + gap][j]) {
								dpCombineMap[i][j] = 1;
								dpValueMap[i][j] = dpValueMap[i][l - 1] + dpValueMap[l][l + gap - 1] + dpValueMap[l + gap][j];
							}
						}
					}
					if (dpCombineMap[i][j] == 0) {
						dpValueMap[i][j] = Math.max(dpValueMap[i + 1][j], dpValueMap[i][j - 1]);
					}
				}

			}
		}
//		print2DArray(dpValueMap);
//		print2DArray(dpCombineMap);

		return dpValueMap[0][input.length - 1];
	}

	public static void print2DArray(int[][] twoDm) {
		for (int[] row : twoDm) {
			for (int elem : row) {
				System.out.printf("%4d", elem);
			}
			System.out.println();
		}
		System.out.println();
	}
}