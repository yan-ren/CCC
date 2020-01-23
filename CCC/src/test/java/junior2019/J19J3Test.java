package junior2019;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import helper.InputReader;

public class J19J3Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j3/j3.01.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j3/j3.01.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J19J3().run(br1));
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j3/j3.02.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j3/j3.02.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J19J3().run(br1));
	}
	
	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j3/j3.03.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j3/j3.03.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J19J3().run(br1));
	}
	
	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j3/j3.04.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j3/j3.04.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J19J3().run(br1));
	}
	
	@Test
	public void test5() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j3/j3.sample.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j3/j3.sample.out").getBr();
		ArrayList<String> expected = new ArrayList<>();
		Scanner sc = new Scanner(br2);
		while(sc.hasNext()) {
			expected.add(sc.nextLine());
		}
		assertEquals(expected, new J19J3().run(br1));
	}
}
