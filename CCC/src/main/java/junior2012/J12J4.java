package junior2012;

import java.io.BufferedReader;
import java.util.Scanner;

public class J12J4 {
	public String run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		int K = Integer.parseInt(sc.nextLine());
		String encodedMsg = sc.nextLine();
		return decode(encodedMsg, K);
	}

	public static String decode(String encoded, int K) {
		String result = "";
		for (int i = 0; i < encoded.length(); i++) {
			int ascii = (int) (encoded.charAt(i));
			int rotate = 3 * (i + 1) + K;
			ascii -= rotate;
			if (ascii < 65) {
				ascii += 26;
			}
			result += (char) ascii;
		}
		return result;
	}
}
