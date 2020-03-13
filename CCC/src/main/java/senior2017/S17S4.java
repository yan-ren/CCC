package senior2017;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 * This question is basing on MST (Minimum Spanning Tree)
 * 
 * facts:
 * - first N-1 edges give a spanning tree, MST also has N-1 edges
 * - apply D to largest weight edges in MST, otherwise wasted
 * 
 * notes:
 * - finding MST usually involves sorting edges, in this question edges may have same weight,
 *   for edge with same weight, put edge in current plan at first, then follow by edge not used. 
 *   Otherwise may use additional unnecessary edge, which in current plan already has same weighted edge 
 *
 * sub problems:
 * - Kruskal's algorithm
 * - DFS or Disjoint Sets
 */
public class S17S4 {
	public int run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		String[] firstLine = sc.nextLine().split(" ");
		int N = Integer.parseInt(firstLine[0]);
		int M = Integer.parseInt(firstLine[1]);
		int D = Integer.parseInt(firstLine[2]);
//		System.out.println("N " + N + ", M " + M + ", D " + D);
		DisjointSets set = new DisjointSets(N + 1);
		int i = 0;
		ArrayList<Edge> edges = new ArrayList<>();
		// first N-1 is the current plan
		while (i < N - 1) {
			String[] line = sc.nextLine().split(" ");
			edges.add(new Edge(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]), true));
			i++;
		}
//		System.out.println(edges.size());
		// remaining is the unused edge
		while (sc.hasNext()) {
			String[] line = sc.nextLine().split(" ");
			edges.add(new Edge(Integer.parseInt(line[0]), Integer.parseInt(line[1]), Integer.parseInt(line[2]), false));
		}
		Collections.sort(edges);
//		System.out.println(edges.size());
//		System.out.println(edges);
		Edge maxEdgeInPlan = new Edge(0, 0, 0, true);
		int costDays = 0;
		int usedEdges = 0; // track how many edges have been used
		for (int j = 0; j < edges.size(); j++) {
			// N - 1 is a valid plan, new plan also has N - 1 edges
			if (usedEdges == N - 1) {
				break;
			}
			Edge temp = edges.get(j);
			if (!set.isUnion(temp.x, temp.y)) {
				set.union(temp.x, temp.y);
				if (!temp.used) {
					costDays += 1;
				}
				maxEdgeInPlan = temp;
				usedEdges += 1;
			}
		}
		set.reset();
		if (!maxEdgeInPlan.used) {
			for (int j = 0; j < edges.size(); j++) {
				Edge temp = edges.get(j);
				if (!set.isUnion(temp.x, temp.y)) {
					if (temp.weight < maxEdgeInPlan.weight || ((temp.weight == maxEdgeInPlan.weight) && temp.used)) {
						set.union(temp.x, temp.y);
					} else if (temp.used && temp.weight <= D) {
						costDays -= 1;
						break;
					}
				}
			}
		}
		return costDays;
	}
}

class Edge implements Comparable<Edge> {
	int x, y;
	int weight;
	boolean used;

	public Edge(int x, int y, int weight, boolean used) {
		this.x = x;
		this.y = y;
		this.weight = weight;
		this.used = used;
	}

	public int compareTo(Edge e) {
		if (this.weight != e.weight) {
			return this.weight > e.weight ? 1 : -1;
		} else if (this.used && !e.used) {
			return -1;
		} else if (!this.used && e.used) {
			return 1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return x + " <-> " + y + ", weight: " + weight + ", used:" + used;
	}
}

/**
 * A disjoint sets ADT. Performs union-by-rank and path compression. Implemented
 * using arrays. Root index has negative value represents the rank.
 *
 * Elements are represented by ints, numbered from zero.
 *
 **/

class DisjointSets {

	private int[] array;

	/**
	 * Construct a disjoint sets object.
	 *
	 * @param numElements the initial number of elements--also the initial number of
	 *                    disjoint sets, since every element is initially in its own
	 *                    set.
	 **/
	public DisjointSets(int numElements) {
		array = new int[numElements];
		for (int i = 0; i < array.length; i++) {
			array[i] = -1;
		}
	}

	/**
	 * merge() unites two disjoint sets into a single set. A union-by-rank heuristic
	 * is used to choose the new root. This method will corrupt the data structure
	 * if root1 and root2 are not roots of their respective sets, or if they're
	 * identical.
	 *
	 * @param root1 the root of the first set.
	 * @param root2 the root of the other set.
	 **/
	public void merge(int root1, int root2) {
		if (array[root2] < array[root1]) {
			array[root1] = root2; // root2 is taller; make root2 new root
		} else {
			if (array[root1] == array[root2]) {
				array[root1]--; // Both trees same height; new one is taller
			}
			array[root2] = root1; // root1 equal or taller; make root1 new root
		}
	}

	/**
	 * find() finds the (int) name of the set containing a given element. Performs
	 * path compression along the way.
	 *
	 * @param x the element sought.
	 * @return the set containing x.
	 **/
	public int find(int x) {
		if (array[x] < 0) {
			return x; // x is the root of the tree; return it
		} else {
			// Find out who the root is; compress path by making the root x's parent.
			array[x] = find(array[x]);
			return array[x]; // Return the root
		}
	}

	/**
	 * isUnion() check if two values are in the same set
	 * 
	 * @param x
	 * @param y
	 * @return boolean
	 **/
	public boolean isUnion(int x, int y) {
		return find(x) == find(y);
	}

	/**
	 * 
	 * 
	 **/
	public void reset() {
		for (int i = 0; i < array.length; i++) {
			array[i] = -1;
		}
	}
	
	public void union(int x, int y){
		merge(find(x), find(y));
	}
}