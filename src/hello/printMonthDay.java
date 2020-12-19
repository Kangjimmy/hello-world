package hello;

import java.util.Scanner;

public class printMonthDay {

	public static void main(String[] args) {
		int[] MonthDay = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("마지막 날을 알고 싶은 월을 입력: ");
		int month = scanner.nextInt();
		
		if (month < 1 || month > 12)
		{
			System.out.println("잘못된 월입니다.");
		}
		else
		{
			System.out.println(month + "월은 " + MonthDay[month-1] + "일까지 있습니다.");
		}
		
		scanner.close();
	}

}
