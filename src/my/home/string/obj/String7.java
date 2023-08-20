package my.home.string.obj;

//delete repeat symbols  from the string
public class String7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String origin = "abc cde  def eefg";

		StringBuilder builder = new StringBuilder(origin);
		for (int i = 0; i < builder.length(); i++) {
			String symbol = builder.substring(i, i + 1);
			boolean isDelete = true;

			while (isDelete) {
				int index = builder.indexOf(symbol, i + 1);
				isDelete = false;

				if (index > 0) {
					builder.delete(index, index + 1);
					isDelete = true;
				}

			}

			if (builder.substring(i, i + 1).equals(" ")) {
				builder.delete(i, i + 1);
				i--;
			}
		}

		System.out.println(builder);

	}

}
