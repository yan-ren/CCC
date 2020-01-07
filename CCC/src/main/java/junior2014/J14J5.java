package junior2014;

import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Scanner;

public class J14J5 {
	public String run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		// skip first line
		sc.nextLine();
		// get line 2 and 3
		String[] line2 = sc.nextLine().split(" ");
		String[] line3 = sc.nextLine().split(" ");
		
		HashMap<String, String> match = new HashMap<>();
		for(int i = 0; i < line2.length; i++) {
			if(line2[i].equals(line3[i])) {
				return "bad";
			}
			match.put(line2[i], line3[i]);
		}
		
		for(int i = 0; i < line3.length; i++) {
			if(!match.get(line3[i]).equals(line2[i])) {
				return "bad";
			}
		}
		return "good";
	}
}
