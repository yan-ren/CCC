package junior2006;

import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

class Constraint {
	int x;
	int y;

	public Constraint(int x, int y) {
		this.x = x;
		this.y = y;
	}
}

class Status {
	int x;
	boolean ready;

	public Status(int x, boolean ready) {
		this.x = x;
		this.ready = ready;
	}
}

public class J06J4 {

	public static void main(String[] args) {

	}

	public String run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		ArrayList<Constraint> constraints = new ArrayList<>();
		constraints.add(new Constraint(1, 7));
		constraints.add(new Constraint(1, 4));
		constraints.add(new Constraint(2, 1));
		constraints.add(new Constraint(3, 4));
		constraints.add(new Constraint(3, 5));

		ArrayList<Status> readyList = new ArrayList<>();
		readyList.add(new Status(1, true));
		readyList.add(new Status(2, true));
		readyList.add(new Status(3, true));
		readyList.add(new Status(4, true));
		readyList.add(new Status(5, true));
		readyList.add(new Status(6, true));
		readyList.add(new Status(7, true));

		while (sc.hasNext()) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if (a != 0 && b != 0) {
				constraints.add(new Constraint(a, b));
			}
		}
		return makeOrder(constraints, readyList);
	}

	public static String makeOrder(ArrayList<Constraint> constraints, ArrayList<Status> readyList) {
		ArrayList<Integer> done = new ArrayList<>();

		while (true) {
			// reset status
			for (Status s : readyList) {
				s.ready = true;
			}
			// go through constraints set status
			for (Constraint c : constraints) {
				for (Status s : readyList) {
					if (c.y == s.x) {
						s.ready = false;
					}
				}
			}

			// exit
			boolean available = false;
			// when ready is empty, finish with done list
			if (readyList.size() == 0) {
//				System.out.println(done);
				return done.stream().map(String::valueOf).collect(Collectors.joining(" "));
			}
			// if ready list is not empty and nothing is ready, return cannot do
			for (Status s : readyList) {
				if (s.ready == true) {
					available = true;
				}
			}
			if (available == false) {
//				System.out.println("Cannot complete these tasks. Going to bed.");
				return "Cannot complete these tasks.  Going to bed.";
			}
			//

			for (int i = 0; i < readyList.size(); i++) {
				if (readyList.get(i).ready == true) {
					done.add(readyList.get(i).x);
					// remove from constraint
					for (int j = 0; j < constraints.size(); j++) {
						if (constraints.get(j).x == readyList.get(i).x) {
							constraints.remove(j);
							j--;
						}
					}
					// remove from ready list
					readyList.remove(i);
					break;
				}
			}

		}
	}

}
