package by.minsk.epam.jio.taskOne;

public class GCDOrLCM {
	
	public static int calculateGCD (int n1, int n2) {
		
		while (n1 != n2) {
			if (n1 == 0) {
				return n2;
			}
			if (n2 == 0) {
				return n1;
			}
			if (n1 > n2) {
				n1 -= n2;
			} else {
				n2 -= n1;
			}
		}
		return n2;
	}
	
	public static int calculateLCM (int n1, int n2) {
		return (n1 * n2) / calculateGCD(n1, n2);
	}
}
