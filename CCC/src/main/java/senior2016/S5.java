package senior2016;

import java.io.BufferedReader;
import java.io.IOException;

public class S5 {

	public String run(BufferedReader br1) throws IOException {
		String[] input = br1.readLine().trim().split(" ");
		int N = Integer.parseInt(input[0]);
		long T = Long.parseLong(input[1]);
		String source = br1.readLine().trim();

		return produce(T, source);
	}

	public String produce(long T, String src) {
		String current = src;
		String next = "";
		for (int i = 0; i < T; i++) {
			next = nextGeneration(current);
			current = next;
		}
		return current;
	}

	public String nextGeneration(String current) {
		String next = "";
		for (int i = 0; i < current.length(); i++) {
			if (i == 0) {
				next = next + nextState(current.charAt(current.length() - 1), current.charAt(i + 1));
			} else if (i == current.length() - 1) {
				next = next + nextState(current.charAt(i - 1), current.charAt(0));
			} else {
				next = next + nextState(current.charAt(i - 1), current.charAt(i + 1));
			}
		}
		return next;
	}

	public char nextState(char left, char right) {
		if (left == '1' && right == '0') {
			return '1';
		}
		if (left == '0' && right == '1') {
			return '1';
		}
		return '0';
	}
}
