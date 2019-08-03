package senior2016;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

public class S4 {

	public static void main(String[] args) {
//		int[] a = { 47, 12, 12, 3, 9, 9, 3 };
		int[] b = { 600145, 600145, 780081, 780081 };
//		RiceRoll r1 = new RiceRoll(a);
		RiceRoll r2 = new RiceRoll(b);
//		System.out.println(new S4().makeRiceRoll(r1, 0));
		System.out.println(new S4().makeRiceRoll(r2, 0));
	}
	
	public int run(BufferedReader br1) throws IOException {
		br1.readLine();
		int[] input = Stream.of(br1.readLine().trim().split(" ")).mapToInt(Integer::parseInt).toArray();
		RiceRoll r = new RiceRoll(input);
		return makeRiceRoll(r, 0);
	}

	public int makeRiceRoll(RiceRoll r, int i) {
		if (i >= r.size() - 1) {
			return r.largestRiceBall();
		}
		
		RiceRoll rNoMerge = new RiceRoll(r);
		RiceRoll rMergeTwo = new RiceRoll(r);
		RiceRoll rMergeThree = new RiceRoll(r);

		if (r.canMergeTwo(i) && r.canMergeThree(i)) {
			rMergeTwo.mergeTwo(i);
			rMergeThree.mergeThree(i);
			return max(makeRiceRoll(rNoMerge, i + 1), makeRiceRoll(rMergeTwo, 0), makeRiceRoll(rMergeThree, 0));
		} else if (r.canMergeThree(i)) {
			rMergeThree.mergeThree(i);
			return Math.max(makeRiceRoll(rNoMerge, i + 1), makeRiceRoll(rMergeThree, 0));
		} else if (r.canMergeTwo(i)) {
			rMergeTwo.mergeTwo(i);
			return Math.max(makeRiceRoll(rNoMerge, i + 1), makeRiceRoll(rMergeTwo, 0));
		}

		return makeRiceRoll(rNoMerge, i + 1);
	}

	public int max(int x, int y, int z) {
		return Math.max(Math.max(x, y), z);
	}

}

class RiceRoll {

	ArrayList<Integer> roll;

	public ArrayList<Integer> getRoll() {
		return roll;
	}

	public RiceRoll() {
		roll = new ArrayList<>();
	}

	public RiceRoll(int[] a) {
		roll = new ArrayList<>();
		for (int element : a) {
			roll.add(element);
		}
	}

	public RiceRoll(RiceRoll r) {
		roll = (ArrayList<Integer>) r.getRoll().clone();
	}

	public int size() {
		return roll.size();
	}
	
	public int largestRiceBall() {
		return Collections.max(roll);
	}

	public void mergeTwo(int i) {
		roll.set(i, roll.get(i) + roll.get(i + 1));
		roll.remove(i + 1);

	}

	public void mergeThree(int i) {
		roll.set(i, roll.get(i) + roll.get(i + 1) + roll.get(i + 2));
		roll.remove(i + 2);
		roll.remove(i + 1);
	}

	public boolean canMergeTwo(int i) {
		if (i + 1 < roll.size() && roll.get(i).equals(roll.get(i + 1))) {
			return true;
		}

		return false;
	}

	public boolean canMergeThree(int i) {
		if (i + 2 < roll.size() && roll.get(i).equals(roll.get(i + 2))) {
			return true;
		}
		return false;
	}
}
