package junior2005;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Test;

import helper.InputReader;

public class J05J5Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j05/j5/j5.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j05/j5/j5.1.out").getBr();

		Scanner sc = new Scanner(br2);
		ArrayList<String> expected = new ArrayList<>();
		while (sc.hasNext()) {
			String newLine = sc.nextLine().trim();
			if (!newLine.isEmpty()) {
				expected.add(newLine);
			}
		}

		assertEquals(expected, new J05J5().run(br1));
	}

	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j05/j5/j5.2.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j05/j5/j5.2.out").getBr();

		Scanner sc = new Scanner(br2);
		ArrayList<String> expected = new ArrayList<>();
		while (sc.hasNext()) {
			String newLine = sc.nextLine().trim();
			if (!newLine.isEmpty()) {
				expected.add(newLine);
			}
		}

		assertEquals(expected, new J05J5().run(br1));
	}

	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j05/j5/j5.3.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j05/j5/j5.3.out").getBr();

		Scanner sc = new Scanner(br2);
		ArrayList<String> expected = new ArrayList<>();
		while (sc.hasNext()) {
			String newLine = sc.nextLine().trim();
			if (!newLine.isEmpty()) {
				expected.add(newLine);
			}
		}

		assertEquals(expected, new J05J5().run(br1));
	}

	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j05/j5/j5.4.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j05/j5/j5.4.out").getBr();

		Scanner sc = new Scanner(br2);
		ArrayList<String> expected = new ArrayList<>();
		while (sc.hasNext()) {
			String newLine = sc.nextLine().trim();
			if (!newLine.isEmpty()) {
				expected.add(newLine);
			}
		}

		assertEquals(expected, new J05J5().run(br1));
	}
}
