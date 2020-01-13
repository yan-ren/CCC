package junior2013;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J13J5 {
	
	/*
	 * Brute Force solution 
	 */
	public int run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		int favourite = sc.nextInt();
		sc.nextInt();
		sc.nextLine();
		HashMap<String, int[]> matches = new HashMap<>();

		while (sc.hasNext()) {
			String[] items = sc.nextLine().split(" ");
			String key = items[0] + items[1];
			int[] value = { Integer.parseInt(items[0]), Integer.parseInt(items[1]), Integer.parseInt(items[2]),
					Integer.parseInt(items[3]) };
			matches.put(key, value);
		}

		int[] scores = new int[5];
		ArrayList<int[]> scoresList = new ArrayList<>();
		scoresList.add(scores);
		scoresList = runMatch(scoresList, matches);

		int winningTimes = 0;
		for (int[] a : scoresList) {
			if (checkWinner(a) == favourite) {
				winningTimes += 1;
			}
		}
		sc.close();
		return winningTimes;
	}

	public static ArrayList<int[]> runMatch(ArrayList<int[]> scoresList, HashMap<String, int[]> matches) {
		for (int a = 1; a <= 4; a++) {
			for (int b = a + 1; b <= 4; b++) {
				if (matches.containsKey("" + a + b)) {
					for (int[] scores : scoresList) {
						checkWinning(scores, matches.get("" + a + b));
					}
				} else {
					ArrayList<int[]> newScoreList = new ArrayList<>();
					for (int[] scores : scoresList) {
						int[] aWinScore = { a, b, 1, 0 };
						newScoreList.add(checkWinning(scores.clone(), aWinScore));
						int[] bWinScore = { a, b, 0, 1 };
						newScoreList.add(checkWinning(scores.clone(), bWinScore));
						int[] tieScore = { a, b, 0, 0 };
						newScoreList.add(checkWinning(scores.clone(), tieScore));
					}
					scoresList = newScoreList;
				}
//				System.out.println(Arrays.toString(scoresList.get(0)));
			}
		}
		return scoresList;
	}

	public static int[] checkWinning(int[] scores, int[] match) {
		if (match[2] == match[3]) {
			scores[match[0]] += 1;
			scores[match[1]] += 1;
		} else if (match[2] > match[3]) {
			scores[match[0]] += 3;
		} else if (match[2] < match[3]) {
			scores[match[1]] += 3;
		}
		return scores.clone();
	}

	public static int checkWinner(int[] teams) {
		int max = teams[0];
		int index = 0;

		for (int i = 0; i < teams.length; i++) {
			if (max < teams[i]) {
				max = teams[i];
				index = i;
			}
		}

		// maybe max numbers show more than once
		int counter = 0;
		for (int a : teams) {
			if (a == max) {
				counter += 1;
			}
		}

		return counter == 1 ? index : 0;
	}
}
