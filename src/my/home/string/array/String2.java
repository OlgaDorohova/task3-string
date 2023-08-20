package my.home.string.array;

//change "word" to "letter" in the string
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "Word cent home rabbit woRd saw cow word";
		String change = "word";
		String word = "letter";

		System.out.println(changeText(text, change, word));

	}

	public static String changeText(String str, String change, String word) {
		char[] arrayStr = str.toCharArray();
		char[] arrayChange = change.toCharArray();
		String result = "";

		for (int i = 0; i < arrayStr.length; i++) {
			int j = 0;
		 
			if (Character.toLowerCase(arrayStr[i])  == 
					Character.toLowerCase(arrayChange[j])) {

				while (j < arrayChange.length && i + j < arrayStr.length) {
					if (Character.toLowerCase(arrayStr[i + j]) != 
							Character.toLowerCase(arrayChange[j])) {
						break;
					}
					
					if (j == arrayChange.length - 1) {
						result += word;
						i += j + 1;
					}
					
					j++;
				}
			}
			
			if (i < arrayStr.length) {
				result += String.valueOf(arrayStr[i]);
			}
		}

		return result;
	}

}
