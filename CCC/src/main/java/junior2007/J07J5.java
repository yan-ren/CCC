package junior2007;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class J07J5 {
	private int A = 1; // 1 < A < B < 7000
	private int B = 1;
	private ArrayList<Integer> motels = new ArrayList<>(
			Arrays.asList(0, 990, 1010, 1970, 2030, 2940, 3060, 3930, 4060, 4970, 5030, 5990, 6010, 7000));
	private int ways = 0;

	public J07J5() {
	}

	public J07J5(int A, int B) {
		this.A = A;
		this.B = B;
	}

	public void findPath(int distance) {
		if (distance == 7000) {
			ways++;
		} else {
			for (int i = 0; i < motels.size(); i++) {
				if (motels.get(i) - distance < B && motels.get(i) - distance > A) {
					findPath(motels.get(i));
				}
			}
		}
	}

	public void addMotel(int m) {
		motels.add(m);
	}

	public int getWays() {
		findPath(0);
		return ways;
	}

	public void sortMotels() {
		Collections.sort(motels);
	}
}
