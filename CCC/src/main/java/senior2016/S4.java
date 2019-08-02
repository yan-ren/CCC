package senior2016;

import java.util.ArrayList;
import java.util.Collections;

public class S4 {

	public static void main(String[] args) {

	}

}

class RiceRoll {

	ArrayList<Integer> roll;

	public RiceRoll() {
		roll = new ArrayList<>();
	}
	
	public RiceRoll(int[] a) {
		roll = new ArrayList<>();
		for(int element: a) {
			roll.add(element);
		}
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
