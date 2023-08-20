package my.home.string.obj;

//add "b" after each "a"
public class String2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String textString = "dfgjhkasd asdfhjg gretyy werasa bbdfa";
		
		System.out.println(textString);
		System.out.println(addB(textString));

	}
	
	public static String addB(String str) {
		StringBuilder sBuilder = new StringBuilder();
		
		for(int i = 0; i<str.length(); i++) {
			sBuilder.append(str.substring(i, i+1));
			if(str.substring(i, i+1).equals("a")) {
				sBuilder.append("b");
			}
		}
		
		return sBuilder.toString();
	}

}
