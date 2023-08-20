package my.home.string.obj;

//count up symbol "a" in the string
public class String5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = "sfasgfhahd fAretyr Auasgdfhj";
		int countA = 0;

		for (int i = 0; i < string.length(); i++) {
			if (string.substring(i, i + 1).equalsIgnoreCase("a")) {
				countA++;
			}

		}
		System.out.println("the string contains " + countA + " \"A\" ");
	}

}
