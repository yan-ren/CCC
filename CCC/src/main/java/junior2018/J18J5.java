package junior2018;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * Graph problem, the problem is given as a adjacent list representation graph
 * traverse the graph, check if all vertex is visited and find the shortest path
 */
public class J18J5 {
	public String run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		Graph g = init(sc);

		return BSF(g);
	}

	public String BSF(Graph g) {
		boolean[] visitedVertex = new boolean[g.keySize() + 1];
		boolean allVisited = true;
		boolean found = false;
		int shortestPath = 1;
		int path = 1;
		List<Integer> current = new ArrayList<>();
		current.add(1);
		visitedVertex[1] = true;
		List<Integer> next = new ArrayList<>();
		while (current.size() > 0) {
			for (Integer i : current) {
				visitedVertex[i] = true;
				List<Integer> adj = g.getAdjVertices(i);
				if (adj == null) {
					if (!found) {
						shortestPath = path;
						found = true;
					}
					continue;
				}
				for (Integer j : adj) {
					if (visitedVertex[j] == false) {
						next.add(j);
					}
				}
			}
			path += 1;
			current = new ArrayList<Integer>(next);
			next.clear();
		}

		// check if all visited
		for (int i = 1; i < visitedVertex.length; i++) {
			if (visitedVertex[i] == false) {
				allVisited = false;
			}
		}

		return allVisited ? "Y" + shortestPath : "N" + shortestPath;
	}

	public static Graph init(Scanner sc) {
		Graph g = new Graph();
		int keyNum = Integer.parseInt(sc.nextLine());
		int n = 1;
		while (n <= keyNum) {
			String[] items = sc.nextLine().split(" ");
			List<Integer> itemList = Stream.of(items).map(Integer::parseInt)
					.collect(Collectors.toCollection(ArrayList::new));
			if (itemList.get(0) == 0) {
				g.addAdjVertexList(n, null);
			} else {
				g.addAdjVertexList(n, itemList.subList(1, itemList.size()));
			}
			n += 1;
		}

		return g;
	}
}

class Graph {
	private Map<Integer, List<Integer>> adjVertices;

	public Graph() {
		adjVertices = new HashMap<>();
	}

	void addAdjVertexList(int label1, List<Integer> label2) {
		adjVertices.putIfAbsent(label1, label2);
	}

	void addAdjVertex(int label1, int label2) {
		adjVertices.putIfAbsent(label1, new ArrayList<>());
		adjVertices.get(label1).add(label2);
	}

	List<Integer> getAdjVertices(int label) {
		return adjVertices.get(label);
	}

	public String toString() {
		return adjVertices.toString();
	}

	int keySize() {
		return adjVertices.keySet().size();
	}
}