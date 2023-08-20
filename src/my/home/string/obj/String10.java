package my.home.string.obj;

//count all sentences in the text
public class String10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Hello, my dear friends! I'm glad to see you at our meetting."
				+ " Sit down, plase. Do you have any questions? Bye!";
		
		String text2 = "Пул строк (String Pool) — это множество строк в кучи (Java Heap Memory). "
				+ "Мы знаем, что String — особый класс в java, "
				+ "с помощью которого мы можем создавать строковые объекты.\r\n"
				+ "\r\n"
				+ "На диаграмме ниже мы видим как именно строковый пул"
				+ " расположен в памяти Java Heap."
				+ " И как разные способы создания строк влияют на расположение их в памяти.";
		
		System.out.println(countSentences(text));
		System.out.println(countSentences(text2));

	}
	
	public static int  countSentences(String text) {
		char [] textArray = text.toCharArray();
		int countSent = 0;
		
		for(char ch: textArray) {
			if(ch == '\u002E' || ch == '\u0021' || ch == '\u003F') {
				countSent++;
			}
			
		}
		
		return countSent;
	}

}
