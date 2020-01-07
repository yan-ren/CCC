package junior2014;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import helper.InputReader;

public class J14J5Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j14/j5/j5.1a.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j14/j5/j5.1a.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J14J5().run(br1));
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j14/j5/j5.1b.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j14/j5/j5.1b.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J14J5().run(br1));
	}
	
	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j14/j5/j5.2a.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j14/j5/j5.2a.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J14J5().run(br1));
	}
	
	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j14/j5/j5.2b.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j14/j5/j5.2b.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J14J5().run(br1));
	}
	
	@Test
	public void test5() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j14/j5/j5.3a.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j14/j5/j5.3a.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J14J5().run(br1));
	}
	
	@Test
	public void test6() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j14/j5/j5.3b.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j14/j5/j5.3b.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J14J5().run(br1));
	}
	
	@Test
	public void test7() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j14/j5/j5.4a.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j14/j5/j5.4a.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J14J5().run(br1));
	}
	
	@Test
	public void test8() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j14/j5/j5.4b.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j14/j5/j5.4b.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J14J5().run(br1));
	}
	
	@Test
	public void test9() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j14/j5/j5.5a.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j14/j5/j5.5a.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J14J5().run(br1));
	}
	
	@Test
	public void test10() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j14/j5/j5.5b.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j14/j5/j5.5b.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J14J5().run(br1));
	}
}
