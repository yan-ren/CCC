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
		while(sc.hasNext()) {
			String newLine = sc.nextLine();
			if (newLine.equals("X")) {
				break;
			}
			
			if(isMonkeyWord(newLine.trim())) {				
				result.add("YES");
			}
			else {
				result.add("NO");
			}
		}
		return result;
	}
	
	public static boolean isMonkeyWord(String word) {
        if (word.equals("A")) {
            return true;
        }
 
        else if (word.startsWith("B") && word.endsWith("S")) {
            if (isMonkeyWord(word.substring(1, word.length() - 1))) {
                return true;
            } else {
                return false;
            }
        } else if (word.startsWith("AN")) {
            if (isMonkeyWord(word.substring(2, word.length()))) {
                return true;
            } else {
                return false;
            }
        } else if (word.startsWith("B")) {
            String[] twoParts = word.substring(1, word.length()).split("SN");
            if (twoParts.length != 2) {
                return false;
            } else if (isMonkeyWord(twoParts[0]) && isMonkeyWord(twoParts[1])) {
                return true;
            } else {
                return false;
            }
        }
 
        return false;
 
    }

}
