package junior2016;

import java.io.BufferedReader;
import java.util.Scanner;

public class J4 {
	public static void main(String[] args) {
	}

	public String compute(BufferedReader br) {
		Scanner sc = new Scanner(br);
		String input = sc.nextLine().trim();
		sc.close();
		return arrive(input);
	}

	public static String arrive(String start) {
		double distance = 120.0;
		double nonRush = 1;
		double rush = 0.5;
		double current = 0.0;

		int currentTime = timeToMinutes(start);

		while (current < distance) {
			if ((currentTime >= 420 && currentTime < 600) || (currentTime >= 900 && currentTime < 1140)) {
				current += rush;
			} else {
				current += nonRush;
			}
			currentTime++;
		}
		return minutesToTime(currentTime);
	}

	/*
	 * This function converts "HH:MM" to minutes in integer
	 */
	public static int timeToMinutes(String time) {
		String[] e = time.split(":");
		int total = Integer.parseInt(e[0]) * 60 + Integer.parseInt(e[1]);
		return total;
	}

	/*
	 * This function converts minutes to "HH:MM"
	 */
	public static String minutesToTime(int minutes) {
		String result = "";
		if (minutes > 23 * 60 + 59) {
			minutes = minutes - (23 * 60 + 60);
		}
		int hour = minutes / 60;
		int minute = minutes % 60;
		if (hour < 10) {
			result = "0" + hour + ":";
		} else {
			result = hour + ":";
		}
		if (minute < 10) {
			result += "0" + minute;
		} else {
			result += minute;
		}
		return result;
	}
}