package junior2017;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import helper.InputReader;

public class J17J5Test {
	@Test
	public void test1_28() throws IOException {
		int tests = 28;
		for (int i = 1; i <= tests; i++) {
			String inputPath;
			String outputPath;
			if(i < 10) {
				inputPath = "./src/test/resources/j17/j5/j5.0" + i + ".in";
				outputPath = "./src/test/resources/j17/j5/j5.0" + i + ".out";
			}else {
				inputPath = "./src/test/resources/j17/j5/j5." + i + ".in";
				outputPath = "./src/test/resources/j17/j5/j5." + i + ".out";
			}
			BufferedReader br1 = new InputReader(inputPath).getBr();
			BufferedReader br2 = new InputReader(outputPath).getBr();
			String expected = br2.readLine();
			assertEquals(expected, new J17J5().run(br1));
		}
	}

	@Test
	public void test29() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j17/j5/j5_sample.01.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j17/j5/j5_sample.01.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J17J5().run(br1));
	}

	@Test
	public void test30() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j17/j5/j5_sample.02.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j17/j5/j5_sample.02.out").getBr();
		String expected = br2.readLine();
		assertEquals(expected, new J17J5().run(br1));
	}
}
