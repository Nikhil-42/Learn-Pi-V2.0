package helpers;

import static helpers.Logs.username;
import java.math.BigDecimal;
import java.math.RoundingMode;
import org.jdesktop.swingx.JXLabel;

public class Teacher {

	private static String wrongNumbers;
	public static int numberReached, digitsPerTry = 3;
	private static boolean allGood;
	public static String pi = "3.141592653589793238462643383279502884197169399375105820974944592307816406286208998628034825342117067";

	public static void test(String input) {

		int i;
		if (input.length()+1 > pi.length()) {
			pi = Pi.pi((input.length() + 1)).toPlainString();
			System.out.println("Limit exceeded\nCalculating next digits");
		}
		allGood = false;

		for (i = 0; i < input.length(); i++) {
			if (!input.substring(i, i + 1).equals(pi.substring(i, i + 1))) {
				break;
			}
		}
		if (i >= 2) {
			numberReached = i - 1;
		} else {
			numberReached = i;
		}
		if (i == input.length())
			allGood = true;
		else
			wrongNumbers = input.substring(i);
	}

	public static String teach() {
		String results = "";

		if (allGood) {
			results += "Good those were all correct\n";
			results += ("The next digits after \"" + pi.substring(numberReached, numberReached + 1) + "\" are \""
					+ pi.substring(numberReached + 1, numberReached + digitsPerTry + 1) + "\".\n");
		} else {
			results += "..." + wrongNumbers + " were wrong.\n";
			results += ("The next digit after \"" + pi.substring(numberReached, numberReached + 1) + "\" in the "
					+ numberReached + "th place is \"" + pi.substring(numberReached + 1, numberReached + 2) + "\".\n");
		}
		results += "You know " + numberReached + " digits of pi.";
		System.out.println(results);
		return results;
	}

	public static void setRecords(JXLabel out) {
		if (Logs.loggedIn) {
			int oldRecord = Logs.getRecord(username);
			if (Logs.record(username, Teacher.numberReached)) {
				out.setText("You beat your previous record of " + oldRecord + " digits!");
			} else {
				out.setText("You were just " + (Logs.getRecord(username) - Teacher.numberReached + 1)
						+ " digits away from beating your record of " + oldRecord + ".");
			}
			if (Logs.record(Loader.ALLUSERSNAME, Teacher.numberReached)) {
				out.setText(out.getText() + "\nYou set a new local record.");
			}
		} else {
			out.setText("You aren't logged in.");
		}
	}

	public final static class Pi {

		private static final BigDecimal TWO = new BigDecimal("2");
		private static final BigDecimal FOUR = new BigDecimal("4");
		private static final BigDecimal FIVE = new BigDecimal("5");
		private static final BigDecimal TWO_THIRTY_NINE = new BigDecimal("239");

		private Pi() {
		}

		public static BigDecimal pi(int numDigits) {

			int calcDigits = numDigits + 10;

			return FOUR
					.multiply((FOUR.multiply(arccot(FIVE, calcDigits))).subtract(arccot(TWO_THIRTY_NINE, calcDigits)))
					.setScale(numDigits, RoundingMode.DOWN);
		}

		private static BigDecimal arccot(BigDecimal x, int numDigits) {

			BigDecimal unity = BigDecimal.ONE.setScale(numDigits, RoundingMode.DOWN);
			BigDecimal sum = unity.divide(x, RoundingMode.DOWN);
			BigDecimal xpower = new BigDecimal(sum.toString());
			BigDecimal term = null;

			boolean add = false;

			for (BigDecimal n = new BigDecimal("3"); term == null
					|| term.compareTo(BigDecimal.ZERO) != 0; n = n.add(TWO)) {

				xpower = xpower.divide(x.pow(2), RoundingMode.DOWN);
				term = xpower.divide(n, RoundingMode.DOWN);
				sum = add ? sum.add(term) : sum.subtract(term);
				add = !add;
			}
			return sum;
		}
	}
}
