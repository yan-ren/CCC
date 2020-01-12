package junior2011;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class J11J5 {
	
	/*
	 * build a tree to maintain the people's connection
	 * ways of deletion:
	 * if current node has no child, 2 ways to remove
	 * if current has more than 1 child, it is multiple of the number of ways to 
	 * delete each child and + 1 (current node)
	 */
	public int run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		int personNum = sc.nextInt();
		HashMap<Integer, ArrayList<Integer>> personMap = new HashMap<>();
		int id = 1;
		while (sc.hasNext()) {
			int parent = sc.nextInt();
			if (personMap.containsKey(parent)) {
				personMap.get(parent).add(id);
			} else {
				ArrayList<Integer> children = new ArrayList<>();
				children.add(id);
				personMap.put(parent, children);
			}
			id++;
		}
		// root node
		Node mark = buildChild(personNum, personMap);
		// Mark will never remove himself, so -1 
		return count(mark) - 1;
	}
	
	public static Node buildChild(int parent, HashMap<Integer, ArrayList<Integer>> personMap) {
		if (!personMap.containsKey(parent)) {
			return new Node(parent);
		}
		Node p = new Node(parent);
		ArrayList<Integer> children = personMap.get(parent);
		for(int c: children) {
			Node child = buildChild(c, personMap);
				p.addChild(child);
		}
		personMap.remove(parent);
		return p;
	}
	
	public static int count(Node root) {
		if(root.children.size() == 0) {
			return 2;
		}
		ArrayList<Integer> childrenList = new ArrayList<>();
		for(Node c: root.children) {
			childrenList.add(count(c));
		}
		
		int total = 1;
		for(int c : childrenList) {
			total *= c;
		}
		return total + 1;
	}
}

class Node {
	int id;
	ArrayList<Node> children = new ArrayList<>();

	Node(int id) {
		this.id = id;
	}

	void addChild(Node a) {
		children.add(a);
	}
	
	public String toString() {
		return Integer.toString(this.id);
	}
}