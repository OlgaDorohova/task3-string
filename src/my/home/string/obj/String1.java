package my.home.string.obj;

//find maximum number of consecutive spaces
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String text = "fds f dfsdf fdsdd  fsdfds asdfdg   fd g    fd fggfd       sd   "
				+ "df      fdsf df df njjjjl       jkj   jjk jkjjkkjk  kjjkj   ";
		
		System.out.println(findMaxSpace(text));

	}

	public static int findMaxSpace(String str) {
		int maxCount = 0;
		int count = 0;

		for (int i = 1; i < str.length(); i++) {
			while (i < str.length() && str.substring(i - 1, i).equals(" ")) {
				count++;
				i++;
			}

			if (count > maxCount) {
				maxCount = count;
			}

			count = 0;
		}

		return maxCount;
	}
}
