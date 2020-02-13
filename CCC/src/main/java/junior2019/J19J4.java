package junior2019;

import java.io.BufferedReader;
import java.util.Scanner;

/*
 * @author Patrick Wang
 */
public class J19J4 {
	public String run(BufferedReader br) {
		Scanner s = new Scanner(br);
		String list = s.nextLine();
		int hCounter = 0;
		int vCounter = 0;

		for (int i = 0; i < list.length(); i++) {
			if (list.charAt(i) == 'H') {
				hCounter++;
			} else if (list.charAt(i) == 'V') {
				vCounter++;
			}
		}

		if (hCounter % 2 == 1) {
			if (vCounter % 2 == 1) {
				return "4 3" + "\n" + "2 1";
			} else {
				return "3 4" + "\n" + "1 2";
			}
		} else {
			if (vCounter % 2 == 1) {
				return "2 1" + "\n" + "4 3";
			} else {
				return "1 2" + "\n" + "3 4";
			}
		}
	}
}
