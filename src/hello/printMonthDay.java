package hello;

import java.util.Scanner;

public class printMonthDay {
	private final static int[] MAX_DAY_OF_MONTH = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	
	public static int daysOfMonth(int month) {
		return MAX_DAY_OF_MONTH[month-1];
	}
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
		
		while(true)
		{
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
			
			System.out.println(month+"월은 " + daysOfMonth(month)+"일까지 있습니다.");
		}

		scanner.close();
	}

}
