package my.home.string.obj;

//count up english uppercase and lowercase letters in the string
public class String9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "GDSh jsdh DSA hjh  VjsdCjsk FDSAhg hg sdghsa  gsxghzSHHG Ssd";
		String lowAbc = "qwertyuiopasdfghjklzxcvbnm";
		String upAbc = "QWERTYUIOPLKHJGFDSAZXCVBNM";

		countLetterCases(str);
		countLetterCases(upAbc);
		countLetterCases(lowAbc);

	}

	public static void countLetterCases(String str) {
		char[] arrayStr = str.toCharArray();
		int countUp = 0;
		int countLow = 0;

		for (char ch : arrayStr) {

			if (ch >= '\u0041' && ch <= '\u005A') {
				countUp++;
			}

			if (ch >= '\u0061' && ch <= '\u007A') {
				countLow++;
			}

		}
		System.out.println("String: " + str);
		System.out.println("Lowcase letters are " + countLow);
		System.out.println("Uppercase letters are: " + countUp);
		System.out.println();
	}

}
