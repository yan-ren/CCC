package junior2016;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import helper.InputReader;

public class J16J2Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/junior2016/j2/j2.1a.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/junior2016/j2/j2.1a.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J2().compute(br1));
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/junior2016/j2/j2.1b.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/junior2016/j2/j2.1b.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J2().compute(br1));
	}
	
	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/junior2016/j2/j2.2a.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/junior2016/j2/j2.2a.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J2().compute(br1));
	}
	
	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/junior2016/j2/j2.2b.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/junior2016/j2/j2.2b.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J2().compute(br1));
	}
	
	@Test
	public void test5() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/junior2016/j2/j2.3a.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/junior2016/j2/j2.3a.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J2().compute(br1));
	}
	
	@Test
	public void test6() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/junior2016/j2/j2.3b.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/junior2016/j2/j2.3b.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J2().compute(br1));
	}
	
	@Test
	public void test7() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/junior2016/j2/j2.4a.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/junior2016/j2/j2.4a.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J2().compute(br1));
	}
	
	@Test
	public void test8() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/junior2016/j2/j2.4b.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/junior2016/j2/j2.4b.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J2().compute(br1));
	}
	
	@Test
	public void test9() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/junior2016/j2/j2.5a.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/junior2016/j2/j2.5a.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J2().compute(br1));
	}
	
	@Test
	public void test10() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/junior2016/j2/j2.5b.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/junior2016/j2/j2.5b.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J2().compute(br1));
	}
}
