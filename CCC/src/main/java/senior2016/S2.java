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

		Arrays.sort(dmo);
		Arrays.sort(peg);

		if (question == 2) {
			int[] reversedDmo = IntStream.range(0, dmo.length).map(i -> dmo[dmo.length - i - 1]).toArray();
			return sum(reversedDmo, peg); 
		}
		
		return sum(dmo, peg);
	}

	private int sum(int[] dmo, int[] peg) {
		
		int sum = 0;
		for (int i = 0; i < dmo.length; i++) {
			sum += Math.max(dmo[i], peg[i]);
		}
		return sum;
	}

}
