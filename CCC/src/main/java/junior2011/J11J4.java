package junior2011;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class J11J4 {

	static boolean[][] map;
	static int xR;
	static int yR;
	static int xV;
	static int yV;
	static int xDelta;
	static int yDelta;

	public ArrayList<String> run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		initialize();
		ArrayList<String> comments = new ArrayList<>();
		while (sc.hasNext()) {
			String command = sc.nextLine();
			if (command.contains("q")) {
				break;
			}
			String comment = move(command);
			if (comment.contains("DANGER")) {
				comments.add(comment);
				break;
			}
			comments.add(comment);
		}
		sc.close();
		return comments;
	}
	
	public static void initialize() {
		map = new boolean[400][400];
		xR = -1;
		yR = -5;
		xV = map.length / 2;
		yV = map.length / 2;
		xDelta = xV - xR;
		yDelta = yV - yR;
	}

	public static String move(String command) {
		String[] items = command.split(" ");
		int moves = Integer.parseInt(items[1]);
		boolean danger = false;
		if(items[0].equals("u")) {
			while(moves > 0) {
				yV += 1;
				if(map[xV][yV] == false) {
					map[xV][yV] = true;
				}else {
					danger = true;
				}
				moves -= 1;
			}
		}
		
		if(items[0].equals("d")) {
			while(moves > 0) {
				yV -= 1;
				if(map[xV][yV] == false) {
					map[xV][yV] = true;
				}else {
					danger = true;
				}
				moves -= 1;
			}
		}
		
		if(items[0].equals("l")) {
			while(moves > 0) {
				xV -= 1;
				if(map[xV][yV] == false) {
					map[xV][yV] = true;
				}else {
					danger = true;
				}
				moves -= 1;
			}
		}
		
		if(items[0].equals("r")) {
			while(moves > 0) {
				xV += 1;
				if(map[xV][yV] == false) {
					map[xV][yV] = true;
				}else {
					danger = true;
				}
				moves -= 1;
			}
		}
		return danger? (xV - xDelta) + " " + (yV - yDelta) + " " + "DANGER" : (xV - xDelta) + " " + (yV - yDelta) + " " + "safe";
	}
}
