package junior2007;

import java.io.BufferedReader;
import java.io.IOException;
import static org.junit.Assert.*;
import org.junit.Test;

import helper.InputReader;

public class J07J5Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j07j5/j5.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j07j5/j5.1.exp").getBr();

		String expected = br2.readLine();
		int A = Integer.parseInt(br1.readLine());
		int B = Integer.parseInt(br1.readLine());
		J07J5 actual = new J07J5(A, B);
		int n = Integer.parseInt(br1.readLine());
		while (n != 0) {
			actual.addMotel(Integer.parseInt(br1.readLine()));
			n--;
		}
		actual.sortMotels();
		assertEquals(actual.getWays(), Integer.parseInt(expected));
	}
}
