package junior2012;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

public class J12J5 {
	/*
	 * This question is the same as 2012 senior S4, the difference is the test set.
	 * In junior n < 5, in senior n < 8
	 * 
	 * Idea: BFS
	 */
	public static void main(String[] args) {
		int positionNumber = 3;
		String test1 = "3,2,1";
		// 3,12,0
		System.out.println(makeMove(test1, 2, 1, positionNumber));
		String test2 = "3,2,1";
		// 3,12,0
		System.out.println(makeMove(test2, 2, 0, positionNumber));
		String test3 = "3,2,1";
		// 3,12,0
		System.out.println(makeMove(test3, 0, 1, positionNumber));
		String test4 = "23,1,0";
		// 3,12,0
		System.out.println(makeMove(test4, 1, 1, positionNumber));
	}

	public ArrayList<String> run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		ArrayList<String> result = new ArrayList<>();
		while (sc.hasNext()) {
			int digits = Integer.parseInt(sc.nextLine());
			if (digits == 0) {
				sc.close();
				return result;
			}
			String start = sc.nextLine().replace(" ", ",");
			String target = buildTarget(digits);
			result.add(bfs(start, target, digits));
		}
		sc.close();
		return null;
	}
	
	public static String buildTarget(int digits) {
		String result = "";
		for(int i = 1; i <= digits; i++) {
			result += i + ",";
		}
		return result.substring(0, result.length() - 1);
	}
	
	@SuppressWarnings("unchecked")
	public static String bfs(String start, String target, int digits) {
		int moves = 0;
		Set<String> visitedStep = new HashSet<>();
		ArrayList<String> currentLevel = new ArrayList<>();
		currentLevel.add(start);
		ArrayList<String> nextLevel = new ArrayList<>();
		while(currentLevel.size() != 0) {
			for(String node: currentLevel) {
				if(node.equals(target)) {
					return Integer.toString(moves);
				}
				if(!visitedStep.contains(node)) {
					visitedStep.add(node);
					for(int i = 0; i < digits; i++) {
						String moveLeft = makeMove(node, i, 1, digits);
						String moveRight = makeMove(node, i, 0, digits);
						if(moveLeft != null) {
							nextLevel.add(moveLeft);	
						}
						if(moveRight != null) {
							nextLevel.add(moveRight);	
						}
					}
				}
			}
			currentLevel = (ArrayList<String>) nextLevel.clone();
			nextLevel.clear();
			moves += 1;
		}
		return "IMPOSSIBLE";
	}

	/*
	 * 3|2|1 or 3|0|12
	 */
	public static String makeMove(String s, int position, int left, int digits) {
		Stack<Integer>[] line = new Stack[digits];
		for (int i = 0; i < line.length; i++) {
			line[i] = new Stack<Integer>();
		}
		String[] items = s.split(",");
		// build list of stacks for moving
		for (int i = 0; i < items.length; i++) {
			for (int j = items[i].length() - 1; j >= 0; j--) {
				if (Character.getNumericValue(items[i].charAt(j)) != 0) {
					line[i].push(Character.getNumericValue(items[i].charAt(j)));
				}
			}
		}
		// make a move
		// nothing on position, no move
		if (line[position].empty()) {
			return null;
		}
		if (position == 0 && left == 1) {
			return null;
		}
		if (position == digits - 1 && left == 0) {
			return null;
		}
		if (left == 1) {
			if (line[position - 1].empty() || line[position - 1].peek() > line[position].peek()) {
				line[position - 1].push(line[position].pop());
			} else {
				return null;
			}
		} else {
			if (line[position + 1].empty() || line[position + 1].peek() > line[position].peek()) {
				line[position + 1].push(line[position].pop());
			} else {
				return null;
			}
		}

		// build the string from Stack<Integer>[] line
		String result = "";
		for (Stack<Integer> a : line) {
			if (a.size() == 0) {
				result += "0,";
				continue;
			}
			while (a.size() != 0) {
				result += a.pop();
			}
			result += ",";
		}
		return result.substring(0, result.length() - 1);
	}
}
