package senior2016;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import helper.InputReader;

public class S16S5Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s16/s5/s5.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s16/s5/s5.1.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new S5().run(br1));
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s16/s5/s5.2.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s16/s5/s5.2.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new S5().run(br1));
	}
	
//	@Test
//	public void test4() throws IOException {
//		BufferedReader br1 = new InputReader("./src/test/resources/s16/s5/s5.4.in").getBr();
//		BufferedReader br2 = new InputReader("./src/test/resources/s16/s5/s5.4.out").getBr();
//		String expected = br2.readLine();
//		assertEquals(expected, new S5().run(br1));
//	}
	
//	test6 takes ~20s
	@Test
	public void test6() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s16/s5/s5.6.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s16/s5/s5.6.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new S5().run(br1));
	}
	
	@Test
	public void test7() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s16/s5/s5.7.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s16/s5/s5.7.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new S5().run(br1));
	}
	
	@Test
	public void test8() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s16/s5/s5.8.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s16/s5/s5.8.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new S5().run(br1));
	}
	
//	@Test
//	public void test9() throws IOException {
//		BufferedReader br1 = new InputReader("./src/test/resources/s16/s5/s5.9.in").getBr();
//		BufferedReader br2 = new InputReader("./src/test/resources/s16/s5/s5.9.out").getBr();
//		String expected = br2.readLine();
//		assertEquals(expected, new S5().run(br1));
//	}
	
//	@Test
//	public void test10() throws IOException {
//		BufferedReader br1 = new InputReader("./src/test/resources/s16/s5/s5.10.in").getBr();
//		BufferedReader br2 = new InputReader("./src/test/resources/s16/s5/s5.10.out").getBr();
//		String expected = br2.readLine();
//		assertEquals(expected, new S5().run(br1));
//	}
	
//	@Test
//	public void test11() throws IOException {
//		BufferedReader br1 = new InputReader("./src/test/resources/s16/s5/s5.11.in").getBr();
//		BufferedReader br2 = new InputReader("./src/test/resources/s16/s5/s5.11.out").getBr();
//		String expected = br2.readLine();
//		assertEquals(expected, new S5().run(br1));
//	}
}
