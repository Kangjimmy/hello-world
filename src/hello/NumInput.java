package hello;

import java.util.Scanner;

public class NumInput {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		String a1 = s.next();
		String a2 = s.next();
		int num1 = Integer.parseInt(a1);
		int num2 = Integer.parseInt(a2);
		
		System.out.println(num1 + num2);
		s.close();
	}

}
