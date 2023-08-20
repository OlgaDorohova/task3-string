package my.home.string.obj;

//Is the word a palindrome
public class String3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String wordString = "abba";
		String worString1 = "abva";
		
		isPalindrome(wordString);
		isPalindrome(worString1);

	}
	
	public static void isPalindrome(String word) {
		StringBuilder sBuilder = new StringBuilder(word);
		
		
		if(sBuilder.reverse().toString().equals(word)) {
			System.out.println(word + " is a palindrome");
			return;
		}
		System.out.println(word + " isn't a palindrome");
	}

}
