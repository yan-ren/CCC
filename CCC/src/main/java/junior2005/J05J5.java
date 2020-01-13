package junior2005;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class J05J5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMonkeyWord("BANANA"));
	}

	public ArrayList<String> run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		ArrayList<String> result = new ArrayList<>();
		while (sc.hasNext()) {
			String newLine = sc.nextLine();
			if (newLine.equals("X")) {
				break;
			}

			if (isMonkeyWord(newLine.trim())) {
				result.add("YES");
			} else {
				result.add("NO");
			}
		}
		sc.close();
		return result;
	}

	public static boolean isMonkeyWord(String word) {
		//base case
		if (word.equals("A")) {
			return true;
		}
		//recursive case
		if ((word.startsWith("B") && word.endsWith("S")) && isMonkeyWord(word.substring(1, word.length() - 1))) {
			return true;
		}
		if (word.contains("N")) {
			for(int i = 0; i < word.length(); i++){
				if(word.charAt(i) == 'N' && isMonkeyWord(word.substring(0, i))
						&& isMonkeyWord(word.substring(i+1))){
					return true;
				}
			}
		}
		return false;
	}
}
