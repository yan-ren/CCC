package junior2010;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class J10J5 {
	public int run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		String[] input = sc.nextLine().split(" ");
		Point start = new Point(Integer.parseInt(input[0]) - 1, Integer.parseInt(input[1]) - 1);
		input = sc.nextLine().split(" ");
		Point end = new Point(Integer.parseInt(input[0]) - 1, Integer.parseInt(input[1]) - 1);
		sc.close();
		return move(start, end);
	}

	@SuppressWarnings("unchecked")
	public static int move(Point start, Point end) {
		if (start.x == end.x && start.y == end.y) {
			return 0;
		}
		boolean[][] map = new boolean[8][8];
		ArrayList<Point> current = new ArrayList<>();
		ArrayList<Point> next = new ArrayList<>();
		current.add(start);
		int move = 1;
		while (current.size() > 0) {
			for (Point a : current) {
				// case 1 - 8
				if (moveType(1, 2, a, end, map, next) || moveType(2, 1, a, end, map, next)
						|| moveType(2, -1, a, end, map, next) || moveType(1, -2, a, end, map, next)
						|| moveType(-1, -2, a, end, map, next) || moveType(-2, -1, a, end, map, next)
						|| moveType(-2, 1, a, end, map, next) || moveType(-1, 2, a, end, map, next)) {
					return move;
				}
			}
			move += 1;
			current = (ArrayList<Point>) next.clone();
			next.clear();
		}
		return -1;
	}

	public static boolean moveType(int xMove, int yMove, Point current, Point end, boolean[][] map,
			ArrayList<Point> next) {
		if (current.x + xMove >= map.length || current.x + xMove < 0 || current.y + yMove >= map[0].length
				|| current.y + yMove < 0) {
			return false;
		}
		if (current.x + xMove == end.x && current.y + yMove == end.y) {
			return true;
		} else if (!map[current.x + xMove][current.y + yMove]) {
			map[current.x + xMove][current.y + yMove] = true;
			next.add(new Point(current.x + xMove, current.y + yMove));
		}
		return false;
	}
}

class Point {
	int x;
	int y;

	Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public String toString() {
		return "(" + this.x +", " + this.y + ")";
	}
}