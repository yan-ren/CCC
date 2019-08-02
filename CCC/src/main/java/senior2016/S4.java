package senior2016;

import java.util.ArrayList;
import java.util.Collections;

public class S4 {

	public static void main(String[] args) {
		int[] a = { 47, 12, 12, 3, 9, 9, 3 };
		RiceRoll r = new RiceRoll(a);
		int i = 0;
		int j = r.size();

	}

//	public int makeRiceBall(RiceRoll r, int i, int j) {
//		return max(makeRiceBall(r, i+1, j), makeRiceBall(i + 1, ))
//	}

	public int max(int x, int y, int z) {
		return Math.max(Math.max(x, y), z);
	}

}

class RiceRoll {

	ArrayList<Integer> roll;

	public RiceRoll() {
		roll = new ArrayList<>();
	}

	public RiceRoll(int[] a) {
		roll = new ArrayList<>();
		for (int element : a) {
			roll.add(element);
		}
	}

	public int size() {
		return roll.size();
	}

	public void addRiceBall(int a) {
		roll.add(a);
	}

	public int largestRiceBall() {
		return Collections.max(roll);
	}

	public void merge(int i, int j) {
		if (canBeMerged(i, j)) {
			if (j - i == 1) {
				roll.set(i, roll.get(i) + roll.get(j));
				roll.remove(j);
			}

			if (j - i == 2) {
				roll.set(i, roll.get(i) + roll.get(i + 1) + roll.get(i + 2));
				roll.remove(i + 1);
				roll.remove(i + 2);
			}
		}
	}

	public boolean canBeMerged(int i, int j) {
		if (j - i == 1 && roll.get(i) == roll.get(j)) {
			return true;
		}
		if (j - i == 2 && roll.get(i) == roll.get(j)) {
			return true;
		}

		return false;
	}
}
