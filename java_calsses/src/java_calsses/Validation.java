package java_calsses;

import java.util.Scanner;

/**
 * this class Validation for validate username length etc
 * @author C.S.Rajawat.
 * @version 1.1.
 * @since 26/10/2023.
  */
public class Validation {
	
	/**
	 * This is main method for start excution of code
	 * @param String aray and arguments
	 * */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] result = new String[4];

		// for loop for read 4 input
		for (int i = 0; i < 4; i++) {

			String user_name = sc.nextLine();

			if (user_name.length() >= 5 && user_name.length() <= 10 && checkAtoZ(user_name) && checkDigit(user_name)
					&& checkAt(user_name) && checkHz(user_name) && checkSpc(user_name)) {

				result[i] = "pass";

			} else
				result[i] = "Fail";
		}
		for (String s : result)
			System.out.println(s);

	}

	/**
	 * This is checkAtoZ method which is use for check that username contain or not
	 * A to Z.
	 * 
	 * @param String username
	 * @return boolean
	 */

	public static boolean checkAtoZ(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 65 && ch <= 90) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This is checkDigit method which is use for check that username contain or not
	 * 0 to 9 digit.
	 * 
	 * @param String username
	 * @return boolean
	 */
	public static boolean checkDigit(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch >= 48 && ch <= 57) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This is checkAt method which is use for check that username contain or not
	 * /@.
	 * 
	 * @param String username
	 * @return boolean
	 */
	public static boolean checkAt(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == 35) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This is checkHz method which is use for check that username contain or not
	 * /#.
	 * 
	 * @param String username
	 * @return boolean
	 */
	public static boolean checkHz(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch == 64) {
				return true;
			}
		}
		return false;
	}

	/**
	 * This is checkSpc method which is use for ensure that username must not
	 * contain space.
	 * 
	 * @param String username
	 * @return boolean
	 */
	public static boolean checkSpc(String s) {
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (ch != 32) {
				return true;
			}
		}
		return false;
	}

}
