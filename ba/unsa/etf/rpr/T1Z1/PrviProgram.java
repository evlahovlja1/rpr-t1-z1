package ba.unsa.etf.rpr.T1Z1;

import java.util.Scanner;

public class PrviProgram {
	public static void main(String[] Args) {
		Scanner ulaz = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Unesite dva broja: ");
		a = ulaz.nextInt();
		b = ulaz.nextInt();
		
		System.out.println("Prvi broj: " + a + ", a drugi broj: " + b);
	}
}