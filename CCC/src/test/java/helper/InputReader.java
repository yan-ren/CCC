package helper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class InputReader {

	private BufferedReader br;

	public InputReader(String filePath) {
		File file = new File(filePath);
		System.out.println(file.getAbsolutePath());
		try {
			br = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public BufferedReader getBr() {
		return br;
	}

}
