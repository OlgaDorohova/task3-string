package my.home.string.array;

//count digits in the string
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String string = "dfg12 45dfg 12121 sd45f";
		
		System.out.println(countDigit(string));

	}
	
	public static int countDigit(String str) {
		int count = 0;
		char [] charArray = str.toCharArray();
		for(char ch: charArray) {
			if(Character.isLetterOrDigit(ch) && !Character.isLetter(ch)) {
				count++;
			}
		}
		
		return count;
	}

}
