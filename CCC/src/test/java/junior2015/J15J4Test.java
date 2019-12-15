package junior2015;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import helper.InputReader;

public class J15J4Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j15/j4/j4.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j15/j4/j4.1.out").getBr();

		String input;
		String expected = "";
		while((input = br2.readLine()) != null) {
			expected += input;
		}
		assertEquals(expected, new J15J4().run(br1));
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j15/j4/j4.2.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j15/j4/j4.2.out").getBr();

		String input;
		String expected = "";
		while((input = br2.readLine()) != null) {
			expected += input;
		}
		assertEquals(expected, new J15J4().run(br1));
	}
	
	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j15/j4/j4.3.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j15/j4/j4.3.out").getBr();

		String input;
		String expected = "";
		while((input = br2.readLine()) != null) {
			expected += input;
		}
		assertEquals(expected, new J15J4().run(br1));
	}
}
