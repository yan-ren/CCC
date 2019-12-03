package junior2016;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import helper.InputReader;

public class J16J1Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j16/j1/j1.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j16/j1/j1.1.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J1().select(br1));
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j16/j1/j1.2.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j16/j1/j1.2.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J1().select(br1));
	}
	
	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j16/j1/j1.3.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j16/j1/j1.3.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J1().select(br1));
	}
	
	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j16/j1/j1.4.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j16/j1/j1.4.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J1().select(br1));
	}
	
	@Test
	public void test5() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j16/j1/j1.5.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j16/j1/j1.5.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J1().select(br1));
	}
	
	@Test
	public void test6() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j16/j1/j1.samp1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j16/j1/j1.samp1.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J1().select(br1));
	}
	
	@Test
	public void test7() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j16/j1/j1.samp2.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j16/j1/j1.samp2.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new J1().select(br1));
	}
}
