package junior2006;

import java.io.BufferedReader;
import java.util.Scanner;
import java.util.StringJoiner;

public class J06J5 {

	public static void main(String[] args) {

	}

	/*
	 * use a int 2d array to represent the board, 1 is the black, 2 is the white, 0
	 * is empty
	 */
	public String run(BufferedReader br) {
		Scanner sc = new Scanner(br);

		String[] input = sc.nextLine().split(" ");
		int[][] board = boardInit(input[0]);
		int steps = Integer.parseInt(input[1]);
		int i = 0;
		int type = 1;
//		printBoard(board);
//		System.out.println();
		while (steps > 0) {
			move(board, Integer.parseInt(input[i + 2]), Integer.parseInt(input[i + 3]), type);
			if (type == 1) {
				type = 2;
			} else {
				type = 1;
			}
			i += 2;
			steps--;
//			printBoard(board);
//			System.out.println();
		}
		int black = count(board, 1);
		int white = count(board, 2);
		return black + " " + white;
	}

	public static int count(int[][] board, int t) {
		int counter = 0;
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				if (board[i][j] == t) {
					counter++;
				}
			}
		}
		return counter;
	}

	public static void move(int[][] board, int r, int c, int type) {
		r--;
		c--;
//		System.out.println("move to r:" + r + ", c:" + c);
		board[r][c] = type;
		// left
		int i = r;
		int j = c - 1;
		while (j >= 0) {
			if (board[i][j] == type || board[i][j] == 0) {
				break;
			}
			j--;
		}
		if (j >= 0 && board[i][j] == type) {
			int k = c - 1;
			while (k > j) {
				board[i][k] = type;
				k--;
			}
		}
		// left up
		i = r - 1;
		j = c - 1;
		while (i >= 0 && j >= 0) {
			if (board[i][j] == type || board[i][j] == 0) {
				break;
			}
			i--;
			j--;
		}
		if (i >= 0 && j >= 0 && board[i][j] == type) {
			int m = r;
			int n = c;
			while (m > i && n > j) {
				board[m][n] = type;
				m--;
				n--;
			}
		}
		// up
		i = r - 1;
		j = c;
		while (i >= 0) {
			if (board[i][j] == type || board[i][j] == 0) {
				break;
			}
			i--;
		}
		if (i >= 0 && board[i][j] == type) {
			int m = r;
			int n = c;
			while (m > i) {
				board[m][n] = type;
				m--;
			}
		}
		// up right
		i = r - 1;
		j = c + 1;
		while (i >= 0 && j < board.length) {
			if (board[i][j] == type || board[i][j] == 0) {
				break;
			}
			i--;
			j++;
		}
		if (i >= 0 && j < board.length && board[i][j] == type) {
			int m = r;
			int n = c;
			while (m > i && n < j) {
				board[m][n] = type;
				m--;
				n++;
			}
		}
		// right
		i = r;
		j = c + 1;
		while (j < board.length) {
			if (board[i][j] == type || board[i][j] == 0) {
				break;
			}
			j++;
		}
		if (j < board.length && board[i][j] == type) {
			while (j > c) {
				board[i][j] = type;
				j--;
			}
		}
		// right down
		i = r + 1;
		j = c + 1;
		while (i < board.length && j < board.length) {
			if (board[i][j] == type || board[i][j] == 0) {
				break;
			}
			i++;
			j++;
		}
		if (i < board.length && j < board.length && board[i][j] == type) {
			while (i > r && j > c) {
				board[i][j] = type;
				i--;
				j--;
			}
		}
		// down
		i = r + 1;
		j = c;
		while (i < board.length) {
			if (board[i][j] == type || board[i][j] == 0) {
				break;
			}
			i++;
		}
		if (i < board.length && board[i][j] == type) {
			while (i > r) {
				board[i][j] = type;
				i--;
			}
		}
		// down left
		i = r + 1;
		j = c - 1;
		while (i < board.length && j >= 0) {
			if (board[i][j] == type || board[i][j] == 0) {
				break;
			}
			i++;
			j--;
		}
		if (i < board.length && j >= 0 && board[i][j] == type) {
			while (i > r && j < c) {
				board[i][j] = type;
				i--;
				j++;
			}
		}
	}

	public static int[][] boardInit(String type) {
		int[][] board = new int[8][8];
		if (type.equals("a")) {
			board[3][3] = 2;
			board[4][4] = 2;
			board[3][4] = 1;
			board[4][3] = 1;
		} else if (type.equals("b")) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					if (i == j) {
						board[i][j] = 1;
					} else if (i + j == board.length - 1) {
						board[i][j] = 2;
					}
				}
			}
		} else if (type.equals("c")) {
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board.length; j++) {
					if (j == 2 || j == 3) {
						board[i][j] = 1;
					} else if (j == 4 || j == 5) {
						board[i][j] = 2;
					}
				}
			}
		}

		return board;
	}

	public static void printBoard(int[][] board) {
		String lineSplit = "";
		StringJoiner splitJoiner = new StringJoiner("+", "|", "|");
		for (int index = 0; index < board[0].length; index++) {
			splitJoiner.add(String.format("%3s", "").replace(" ", "-"));
		}
		lineSplit = splitJoiner.toString();
		for (int[] row : board) {
			StringJoiner sj = new StringJoiner(" | ", "| ", " |");
			for (int col : row) {
				sj.add(String.format("%01d", col));
			}
			System.out.println(lineSplit);
			System.out.println(sj.toString());
		}
		System.out.println(lineSplit);
	}
}
