package junior2014;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;

public class J14J4 {
	public ArrayList<Integer> run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		int people = sc.nextInt();
		ArrayList<Integer> peopleList = new ArrayList<>();
		// add people 0 at the beginning
		peopleList.add(0);
		for(int i = 1; i <= people; i++) {
			peopleList.add(i);
		}
		int m = sc.nextInt();
		for(int i = 0; i < m; i++) {
			int removeIndex = sc.nextInt();
			int j = removeIndex;
			while(j < peopleList.size()) {
				peopleList.remove(j);
				j -= 1;
				j += removeIndex;				
			}
		}
		// remove the leading 0
		peopleList.remove(0);
		sc.close();
		return peopleList;
	}
}
