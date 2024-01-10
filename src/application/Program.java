package application;

import java.util.Scanner;

import entities.PrintService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);

		PrintService<String> ps = new PrintService<>();

		System.out.println("How many values?");
		int n = scan.nextInt();

		for (int i = 0; i < n; i++) {
			String value = scan.next();
			ps.addValue(value);
		}

		ps.print();
		System.out.println("First: " + ps.first());

		scan.close();
	}
}