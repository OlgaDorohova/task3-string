package my.home.string.obj;

//find the biggest word of the string
public class String8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String string = " aa aaa aaaa aaaaba aabaaa aaa aaa aaa";
		String[] array = string.split(" ");
		int index = 0;
		int max = 0;
		int count = 0;

		for (String s : array) {
			if (s.length() > max) {
				max = s.length();
			}
		}
		
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() == max) {
				index = i;
				count++;
			}
		}
		
		if(count > 1) {
			System.out.println("There are " + count + " biggest words");
		} else System.out.println(array[index]);

	}

}
