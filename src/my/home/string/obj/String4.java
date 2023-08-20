package my.home.string.obj;

//create word "торт" from the word "информатика"
public class String4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String info = "информатика";
		String cake = "";
		
		char [] infoCharArr = info.toCharArray();
		
		cake += (String.copyValueOf(infoCharArr, 7, 1)) + 
				(String.copyValueOf(infoCharArr, 3, 2)) +
				(String.copyValueOf(infoCharArr, 7, 1));
		
		System.out.println(cake);

	}

}
