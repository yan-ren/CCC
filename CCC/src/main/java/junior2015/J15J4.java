package junior2015;

import java.io.BufferedReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class J15J4 {
	public String run(BufferedReader br) {
		TreeMap<Integer, Integer> timeTable = new TreeMap<>();
		int[] friends = new int[200];
		int time = 1;
		String result = "";
		Scanner sc = new Scanner(br);
		// first line not used
		sc.nextLine();
		//
		while (sc.hasNextLine()) {
			String[] tmp = sc.nextLine().split(" ");
			int friend = Integer.parseInt(tmp[1]);
			System.out.println(friend);
			if (tmp[0].equals("R")) {
				friends[friend] = time;
				if (!timeTable.containsKey(friend)) {
					timeTable.put(friend, -1);
				}
				time++;
			}
			if (tmp[0].equals("S")) {
				if (timeTable.get(friend) == -1) {
					timeTable.put(friend, time - friends[friend]);
				}else {
					timeTable.put(friend, timeTable.get(friend) + (time - friends[friend]));
				}
				time++;
			}

			if (tmp[0].equals("W")) {
				time = time + friend - 1;
			}

		}
		
		Set<Integer> keys = timeTable.keySet();
		for(Integer key: keys) {
			result += key + " " + timeTable.get(key);
		}
		System.out.println(timeTable);
		return result;
	}
}
