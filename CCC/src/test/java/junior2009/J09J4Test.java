package junior2009;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import helper.InputReader;

public class J09J4Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j09/j4/j4.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j09/j4/j4.1.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J09J4().run(br1));
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j09/j4/j4.2.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j09/j4/j4.2.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J09J4().run(br1));
	}
	
	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j09/j4/j4.3.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j09/j4/j4.3.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J09J4().run(br1));
	}
	
	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j09/j4/j4.4.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j09/j4/j4.4.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J09J4().run(br1));
	}
	
	@Test
	public void test5() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j09/j4/j4.5.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j09/j4/j4.5.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J09J4().run(br1));
	}
	
	@Test
	public void test6() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j09/j4/j4.6.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j09/j4/j4.6.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J09J4().run(br1));
	}
}
