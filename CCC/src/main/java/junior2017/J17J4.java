package junior2017;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class J17J4 {
	
	/*
	 * 12 * 60 = 720
	 * when duration > 720
	 * times = times happended in 720 * duration / 720 + duration - duration / 720 * 720
	 */
	public int run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		int duration = sc.nextInt();
		int cycle = duration / 720;
		int result;
		
		if (cycle > 0) {
			result = count(720) * cycle + count(duration - duration / 720 * 720);
		}else {
			result = count(duration);
		}
		return result;
	}
	
	public static int count(int duration) {
		int start = 1201;
		int counter = 0;
		while(duration > 0) {
			if(checkSequence(start)) {
				counter += 1;
			}
			start += 1;
			duration -= 1;
			if (start == 1260) {
				start = 100;
			}else if (start == 160) {
				start = 200;
			}else if (start == 260) {
				start = 300;
			}else if (start == 360) {
				start = 400;
			}else if (start == 460) {
				start = 500;
			}else if (start == 560) {
				start = 600;
			}else if (start == 660) {
				start = 700;
			}else if (start == 760) {
				start = 800;
			}else if (start == 860) {
				start = 900;
			}else if (start == 960) {
				start = 1000;
			}else if (start == 1060) {
				start = 1100;
			}
		}
		return counter;
	}
	
	public static boolean checkSequence(int time) {
        List<Integer> digits = new ArrayList<>();
        
        for (; time != 0; time /= 10) {        	
        	digits.add(time % 10);
        }
        int diff = digits.get(1) - digits.get(0);
        for (int i = 0; i < digits.size() - 1; i++) {
        	if (digits.get(i + 1) - digits.get(i) != diff) {
        		return false;
        	}
        }
    
		return true;
	}
}
