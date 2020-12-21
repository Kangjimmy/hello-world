package hello;

import java.util.Calendar;
import java.util.Scanner;

public class printMonthDay {
	private final static int[] MAX_DAY_OF_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	private final static String[] DAY_OF_WEEK = {"SU", "MO", "TU", "WE", "TH", "FR", "SA"};
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
	
	public static void printCalendar(int year, int month) {
		
		final int days;
		if (month == 2 && isYoonYear(year)) {
			days = 29;
		}
		else {
			days = daysOfMonth(month);
		}
		Calendar c = Calendar.getInstance();
		c.clear();
		c.set(year, month - 1, 1);
		int weekDay = c.get(Calendar.DAY_OF_WEEK) - 1;

		System.out.println(month+"월은 " + days+"일까지 있습니다.");
		System.out.printf("    <%4d년%3d월>%n", year, month);
		System.out.println(" SU MO TU WE TH FR SA");
		System.out.println("---------------------");

		for (int i = 0; i < weekDay; i++) {
			System.out.printf("%3s","");
		}
		for (int i = 1 ; i <= days; i++) {

			System.out.printf("%3d", i);
			
			if ((i+weekDay) % 7 == 0) {
				System.out.println();
			}
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
			
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
			System.out.println("년을 입력하세요");
			System.out.print("YEAR> ");
			int year = scanner.nextInt();

			if (year == -1) 
			{
				System.out.println("종료합니다.");
				break;
			}
			
			System.out.println("월을 입력하세요");
			System.out.print("MONTH> ");
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
			
			printCalendar(year ,month);
		}

		scanner.close();
	}
}
