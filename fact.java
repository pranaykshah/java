package pack1;

import java.util.Scanner;

public class fact {
	static int n, fact = 1;

	public static void main(String[] args) {
		String ch, y = "y";
		Scanner sc = new Scanner(System.in);
		do {

			System.out.println("enter the no. to find factorial");
			n = sc.nextInt();
			while (n > 0) {
				fact = fact * n;
				n--;
			}
			System.out.println("the factorial is:" + fact);
			System.out.println("do yo wnt to continue press y or n");
			ch = sc.next();
			fact=1;
		} while (ch.equals(y));

	}
}
