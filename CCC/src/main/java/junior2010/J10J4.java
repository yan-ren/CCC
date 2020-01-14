package junior2010;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class J10J4 {

	public ArrayList<Integer> run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		ArrayList<Integer> output = new ArrayList<>();
		while (sc.hasNext()) {
			String input = sc.nextLine();
			if (input.trim().equals("0")) {
				break;
			}
			output.add(findCycle(input));
		}
		
		sc.close();
		return output;
	}

	/*
	 * one point starts at the first index of the cycle list. remove the first item
	 * in diff array one at a time, if same as the element in cycle list, put the
	 * item in duplicate list, increment the cycle list pointer, if the cycle
	 * pointer is reach the end of the cycle list, set pointer to 0. if element from
	 * diff list is not the same as cycle list, move all items in duplicate list to
	 * cycle list and empty the duplicate list, set the cycle list pointer to 0
	 * 
	 */
	public static int findCycle(String input) {
		String[] items = input.split(" ");
		// only one number in the sequence
		if (items.length == 2) {
			return 0;
		}
		// create diff array
		ArrayList<Integer> diff = new ArrayList<>();
		for (int i = 2; i < items.length; i++) {
			diff.add(Integer.parseInt(items[i]) - Integer.parseInt(items[i - 1]));
		}
		ArrayList<Integer> cycle = new ArrayList<>();
		// add the first one to the cycle list
		cycle.add(diff.remove(0));
		ArrayList<Integer> duplicate = new ArrayList<>();
		int i = 0;
		while (diff.size() > 0) {
			if (i == cycle.size()) {
				i = 0;
			}
			if (diff.get(0) != cycle.get(i)) {
				cycle.addAll(duplicate);
				cycle.add(diff.remove(0));
				i = 0;
				duplicate.clear();
			} else {
				i++;
				duplicate.add(diff.remove(0));
			}
		}
		return cycle.size();
	}
}
