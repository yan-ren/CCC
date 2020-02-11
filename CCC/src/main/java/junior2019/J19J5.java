package junior2019;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * Notes about the question: 
 * I provide two solutions: transform and transform2
 * Both of them using the same idea -> BFS, which keeps generating all the cases in each depth until reaching certain depth, 
 * the different is they use different way to keep the substitutions history. transform uses string.
 * transform2 uses reference. Both of them can get the result for S < 10, due to the memory limits.
 * During the tests, I find there are lots of possible sequence of substitutions. 
 * However test data only provide one possible sequence, which makes testing very hard if not finding all possible sequence.
 * 
 * If we don't care the testing, just want to find one possible way, as mentioned in the question.
 * Maybe using DFS can solve the memory issue.
 * In DFS, we keep doing substitutions following one path until reaching the depth.
 * As long as we find one possible path, stop searching.
 */
public class J19J5 {

	public static ArrayList<Rule> rules;

	public ArrayList<String> run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		initRules(sc);
		String[] items = sc.nextLine().split(" ");
		int steps = Integer.parseInt(items[0]);
		String begin = items[1];
		String end = items[2];
//		System.out.println(rules);
//		System.out.println(rulesIndex);
		return transform2(steps, begin, end);
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<String> transform(int steps, String begin, String end) {
//		Set<String> seen = new HashSet<>();
//		seen.add(begin);
		Node first = new Node(begin, "");
		ArrayList<Node> current = new ArrayList<>();
		ArrayList<Node> next = new ArrayList<>();
		current.add(first);
		int currentStep = 0;
		while (currentStep < steps) {
			// go through each node in current list, apply each rule
//			System.out.println("generation" + currentStep);
//			System.out.println(current);
			for (Node n : current) {
				// apply each rule
				for (int i = 0; i < rules.size(); i++) {
					// apply this key in all index in current node
					int startIndex = 0;
					boolean done = false;
					while (!done) {
						int find = n.value.indexOf(rules.get(i).key, startIndex);
						if (find != -1) {
							startIndex = find + 1;
							String tmp = n.value.substring(0, find) + rules.get(i).value
									+ n.value.substring(find + rules.get(i).key.length());
							// if have seen this in history, skip this case
							if (n.history.contains(" " + tmp + "\n")) {
								continue;
							}
							if (n.history.equals("")) {
								next.add(new Node(tmp, (i + 1) + " " + (find + 1) + " " + tmp));
							} else {
								next.add(new Node(tmp, n.history + "\n" + (i + 1) + " " + (find + 1) + " " + tmp));
							}
						} else {
							done = true;
						}
					}

				}
			}
			current = (ArrayList<Node>) next.clone();
			next.clear();
			currentStep += 1;
		}

		ArrayList<String> result = new ArrayList<>();
		for (Node n : current) {
			if (n.value.equals(end)) {
				result.add(n.history);
			}
		}
		return result;
	}

	@SuppressWarnings("unchecked")
	public static ArrayList<String> transform2(int steps, String begin, String end) {
//		Set<String> seen = new HashSet<>();
//		seen.add(begin);
		Node2 first = new Node2(begin, 0, 0, null);
		ArrayList<Node2> current = new ArrayList<>();
		ArrayList<Node2> next = new ArrayList<>();
		current.add(first);
		int currentStep = 0;
		while (currentStep < steps) {
			// go through each node in current list, apply each rule
//			System.out.println("generation" + currentStep);
//			System.out.println(current);
			for (Node2 n : current) {
				// apply each rule
				for (int i = 0; i < rules.size(); i++) {
					// apply this key in all index in current node
					int startIndex = 0;
					boolean done = false;
					while (!done) {
						int find = n.value.indexOf(rules.get(i).key, startIndex);
						if (find != -1) {
							startIndex = find + 1;
							String tmp = n.value.substring(0, find) + rules.get(i).value
									+ n.value.substring(find + rules.get(i).key.length());
							// check if n's parents is tmp
							if (checkParent(n, tmp)) {
								continue;
							}
							next.add(new Node2(tmp, find + 1, i + 1, n));
						} else {
							done = true;
						}
					}

				}
			}
			current = (ArrayList<Node2>) next.clone();
			next.clear();
			currentStep += 1;
		}

		ArrayList<String> tmpResult = new ArrayList<>();
		for (Node2 n : current) {
			if (n.value.equals(end)) {
				tmpResult.add(buildPath(n));
			}
		}
//		System.out.println(tmpResult);
		return tmpResult;
	}

	public static String buildPath(Node2 node) {
		Node2 start = node;
		ArrayList<String> result = new ArrayList<>();
		while (start.parent != null) {
			result.add(start.rule + " " + start.index + " " + start.value);
			start = start.parent;
		}
		Collections.reverse(result);
		return String.join("\n", result);
	}

	public static boolean checkParent(Node2 current, String tmp) {
		Node2 start = current;
		while (start.parent != null) {
			if (start.parent.value.equals(tmp)) {
				return true;
			}
			start = start.parent;
		}
		return false;
	}

	// cannot use map for rules because may have same key
	public static void initRules(Scanner sc) {
		rules = new ArrayList<>();
		int n = 1;
		// first three lines are rules
		while (n <= 3) {
			String[] items = sc.nextLine().split(" ");
			rules.add(new Rule(items[0], items[1]));
			n += 1;
		}
	}
}

class Rule {
	String key;
	String value;

	public Rule(String key, String value) {
		this.key = key;
		this.value = value;
	}
}

class Node {
	String value;
	String history;

	public Node(String value, String history) {
		this.value = value;
		this.history = history;
	}

	public String toString() {
		return "[value: " + value + ", history: " + history + "]";
	}
}

class Node2 {
	int rule;
	int index;
	String value;
	Node2 parent;

	public Node2(String value, int index, int rule, Node2 parent) {
		this.index = index;
		this.rule = rule;
		this.parent = parent;
		this.value = value;
	}

	public String toString() {
		return "[value: " + value + ", parent: " + parent.value + "]";
	}
}