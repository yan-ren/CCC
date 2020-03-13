package senior2017;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import helper.InputReader;

public class S17S4Test {
//	@Test
//	public void test1_50() throws IOException {
//		int tests = 50;
//		for (int i = 1; i <= tests; i++) {
//			String inputPath;
//			String outputPath;
//			if (i < 10) {
//				inputPath = "./src/test/resources/s17/s4/s4.0" + i + ".in";
//				outputPath = "./src/test/resources/s17/s4/s4.0" + i + ".out";
//			} else {
//				inputPath = "./src/test/resources/s17/s4/s4." + i + ".in";
//				outputPath = "./src/test/resources/s17/s4/s4." + i + ".out";
//			}
//			BufferedReader br1 = new InputReader(inputPath).getBr();
//			BufferedReader br2 = new InputReader(outputPath).getBr();
//			String expected = br2.readLine();
//			assertEquals("test" + i, Integer.parseInt(expected), new S17S4().run(br1));
//		}
//	}

	@Test
	public void test01() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.01.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.01.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test02() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.02.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.02.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test03() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.03.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.03.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test04() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.04.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.04.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test05() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.05.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.05.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test06() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.06.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.06.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test07() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.07.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.07.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test08() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.08.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.08.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test09() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.09.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.09.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test10() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.10.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.10.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test11() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.11.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.11.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test12() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.12.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.12.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test13() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.13.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.13.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test14() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.14.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.14.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test15() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.15.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.15.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test16() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.16.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.16.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test17() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.17.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.17.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test18() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.18.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.18.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test19() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.19.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.19.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test20() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.20.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.20.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test21() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.21.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.21.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test22() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.22.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.22.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test23() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.23.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.23.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test24() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.24.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.24.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test25() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.25.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.25.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test26() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.26.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.26.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test27() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.27.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.27.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test28() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.28.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.28.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test29() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.29.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.29.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test30() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.30.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.30.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test31() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.31.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.31.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test32() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.32.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.32.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test33() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.33.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.33.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test34() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.34.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.34.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test35() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.35.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.35.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test36() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.36.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.36.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test37() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.37.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.37.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test38() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.38.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.38.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test39() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.39.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.39.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test40() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.40.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.40.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test41() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.41.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.41.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test42() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.42.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.42.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test43() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.43.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.43.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test44() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.44.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.44.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test45() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.45.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.45.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test46() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.46.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.46.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test47() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.47.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.47.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test48() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.48.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.48.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test49() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.49.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.49.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void test50() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.50.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.50.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void testSample01() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.sample.01.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.sample.01.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void testSample02() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.sample.02.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.sample.02.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}

	@Test
	public void testSample03() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/s17/s4/s4.sample.03.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/s17/s4/s4.sample.03.out").getBr();
		String expected = br2.readLine();
		assertEquals(Integer.parseInt(expected), new S17S4().run(br1));
	}
}
