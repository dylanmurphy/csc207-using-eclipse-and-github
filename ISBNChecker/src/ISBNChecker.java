
public class ISBNChecker {
	public static boolean isISBN(String isbn) {
		if(isbn.length() != 10) {
			System.out.println("false");
			return false;
		}
		int sum = 0;
		for (int i = 0; i < 9; i++) {
			sum += (i + 1) * Character.digit(isbn.charAt(i), 10);
		}
		int check = sum%11;
			
		if (isbn.charAt(9) == 'X' && check == 10) {
			System.out.println(true);
			return true;
		}
		
		if (check != Character.digit(isbn.charAt(9), 10)) {
			System.out.println("false");
			return false;
		}

		else {
			System.out.println("true");
			return true;
		}
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String isbn1 = "0205080057";
		String isbn2 = "0136091812";
		String isbn3 = "123456789X";
		isISBN(isbn1);
		isISBN(isbn2);
		isISBN(isbn3);
	}

}
