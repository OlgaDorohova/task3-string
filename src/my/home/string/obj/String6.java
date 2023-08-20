package my.home.string.obj;

//double each symbol of the string
public class String6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String origin = "abcdef ghijkl";
		String doubleOrigin = "";

		for (int i = 0; i < origin.length(); i++) {
			doubleOrigin += origin.substring(i, i + 1) + origin.substring(i, i + 1);
		}
		
		System.out.println(doubleOrigin);

	}

}
