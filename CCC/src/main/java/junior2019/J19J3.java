package junior2019;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class J19J3 {
	public ArrayList<String> run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		ArrayList<String> result = new ArrayList<>();
//		skip first line
		sc.nextLine();
		while(sc.hasNext()) {
			result.add(encode(sc.nextLine()));
		}
		sc.close();
		return result;
	}

	public String encode(String input) {
		if (input.length() == 0) {
			return "0";
		}
		ArrayList<String> result = new ArrayList<>();
		char seen = input.charAt(0);
		int times = 1;
		for (int i = 1; i < input.length(); i++) {
			if(input.charAt(i) == seen) {
				times += 1;
			}
			else {
				result.add(Integer.toString(times));
				result.add(Character.toString(seen));
				seen = input.charAt(i);
				times = 1;
			}
		}
		result.add(Integer.toString(times));
		result.add(Character.toString(seen));
		
		return String.join(" ", result);
	}
}
