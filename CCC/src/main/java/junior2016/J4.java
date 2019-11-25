package junior2016;

import java.io.BufferedReader;
import java.util.Scanner;

public class J4 {
	public static void main(String[] args) {
//		System.out.println(arrive("05:00"));
//		System.out.println(arrive("07:00"));
//		System.out.println(arrive("23:20"));
//		System.out.println(timeToMinutes("23:20"));
//		System.out.println(minutesToTime(1440));

//		int distance = 0;
//		String time = "07:40";
//		while(distance < 240){
//			distance = distance + move(time);
//			time = addTime(time, "00:01");
//		}
//		System.out.println(time);
	}
	
	public String compute(BufferedReader br) {
		Scanner sc = new Scanner(br);
		return arrive(sc.nextLine().trim());
	}

	public static String arrive(String start) {
		double distance = 120.0;
		double nonRush = 1;
		double rush = 0.5;
		double current = 0.0;

		int currentTime = timeToMinutes(start);

		while (current < distance) {
			if ((currentTime >= 420 && currentTime < 600) || (currentTime >= 900  && currentTime < 1140)) {
				current += rush;
			}else {
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

	public static int convertTime(String time) {
		// "10:00" -> 1000
		// "09:45"-> 945
		// "13:23" -> 1323
		String[] e = time.split(":");
		String total = "";
		for (String i : e) {
			total += i;
		}
		return Integer.parseInt(total.trim());
	}

	public static String addTime(String a, String b) {
//		System.out.println(a);
//		System.out.println(b);
		int hha = Integer.parseInt(a.split(":")[0]);
		int hhb = Integer.parseInt(b.split(":")[0]);
		int mma = Integer.parseInt(a.split(":")[1]);
		int mmb = Integer.parseInt(b.split(":")[1]);
		int mm;
		int hh;
		String result;
		if (mma + mmb >= 60) {
			mm = (mma + mmb) % 60;
			hh = (hha + hhb + 1) % 24;
		} else {
			mm = mma + mmb;
			hh = hha + hhb;
		}
		if (hh <= 9) {
			result = "0" + hh + ":";
		} else {
			result = Integer.toString(hh) + ":";
		}
		if (mm <= 9) {
			result += "0" + mm;
		} else {
			result += Integer.toString(mm);
		}
		return result;
	}

	public static int move(String time) {
		int timeInDigits = convertTime(time);
		if (timeInDigits < 700) {
			return 2;
		} else if (timeInDigits < 1000) {
			return 1;
		} else if (timeInDigits < 1500) {
			return 2;
		} else if (timeInDigits < 1900) {
			return 1;
		}
		return 2;
	}
}