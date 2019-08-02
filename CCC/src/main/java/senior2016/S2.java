package senior2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class S2 {
	public int pair(BufferedReader br1) throws NumberFormatException, IOException {
		int question = Integer.parseInt(br1.readLine());
		int citizen = Integer.parseInt(br1.readLine());
		int[] dmo = Stream.of(br1.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		int[] peg = Stream.of(br1.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		if (question == 1) {
			return q1(dmo, peg);
		} else if (question == 2) {
			return q2(dmo, peg);
		}
		return -1;
	}

	private int q1(int[] dmo, int[] peg) {
		Arrays.sort(dmo);
		Arrays.sort(peg);
		int sum = 0;
		for (int i = 0; i < dmo.length; i++) {
			sum += Math.max(dmo[i], peg[i]);
		}
		return sum;
	}

	private int q2(int[] dmo, int[] peg) {
		Arrays.sort(dmo);
		Arrays.sort(peg);
		int[] reversedDmo = IntStream.range(0, dmo.length).map(i -> dmo[dmo.length-i-1])
                .toArray();
		int sum = 0;
		for (int i = 0; i < dmo.length; i++) {
			sum += Math.max(reversedDmo[i], peg[i]);
		}
		return sum;
	}
}
