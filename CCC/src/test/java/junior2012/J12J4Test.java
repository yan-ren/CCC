package junior2012;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import helper.InputReader;

public class J12J4Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j4/j4.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j4/j4.1.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J12J4().run(br1));
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j4/j4.2.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j4/j4.2.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J12J4().run(br1));
	}
	
	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j4/j4.3.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j4/j4.3.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J12J4().run(br1));
	}
	
	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j4/j4.4.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j4/j4.4.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J12J4().run(br1));
	}
	
	@Test
	public void test5() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j4/j4.5.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j4/j4.5.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J12J4().run(br1));
	}
}
