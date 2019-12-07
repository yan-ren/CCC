package junior2008;

import static org.junit.Assert.assertEquals;

import java.io.BufferedReader;
import java.io.IOException;

import org.junit.Test;

import helper.InputReader;

public class J08J4Test {
	@Test
	public void test1() throws IOException {
		BufferedReader br1 = new InputReader("./src/test/resources/j08/j4/j4.1.in").getBr();
		BufferedReader br2 = new InputReader("./src/test/resources/j08/j4/j4.1.out").getBr();

		String input;
		String expected;
		while((input = br1.readLine()) != null) {
			if(input.matches("^0+$")) {
				break;
			}
			expected = br2.readLine();
			assertEquals(expected, new J08J4().run(input));
		}
	}
}
