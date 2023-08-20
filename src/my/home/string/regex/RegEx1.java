package my.home.string.regex;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

/* 1. Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее выполнять с текстом три различных операции:
отсортировать абзацы по количеству предложений; в каждом предложении отсортировать слова по длине; отсортировать лексемы в предложении
по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту. */

public class RegEx1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("data\\Text.txt");
		String text = fileReader(file);

		/*
		 * String text =
		 * "Природа дает человеку все необходимое для его существования. Но, часто мы не ценим эти дары, не задумываясь, срываем цветы и ветки на деревьях, не давая ничего взамен. Нам кажется, что это мелочь, ведь вырастут новые. Обернувшись по сторонам, сложно не заметить - как же все таки прекрасна природа. Нам нужно лишь научиться ценить её!\r\n"
		 * + "\r\n" +
		 * "Природа радует нас своими необыкновенными и такими разными сезонами. Весной, словно делая первые шаги, природа обновляется, появляются росточки на земле, за ними - первые листья на деревьях. К лету, в лесах и садах настоящее буйство красок, пышно расцвели цветы и кустарники. Осенней порой кроны деревьев багряным и золотым фейерверком украшают аллеи и парки. Золотая осень укрывает все вокруг желтым ковром из опадающей листвы. Приход зимы сменяет дожди на снегопады. Озера сковывает льдом, деревья укутывает в белые шубки. В свои владения вступает Королева Зима и до весны природа словно засыпает.\r\n"
		 * + "\r\n" +
		 * "В любую пору года природа неповторима и необыкновенно красива.\r\n" + "\r\n"
		 * +
		 * "В последние годы охране природы уделяется все пристально внимание. Это радует и значит, становится все больше людей, которым небезразлично будущее нашей Планеты, проявляющих помощь и заботу окружающей нас природе. Беречь и сохранить первозданную красоту Родного края - это наш с вами общий долг и обязанность!\r\n"
		 * + "";
		 */
		
		System.out.println(text + "\n");

		String[][][] textArray = parseText(text);

		while (true) {
			System.out.println("\n" + "1 - Отсортировать абзацы по количеству предложений\n"
					+ "2 - В каждом предложении отсортировать слова по длине\n"
					+ "3 - Отсортировать лексемы по количеству вхождений заданного символа; в случае равенства - по алфавиту\n"
					+ "4 - Выход \n");
			String action = consolReader("Выберите действие \n >>");

			switch (action) {

			case "1":
				System.out.println();
				sortBySentenseNums(textArray, 0, textArray.length - 1);
				printArray(textArray);
				System.out.println();
				break;

			case "2":
				System.out.println();
				sortByWordLength(textArray);
				printArray(textArray);
				break;

			case "3":
				System.out.println();
				String symbol = consolReader("Введите символ: \n >>");
				sortByLexeme(textArray, symbol);
				printArray(textArray);
				break;

			case "4":
				return;
			default:
				break;

			}

		}

	}

	public static String consolReader(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);
		String input = "";

		input = scanner.next();

		return input;
	}

	public static String fileReader(File file) throws IOException {
		StringBuilder sB = new StringBuilder();

		try (Scanner scanner = new Scanner(new FileReader(file))) {

			while (scanner.hasNext()) {
				sB.append(scanner.useDelimiter("\\r\\n\\s").next());
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found" + e);
		} 

		return sB.toString();

	}

	public static String[][][] parseText(String text) {

		String[][][] textArray = new String[text.split("(\\r*\\n+)+").length][][];

		String[] paragraph = text.split("(\\r*\\n)+");

		for (int i = 0; i < paragraph.length; i++) {
			String[] sentense = paragraph[i].split("\\s*[\\.|\\?|!]\\s*");
			textArray[i] = new String[sentense.length][];

			for (int j = 0; j < paragraph[i].split("\\s*[\\.|\\?|!]\\s*").length; j++) {
				String[] word = sentense[j].split("\\s+|,|-");
				textArray[i][j] = new String[word.length];

				for (int k = 0; k < sentense[j].split("\\s+|,|-").length; k++) {
					textArray[i][j][k] = word[k];
				}

			}
		}
		return textArray;
	}

	public static void printArray(String[][][] array) {
		for (String[][] p : array) {
			for (String[] s : p) {
				for (String w : s) {
					System.out.print(w + " ");
				}
			}
		}
	}

	public static void sortBySentenseNums(String array[][][], int low, int high) {

		if (array.length == 0) {
			return;
		}

		if (low >= high) {
			return;
		}

		int middle = low + (high - low) / 2;
		int i = low;
		int j = high;

		while (i <= j) {
			while (array[i].length < array[middle].length) {
				i++;
			}
			while (array[j].length > array[middle].length) {
				j--;
			}

			if (i <= j) {
				String temp[][] = array[i];
				array[i] = array[j];
				array[j] = temp;
				i++;
				j--;
			}

		}

		if (low < j) {
			sortBySentenseNums(array, low, j);
		}

		if (high > i) {
			sortBySentenseNums(array, i, high);
		}

	}

	public static void sortByWordLength(String[][][] array) {
		boolean isSort = true;

		while (isSort) {
			for (int i = 0; i < array.length; i++) {
				isSort = false;

				for (int j = 0; j < array[i].length; j++) {

					for (int k = 0; k < array[i][j].length - 1; k++) {

						if (array[i][j][k].length() > array[i][j][k + 1].length()) {
							String temp = array[i][j][k];
							array[i][j][k] = array[i][j][k + 1];
							array[i][j][k + 1] = temp;
							isSort = true;
						}
					}
				}
			}
		}

	}

	public static void sortByLexeme(String[][][] array, String symb) {
		Pattern pattern = Pattern.compile(symb);
		boolean isSort = true;

		while (isSort) {
			isSort = false;

			for (int i = 0; i < array.length; i++) {

				for (int j = 0; j < array[i].length; j++) {

					for (int k = 0; k < array[i][j].length - 1; k++) {
						if (pattern.matcher(array[i][j][k]).results().count() > 
						pattern.matcher(array[i][j][k + 1])
								.results().count()) {

							String temp = array[i][j][k];
							array[i][j][k] = array[i][j][k + 1];
							array[i][j][k + 1] = temp;
							isSort = true;

						}
						if (pattern.matcher(array[i][j][k]).results().count() == 
								pattern.matcher(array[i][j][k + 1])
								.results().count()) {

							if ((array[i][j][k].compareTo(array[i][j][k + 1])) > 0) {
								String temp = array[i][j][k];
								array[i][j][k] = array[i][j][k + 1];
								array[i][j][k + 1] = temp;
								isSort = true;

							}
						}
					}
				}
			}
		}
	}

}
