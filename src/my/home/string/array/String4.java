package my.home.string.array;

//count numbers in the string
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "12 fg gfd45 fdg4 4gf df4fd 45 ff";
		System.out.println(countNumber(string));

	}
	
	public static int countNumber(String str) {
		int count = 0;
		char [] charArray = str.toCharArray();
		
		for(int i = 0; i< charArray.length; i++) {
			if(Character.isLetterOrDigit(charArray[i]) && 
					!Character.isLetter(charArray[i]) &&
					(i == 0 || !Character.isLetterOrDigit(charArray[i-1]))) {
				
				while(i < charArray.length) {
					if(Character.isLetter(charArray[i])) {
						break;
						}
					if(i == charArray.length || !Character.isLetterOrDigit(charArray[i + 1])) {
						count++;
						break;
					}
					i++;
				}
			}
		}
		
		return count;
	}

}
