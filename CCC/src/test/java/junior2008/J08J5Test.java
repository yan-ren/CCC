package junior2008;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.stream.Stream;

import org.junit.Test;

import helper.InputReader;

public class J08J5Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j08/j5/j5.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j08/j5/j5.1.out").getBr();

		String input;
		String expected;
		input = br1.readLine();
		while((input = br1.readLine()) != null) {
			int[] tmp = Stream.of(input.split(" "))
					  .mapToInt(Integer::parseInt)
					  .toArray();
			expected = br2.readLine();
			assertEquals(expected, new J08J5().run(tmp));
		}
	}
	
	@Test
	public void test2() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j08/j5/j5.2.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j08/j5/j5.2.out").getBr();

		String input;
		String expected;
		input = br1.readLine();
		while((input = br1.readLine()) != null) {
			int[] tmp = Stream.of(input.split(" "))
					  .mapToInt(Integer::parseInt)
					  .toArray();
			expected = br2.readLine();
			assertEquals(expected, new J08J5().run(tmp));
		}
	}
	
	@Test
	public void test3() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j08/j5/j5.3.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j08/j5/j5.3.out").getBr();

		String input;
		String expected;
		input = br1.readLine();
		while((input = br1.readLine()) != null) {
			int[] tmp = Stream.of(input.split(" "))
					  .mapToInt(Integer::parseInt)
					  .toArray();
			expected = br2.readLine();
			assertEquals(expected, new J08J5().run(tmp));
		}
	}
	
	@Test
	public void test4() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j08/j5/j5.4.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j08/j5/j5.4.out").getBr();

		String input;
		String expected;
		input = br1.readLine();
		while((input = br1.readLine()) != null) {
			int[] tmp = Stream.of(input.split(" "))
					  .mapToInt(Integer::parseInt)
					  .toArray();
			expected = br2.readLine();
			assertEquals(expected, new J08J5().run(tmp));
		}
	}
}
