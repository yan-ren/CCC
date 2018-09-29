package junior2005;

public class J05J5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isMonkeyWord("BANANA"));
	}
	
	public static boolean isMonkeyWord(String word) {
        if (word.equals("A")) {
            return true;
        }
 
        else if (word.startsWith("B") && word.endsWith("S")) {
            if (isMonkeyWord(word.substring(1, word.length() - 1))) {
                return true;
            } else {
                return false;
            }
        } else if (word.startsWith("AN")) {
            if (isMonkeyWord(word.substring(2, word.length()))) {
                return true;
            } else {
                return false;
            }
        } else if (word.startsWith("B")) {
            String[] twoParts = word.substring(1, word.length()).split("SN");
            if (twoParts.length != 2) {
                return false;
            } else if (isMonkeyWord(twoParts[0]) && isMonkeyWord(twoParts[1])) {
                return true;
            } else {
                return false;
            }
        }
 
        return false;
 
    }

}
