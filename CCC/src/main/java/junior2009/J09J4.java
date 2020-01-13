package junior2009;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class J09J4 {
	
	public ArrayList<String> run(BufferedReader br) {
		ArrayList<String> result = new ArrayList<>();
		Queue<String> words = new LinkedList<>();
		words.add("WELCOME");
		words.add("TO");
		words.add("CCC");
		words.add("GOOD");
		words.add("LUCK");
		words.add("TODAY");
		Scanner sc = new Scanner(br);
		int w = sc.nextInt();
		String currentLine = words.remove();

		while (words.size() > 0) {
			// if no space for .xxxx word
			if (words.peek().length() + 1 > w - currentLine.length()) {
				result.add(appendSpace(currentLine, w));
				currentLine = "";
			} else {
				if (currentLine.equals("")) {
					currentLine += words.remove();
				} else {
					currentLine += "." + words.remove();
				}
			}
		}

		if (!currentLine.equals("")) {
			result.add(appendSpace(currentLine, w));
		}

		return result;
	}

	/*
	 * WELCOME.TO.CCC -> WELCOME..TO.CCC 
	 * TODAY. -> TODAY.....................
	 */
	public static String appendSpace(String input, int w) {
		System.out.println(input);
		if(!input.contains(".")) {
			while(input.length() < w) {
				input += ".";
			}
		}else {
			int startIndex = 0;
			int round = 1;
			while(input.length() < w){
				// find next .
				if(input.indexOf(".", startIndex) != -1) {
					startIndex = input.indexOf(".", startIndex) + round;
				}else {
				// reach the end, cannot find next ., round back
					startIndex = 0;
					round += 1;
					startIndex = input.indexOf(".", startIndex) + round;
				}
				input = input.substring(0, startIndex) + "." + input.substring(startIndex);
				startIndex = startIndex + 1;
			}
		}
		return input;
	}
}
