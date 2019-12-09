package junior2008;

import java.io.BufferedReader;
import java.util.Scanner;

public class J08J5 {
	static char[] used;

	public static void main(String[] args) {
		int a, b, c, d, n;
		a = 8;
		b = 8;
		c = 6;
		d = 7;
		// Roland
		if (patrickWins(a, b, c, d))
			System.out.println("Patrick");
		else
			System.out.println("Roland");
	}
	
	public String run(int[] input) {
		if(input.length != 4) {
			return null;
		}
		
		return patrickWins(input[0], input[1], input[2], input[3])? "Patrick": "Roland";
	}

	public static boolean canDoAABDD(int a, int b, int c, int d) {
		return a >= 2 && b >= 1 && d >= 2;
	}

	public static boolean canDoABCD(int a, int b, int c, int d) {
		return a >= 1 && b >= 1 && c >= 1 && d >= 1;
	}

	public static boolean canDoCCD(int a, int b, int c, int d) {
		return c >= 2 && d >= 1;
	}

	public static boolean canDoBBB(int a, int b, int c, int d) {
		return b >= 3;
	}

	public static boolean canDoAD(int a, int b, int c, int d) {
		return a >= 1 && d >= 1;
	}

	public static boolean canMove(int a, int b, int c, int d) {
		return canDoAABDD(a, b, c, d) || canDoABCD(a, b, c, d) || canDoCCD(a, b, c, d) || canDoBBB(a, b, c, d)
				|| canDoAD(a, b, c, d);
	}

	// lose if you can't move or if all possible moves you can do lead to a
	// winning combo
	public static boolean rolandLoses(int a, int b, int c, int d) {
		if (!canMove(a, b, c, d))
			return true;
		else {
			boolean temp = true;
			if (canDoAABDD(a, b, c, d))
				temp = temp && patrickWins(a - 2, b - 1, c, d - 2);
			if (canDoABCD(a, b, c, d))
				temp = temp && patrickWins(a - 1, b - 1, c - 1, d - 1);
			if (canDoCCD(a, b, c, d))
				temp = temp && patrickWins(a, b, c - 2, d - 1);
			if (canDoBBB(a, b, c, d))
				temp = temp && patrickWins(a, b - 3, c, d);
			if (canDoAD(a, b, c, d))
				temp = temp && patrickWins(a - 1, b, c, d - 1);
			return temp;
		}
	}

	// win if at least one rule creates a losing combo
	public static boolean patrickWins(int a, int b, int c, int d) {
		if (canDoAABDD(a, b, c, d) && rolandLoses(a - 2, b - 1, c, d - 2))
			return true;
		else if (canDoABCD(a, b, c, d) && rolandLoses(a - 1, b - 1, c - 1, d - 1))
			return true;
		else if (canDoCCD(a, b, c, d) && rolandLoses(a, b, c - 2, d - 1))
			return true;
		else if (canDoBBB(a, b, c, d) && rolandLoses(a, b - 3, c, d))
			return true;
		else if (canDoAD(a, b, c, d) && rolandLoses(a - 1, b, c, d - 1))
			return true;
		else
			return false;
	}

}
