package senior2016;

import java.io.BufferedReader;
import java.util.Scanner;

public class S1 {
	
	public static void main(String args[]){
		String a = "aab";
		String b = "*aa";
		if(a.length() != b.length()){
			System.out.println("NOT ANAGRAMS");
			System.exit(0);
		}
		String result = (compare(calculateCharacters(a), calculateCharacters(b)) == true) ? "A": "N";
		System.out.println(result);
	}
	
	public String run(BufferedReader br) {
		Scanner sc = new Scanner(br);
		String a = sc.nextLine();
		String b = sc.nextLine();
		sc.close();
		if(a.length() != b.length()){
			return "N";
		}
		String result = (compare(calculateCharacters(a), calculateCharacters(b)) == true) ? "A": "N";
		return result;
	}

	public static boolean compare(int[] a, int[] b){
		for(int i = 0; i<a.length ; i++){
			if(a[i] < b[i]){
				return false;
			}
		}
		return true;
	}
	
	//help method. input a string, 
	//output an array that each element represents the frequency of characters
	public static int[] calculateCharacters(String input){
		int[] result = new int[26];
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == '*'){
				continue;
			}
			int position = input.charAt(i) - 'a';
			result [position] = result[position] + 1;
		}
		return result;
	}
}
