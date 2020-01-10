package junior2013;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class J13J4 {

	/*
	 * greedy algorithm
	 */
	public int run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		int totalMinutes = sc.nextInt();
		int task = 0;
		sc.nextInt();
		ArrayList<Integer> taskList = new ArrayList<>();
		while(sc.hasNext()) {
			taskList.add(sc.nextInt());
		}
		
		Collections.sort(taskList);
		while(taskList.size() > 0 && totalMinutes - taskList.get(0) >= 0) {
			totalMinutes -= taskList.get(0);
			taskList.remove(0);
			task += 1;
		}
		return task;
	}
}
