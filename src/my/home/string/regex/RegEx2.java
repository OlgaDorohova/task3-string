package my.home.string.regex;

//get access to the xml attributes
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String xmlString = "<notes>\r\n" 
							+ " <note id = \"1\">\r\n" 
							+ "  <to>Вася</to>\r\n" 
							+ "  <from>Света</from>\r\n"
							+ "  <heading>Напоминание</heading>\r\n" 
							+ "  <body>Позвони мне завтра!</body>\r\n" 
							+ " </note>\r\n"
							+ " <note id = \"2\">\r\n" 
							+ "  <to>Петя</to>\r\n" 
							+ "  <from>Маша</from>\r\n"
							+ "  <heading>Важное напоминание</heading>\r\n"
							+ "  <body/>\r\n" 
							+ " </note>\r\n" 
							+ "</notes>";

		String patterString = "(<[a-z]+>|<[a-z]+.id.+>)|([а-яА-Я]+)|(<\\/[a-z]+>)|(<[a-z]+\\/>)";
		
		Pattern pattern = Pattern.compile(patterString);
		Matcher matcher = pattern.matcher(xmlString);

		while (matcher.find()) {
			if (matcher.group(1) != null) {
				System.out.println(matcher.group(1) + " - open teg");
			} else {
				if (matcher.group(2) != null) {
					System.out.println(matcher.group(2) + " - body");
				} else {
					if (matcher.group(3) != null) {
						System.out.println(matcher.group(3)+ "- teg without body");

					} else if (matcher.group(4) != null) {
						System.out.println(matcher.group(4)+" - close teg ");
					}
				}
			}
			

		}
	}

}
