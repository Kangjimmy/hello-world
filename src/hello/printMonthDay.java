package hello;

import java.util.Scanner;

public class printMonthDay {
	private final static int[] MAX_DAY_OF_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int daysOfMonth(int month) {
		return MAX_DAY_OF_MONTH[month-1];
	}
	
	public static boolean isYoonYear (int year) {
		if (year % 4  == 0) {
			if (year % 100 == 0 && year % 400 != 0) {
				return false;
			}
			else {
				return true;
			}
		}
		
		return false;
	}
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("년을 입력하세요");
			
			int year = scanner.nextInt();
			
			System.out.println("월을 입력하세요");
			
			int month = scanner.nextInt();
			
			if (month == -1) 
			{
				System.out.println("종료합니다.");
				break;
			}
			
			if (month < 1 || month > 12)
			{
				System.out.println("잘못된 입력입니다.");
				continue;
			}
			
			final int days;
			if (month == 2 && isYoonYear(year)) {
				days = 29;
			}
			else {
				days = daysOfMonth(month);
			}

			System.out.println(month+"월은 " + days+"일까지 있습니다.");
			printCalendar(days);
		}

		scanner.close();
	}
	public static void printCalendar(int days) {
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.print("---------------------");

		for (int i = 0 ; i < days; i++) {
			if (i % 7 == 0) {
				System.out.println();
			}
			System.out.printf("%3d", i+1);
		}
		System.out.println();
	}

}
