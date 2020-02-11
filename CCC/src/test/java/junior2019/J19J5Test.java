package junior2019;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;

import org.junit.Test;

import helper.InputReader;

public class J19J5Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j5/j5.01.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j5/j5.01.out").getBr();
		Scanner sc = new Scanner(br2);
		String expected = sc.nextLine();
		while(sc.hasNext()) {
			expected += "\n" + sc.nextLine();
		}
		sc.close();
		assertEquals(new J19J5().run(br1).contains(expected), true);
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j5/j5.02.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j5/j5.02.out").getBr();
		Scanner sc = new Scanner(br2);
		String expected = sc.nextLine();
		while(sc.hasNext()) {
			expected += "\n" + sc.nextLine();
		}
		sc.close();
		assertEquals(new J19J5().run(br1).contains(expected), true);
	}

	/*
	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j5/j5.03.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j5/j5.03.out").getBr();
		Scanner sc = new Scanner(br2);
		String expected = sc.nextLine();
		while(sc.hasNext()) {
			expected += "\n" + sc.nextLine();
		}
		sc.close();
		assertEquals(new J19J5().run(br1).contains(expected), true);
	}
	
	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j5/j5.04.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j5/j5.04.out").getBr();
		Scanner sc = new Scanner(br2);
		String expected = sc.nextLine();
		while(sc.hasNext()) {
			expected += "\n" + sc.nextLine();
		}
		sc.close();
		assertEquals(new J19J5().run(br1).contains(expected), true);
	}
	
	@Test
	public void test5() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j5/j5.05.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j5/j5.05.out").getBr();
		Scanner sc = new Scanner(br2);
		String expected = sc.nextLine();
		while(sc.hasNext()) {
			expected += "\n" + sc.nextLine();
		}
		sc.close();
		assertEquals(new J19J5().run(br1).contains(expected), true);
	}
	*/

	@Test
	public void test6() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j5/j5.06.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j5/j5.06.out").getBr();
		Scanner sc = new Scanner(br2);
		String expected = sc.nextLine();
		while(sc.hasNext()) {
			expected += "\n" + sc.nextLine();
		}
		sc.close();
		assertEquals(new J19J5().run(br1).contains(expected), true);
	}
	
	@Test
	public void test7() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j5/j5.07.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j5/j5.07.out").getBr();
		Scanner sc = new Scanner(br2);
		String expected = sc.nextLine();
		while(sc.hasNext()) {
			expected += "\n" + sc.nextLine();
		}
		sc.close();
		assertEquals(new J19J5().run(br1).contains(expected), true);
	}
	
	@Test
	public void test8() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j5/j5.08.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j5/j5.08.out").getBr();
		Scanner sc = new Scanner(br2);
		String expected = sc.nextLine();
		while(sc.hasNext()) {
			expected += "\n" + sc.nextLine();
		}
		sc.close();
		assertEquals(new J19J5().run(br1).contains(expected), true);
	}
	
	@Test
	public void test9() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j5/j5.09.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j5/j5.09.out").getBr();
		Scanner sc = new Scanner(br2);
		String expected = sc.nextLine();
		while(sc.hasNext()) {
			expected += "\n" + sc.nextLine();
		}
		sc.close();
		assertEquals(new J19J5().run(br1).contains(expected), true);
	}
	
	@Test
	public void test10() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j5/j5.10.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j5/j5.10.out").getBr();
		Scanner sc = new Scanner(br2);
		String expected = sc.nextLine();
		while(sc.hasNext()) {
			expected += "\n" + sc.nextLine();
		}
		sc.close();
		assertEquals(new J19J5().run(br1).contains(expected), true);
	}
	
	@Test
	public void test11() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j5/j5.sample.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j5/j5.sample.out").getBr();
		Scanner sc = new Scanner(br2);
		String expected = sc.nextLine();
		while(sc.hasNext()) {
			expected += "\n" + sc.nextLine();
		}
		sc.close();
		assertEquals(new J19J5().run(br1).contains(expected), true);
	}
}
