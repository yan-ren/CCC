package junior2019;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import helper.InputReader;

public class J19J4Test {
	@Test
	public void test1_19() throws IOException {
		int tests = 19;
		for (int i = 1; i <= tests; i++) {
			if(i == 3 || i == 4) {
				continue;
			}
			String inputPath;
			String outputPath;
			if (i < 10) {
				inputPath = "./src/test/resources/j19/j4/j4.0" + i + ".in";
				outputPath = "./src/test/resources/j19/j4/j4.0" + i + ".out";
			} else {
				inputPath = "./src/test/resources/j19/j4/j4." + i + ".in";
				outputPath = "./src/test/resources/j19/j4/j4." + i + ".out";
			}
			BufferedReader br1 = new InputReader(inputPath).getBr();
			BufferedReader br2 = new InputReader(outputPath).getBr();
			String expected = br2.readLine();
			expected += "\n" + br2.readLine();
			assertEquals(expected, new J19J4().run(br1));
		}
	}

	@Test
	public void test20() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j4/j4.sample01.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j4/j4.sample01.out").getBr();
		String expected = br2.readLine();
		expected += "\n" + br2.readLine();
		assertEquals(expected, new J19J4().run(br1));
	}
	
	@Test
	public void test21() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j19/j4/j4.sample02.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j19/j4/j4.sample02.out").getBr();
		String expected = br2.readLine();
		expected += "\n" + br2.readLine();
		assertEquals(expected, new J19J4().run(br1));
	}
}
