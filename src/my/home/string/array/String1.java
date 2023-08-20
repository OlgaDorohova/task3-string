package my.home.string.array;

//change strings from camelCase to snake_case
public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] arrayStrings = {"camelCase", "snakeCase", "arrayType"};
		String [] resArrayStrings = toSnakeCase(arrayStrings); 
		
		
		
		for(String str: arrayStrings) {
			System.out.println(str);
		}
		
		for(String str: resArrayStrings) {
			System.out.println(str);
		}
	}
	
	public static String [] toSnakeCase(String [] arrayStrings) {
		String [] resArrayStrings = new String[arrayStrings.length];
		
		for(int i = 0; i< arrayStrings.length; i++) {
			char [] tempArray = arrayStrings[i].toCharArray();
			resArrayStrings[i] = "";
			
			for(int j = 0; j < tempArray.length; j++) {
				if(tempArray[j] == Character.toUpperCase(tempArray[j])) {
					resArrayStrings[i] += "_" + Character.toLowerCase(tempArray[j]);
					j++;
				}
				
				resArrayStrings[i] += tempArray[j];
			}
		}
		
		return resArrayStrings;
	}

}
