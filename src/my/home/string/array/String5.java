package my.home.string.array;

//delete odd spaces 
public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "   21 55454 dsf fdsf   445 fdfds  fkds     dsf     ";

		System.out.println(string);
		System.out.println(deleteOddSpace(string));

	}

	public static String deleteOddSpace(String str) {
		char[] charArray = str.toCharArray();
		String reString = "";
		int i = 0;
		int j = charArray.length - 1;

		while (charArray[i] <= '\u0020') {
			i++;
		}

		while (charArray[j] <= '\u0020') {
			j--;
		}

		for (; i < j + 1; i++) {
			if (charArray[i] > '\u0020' && i + 1 < j && charArray[i + 1] <= '\u0020') {
				reString += charArray[i] + " ";
				i++;
			}

			while (i < j && charArray[i] <= '\u0020') {
				i++;
			}
			
			reString += String.valueOf(charArray[i]);
		}

		return reString;
	}

}
