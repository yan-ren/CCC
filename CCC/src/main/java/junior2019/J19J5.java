package junior2019;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J19J5 {

	public static ArrayList<Rule> rules;

	public String run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		initRules(sc);
		String[] items = sc.nextLine().split(" ");
		int steps = Integer.parseInt(items[0]);
		String begin = items[1];
		String end = items[2];
//		System.out.println(rules);
//		System.out.println(rulesIndex);
		return transform(steps, begin, end);
	}

	public static String transform(int steps, String begin, String end) {
//		Set<String> seen = new HashSet<>();
//		seen.add(begin);
		Node first = new Node(begin, "");
		ArrayList<Node> current = new ArrayList<>();
		ArrayList<Node> next = new ArrayList<>();
		current.add(first);
		int currentStep = 0;
		while (currentStep < steps) {
			// go through each node in current list, apply each rule
			System.out.println("generation" + currentStep);
			System.out.println(current);
			for(Node n : current) {
				// apply each rule
				for(int i = 0; i < rules.size(); i ++) {
					// apply this key in all index in current node
					int startIndex = 0;
					boolean done = false;
					while(!done) {
						int find = n.value.indexOf(rules.get(i).key, startIndex);
						if(find != -1) {
							startIndex = find + 1;
							String tmp = n.value.substring(0, find) + rules.get(i).value + n.value.substring(find + rules.get(i).key.length());
//							if(!seen.contains(tmp)) {
								// not seen this type, add to next
								next.add(new Node(tmp, n.history + "\n" + (i+1)  + " " + (find + 1) + " " + tmp));
//								seen.add(tmp);
//							}
						}else {
							done = true;
						}
					}
					
				}
			}
			current = new ArrayList<Node>(next);
			next.clear();
			currentStep += 1;
		}
		for(Node n : current) {
			if(n.value.equals(end)) {
				return n.history;
			}
		}
		return null;
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

class Rule{
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