package junior2012;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import helper.InputReader;

public class J12J5Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j5/j5.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j5/j5.1.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J12J5().run(br1));
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j5/j5.2.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j5/j5.2.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J12J5().run(br1));
	}
	
	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j5/j5.3.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j5/j5.3.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J12J5().run(br1));
	}
	
	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j5/j5.4.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j5/j5.4.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J12J5().run(br1));
	}
	
	@Test
	public void test5() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j5/j5.5.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j5/j5.5.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J12J5().run(br1));
	}
	
	@Test
	public void test6() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j5/s4.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j5/s4.1.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J12J5().run(br1));
	}
	
	@Test
	public void test7() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j5/s4.2.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j5/s4.2.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J12J5().run(br1));
	}
	
	@Test
	public void test8() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j5/s4.3.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j5/s4.3.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J12J5().run(br1));
	}
	
	@Test
	public void test9() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j5/s4.4.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j5/s4.4.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J12J5().run(br1));
	}
	
	@Test
	public void test10() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j12/j5/s4.5.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j12/j5/s4.5.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J12J5().run(br1));
	}
}
