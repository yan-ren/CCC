package junior2018;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

import org.junit.Test;

import helper.InputReader;

public class J18J4Test {

	public static int[][] init(Scanner sc) throws IOException {
		int[][] result;
		String[] firstLine = sc.nextLine().split(" ");
		result = new int[firstLine.length][];
		result[0] = Arrays.asList(firstLine).stream().mapToInt(Integer::parseInt).toArray();
		int i = 1;
		while (sc.hasNext()) {
			result[i] = Arrays.asList(sc.nextLine().split(" ")).stream().mapToInt(Integer::parseInt).toArray();
			i += 1;
		}
		return result;
	}

	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.01.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.01.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.02.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.02.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.03.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.03.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.04.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.04.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test5() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.05.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.05.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test6() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.06.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.06.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test7() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.07.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.07.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test8() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.08.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.08.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test9() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.09.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.09.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test10() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.10.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.10.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test11() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.11.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.11.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test12() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.12.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.12.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test13() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.13.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.13.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test14() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.14.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.14.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test15() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.15.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.15.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test16() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.sample01.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.sample01.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test17() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.sample02.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.sample02.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}

	@Test
	public void test18() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j18/j4/s2.sample03.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j18/j4/s2.sample03.out").getBr();
		Scanner sc = new Scanner(br2);
		int[][] expected = init(sc);
		int[][] test = new J18J4().run(br1);
		assertEquals(Arrays.deepEquals(expected, test), true);
	}
}
