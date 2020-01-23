package junior2009;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class J09J5 {

	/*
	 * Graph problem
	 * 
	 * Represent the relationships as graph
	 * 
	 * i x y – make person x and person y friends. If they are already friends, no
	 * change needs to be made. If either x or y is a new person, add them. - add edge/vertex to
	 * the graph
	 * 
	 * d x y – delete the friendship between person x and person y. - delete edge from
	 * the graph
	 * 
	 * n x – output the number of friends that person x has. - output the adjacent
	 * vertex
	 * 
	 * f x – output the number of “friends of friends” that person x has. Notice
	 * that x and direct friends of x are not counted as “friends of friends.” -
	 * 
	 * s x y – output the degree of separation between x and y. If there is no path
	 * from x to y, output Not connected - single source shortest path problem
	 * 
	 */
	public ArrayList<String> run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		ArrayList<String> result = new ArrayList<>();
		Graph graph = initGraph();
		while (sc.hasNext()) {
			String task = sc.next();
			if (task.equals("q")) {
				break;
			} else if (task.equals("i")) {
				graph.makeFriends(sc.nextInt(), sc.nextInt());
			} else if (task.equals("d")) {
				graph.deleteFriends(sc.nextInt(), sc.nextInt());
			} else if (task.equals("n")) {
				result.add(Integer.toString(graph.findFriends(sc.nextInt())));
			} else if (task.equals("f")) {
				result.add(Integer.toString(graph.findFriendsOfFriends(sc.nextInt())));
			} else if (task.equals("s")) {
				result.add(graph.findSeperation(sc.nextInt(), sc.nextInt()));
			}
		}
		sc.close();
		return result;
	}

	public static Graph initGraph() {
		Graph g = new Graph();
		g.makeFriends(2, 6);
		g.makeFriends(1, 6);
		g.makeFriends(7, 6);
		g.makeFriends(3, 6);
		g.makeFriends(4, 6);
		g.makeFriends(5, 6);
		g.makeFriends(7, 8);
		g.makeFriends(3, 4);
		g.makeFriends(4, 5);
		g.makeFriends(3, 15);
		g.makeFriends(3, 5);
		g.makeFriends(8, 9);
		g.makeFriends(12, 9);
		g.makeFriends(9, 10);
		g.makeFriends(12, 11);
		g.makeFriends(11, 10);
		g.makeFriends(15, 13);
		g.makeFriends(12, 13);
		g.makeFriends(13, 14);
		g.makeFriends(16, 18);
		g.makeFriends(16, 17);
		g.makeFriends(17, 18);
		return g;
	}
}

class Vertex {
	int label;
	int cost = 1;

	Vertex(int label) {
		this.label = label;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + label;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vertex other = (Vertex) obj;
		if (label != other.label)
			return false;
		return true;
	}
}

class Graph {
	private Map<Vertex, List<Vertex>> adjVertices;

	public Graph() {
		adjVertices = new HashMap<>();
	}

	void makeFriends(int label1, int label2) {
		adjVertices.putIfAbsent(new Vertex(label1), new ArrayList<>());
		adjVertices.putIfAbsent(new Vertex(label2), new ArrayList<>());
		addEdge(label1, label2);
	}

	void deleteFriends(int label1, int label2) {
		removeEdge(label1, label2);
	}

	int findFriends(int label) {
		if (!adjVertices.containsKey(new Vertex(label))) {
			return 0;
		}
		return getAdjVertices(label).size();
	}

	int findFriendsOfFriends(int label) {
		if (!adjVertices.containsKey(new Vertex(label))) {
			return 0;
		}
		Set<Vertex> friends = new HashSet<>(getAdjVertices(label));
		friends.add(new Vertex(label));
		Set<Vertex> friendsOfFriends = new HashSet<>();
		for (Vertex v : friends) {
			List<Vertex> f = getAdjVertices(v.label);
			for (Vertex fof : f) {
				if (!friends.contains(fof)) {
					friendsOfFriends.add(fof);
				}
			}
		}
		return friendsOfFriends.size();
	}

	void addVertex(int label) {
		adjVertices.putIfAbsent(new Vertex(label), new ArrayList<>());
	}

	void removeVertex(int label) {
		Vertex v = new Vertex(label);
		adjVertices.values().stream().forEach(e -> e.remove(v));
		adjVertices.remove(new Vertex(label));
	}

	void addEdge(int label1, int label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		adjVertices.get(v1).add(v2);
		adjVertices.get(v2).add(v1);
	}

	void removeEdge(int label1, int label2) {
		Vertex v1 = new Vertex(label1);
		Vertex v2 = new Vertex(label2);
		List<Vertex> eV1 = adjVertices.get(v1);
		List<Vertex> eV2 = adjVertices.get(v2);
		if (eV1 != null)
			eV1.remove(v2);
		if (eV2 != null)
			eV2.remove(v1);
	}

	String findSeperation(int src, int target) {
		int sep = BFS(src, target);
		return sep == 0 ? "Not connected" : Integer.toString(sep);
	}

	/*
	 * Find the shortest path between two points in graph, since this graph is the
	 * special case, which we can assign each edge with weight 1. We can use BFS for
	 * this case
	 */
	int BFS(int src, int target) {
		int path = 1;
		Vertex targetV = new Vertex(target);
		Set<Vertex> visited = new HashSet<>();
		Set<Vertex> current = new HashSet<>();
		current.add(new Vertex(src));
		Set<Vertex> next = new HashSet<>();
		while (current.size() > 0) {
			for (Vertex v : current) {
				List<Vertex> friends = adjVertices.get(v);
				for (Vertex friend : friends) {
					if (friend.equals(targetV)) {
						return path;
					} else if (!visited.contains(friend)) {
						next.add(friend);
					}
				}
				visited.add(v);
			}
			current = new HashSet<>(next);
			next.clear();
			path += 1;
		}
		return 0;
	}

	List<Vertex> getAdjVertices(int label) {
		return adjVertices.get(new Vertex(label));
	}
}
