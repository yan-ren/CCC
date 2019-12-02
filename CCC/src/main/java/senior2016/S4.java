package senior2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class S4 {

	public static void main(String[] args) {
//		int[] a = { 14, 12, 12, 3, 9, 9, 3 };
//		System.out.println(new S4().dp(a));
//
//		int[] b = { 600145, 600145, 780081, 780081 };
//		int[] c = { 197847, 13395, 197847 };
//		System.out.println(new S4().dp(c));
//		RiceRoll r1 = new RiceRoll(a);
//		RiceRoll r2 = new RiceRoll(b);
//		System.out.println(new S4().makeRiceRoll(r1, 0));
//		System.out.println(new S4().makeRiceRoll(r2, 0));
	}

	public int run(BufferedReader br1) throws IOException {
		br1.readLine();
		int[] input = Stream.of(br1.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();

		// dp solution
		return dp(input);

//		RiceRoll r = new RiceRoll(input);
//		return makeRiceRoll(r, 0);
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

	public int makeRiceRoll(RiceRoll r, int i) {
		if (i >= r.size() - 1) {
			return r.largestRiceBall();
		}

		RiceRoll rNoMerge = new RiceRoll(r);
		RiceRoll rMergeTwo = new RiceRoll(r);
		RiceRoll rMergeThree = new RiceRoll(r);

		if (r.canMergeTwo(i) && r.canMergeThree(i)) {
			rMergeTwo.mergeTwo(i);
			rMergeThree.mergeThree(i);
			return max(makeRiceRoll(rNoMerge, i + 1), makeRiceRoll(rMergeTwo, 0), makeRiceRoll(rMergeThree, 0));
		} else if (r.canMergeThree(i)) {
			rMergeThree.mergeThree(i);
			return Math.max(makeRiceRoll(rNoMerge, i + 1), makeRiceRoll(rMergeThree, 0));
		} else if (r.canMergeTwo(i)) {
			rMergeTwo.mergeTwo(i);
			return Math.max(makeRiceRoll(rNoMerge, i + 1), makeRiceRoll(rMergeTwo, 0));
		}

		return makeRiceRoll(rNoMerge, i + 1);
	}

	public int max(int x, int y, int z) {
		return Math.max(Math.max(x, y), z);
	}

}

class RiceRoll {

	ArrayList<Integer> roll;

	public ArrayList<Integer> getRoll() {
		return roll;
	}

	public RiceRoll() {
		roll = new ArrayList<>();
	}

	public RiceRoll(int[] a) {
		roll = new ArrayList<>();
		for (int element : a) {
			roll.add(element);
		}
	}

	public RiceRoll(RiceRoll r) {
		roll = (ArrayList<Integer>) r.getRoll().clone();
	}

	public int size() {
		return roll.size();
	}

	public int largestRiceBall() {
		return Collections.max(roll);
	}

	public void mergeTwo(int i) {
		roll.set(i, roll.get(i) + roll.get(i + 1));
		roll.remove(i + 1);

	}

	public void mergeThree(int i) {
		roll.set(i, roll.get(i) + roll.get(i + 1) + roll.get(i + 2));
		roll.remove(i + 2);
		roll.remove(i + 1);
	}

	public boolean canMergeTwo(int i) {
		if (i + 1 < roll.size() && roll.get(i).equals(roll.get(i + 1))) {
			return true;
		}

		return false;
	}

	public boolean canMergeThree(int i) {
		if (i + 2 < roll.size() && roll.get(i).equals(roll.get(i + 2))) {
			return true;
		}
		return false;
	}
}
