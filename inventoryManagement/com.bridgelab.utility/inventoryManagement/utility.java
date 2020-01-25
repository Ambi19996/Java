package inventoryManagement;

import java.util.Scanner;

public class utility {
	/* to create the sccaner method */
	private static final Scanner scan = new Scanner(System.in);

	public static int inputreader() { /* here,we reade the integer value */
		return scan.nextInt();
	}

	public static float inputFloat() { /* scanner object to use float */
		return scan.nextFloat();
	}

	public static long inputLong() { /* scanner object to use long */
		return scan.nextLong();
	}

	public static String inputString() { /* scanner object to use string */
		return scan.next();
	}

	public static boolean inputboolean() { /* scanner object to use boolean */
		return scan.nextBoolean();

	}

	public static double inputdouble() { /* scanner object to use boolean */
		return scan.nextDouble();

	}
}
