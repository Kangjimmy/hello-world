package hello;

import java.util.Scanner;

public class Gugudan2to3 {

	public static void main(String[] args) {
//		사용자가 입력한 숫자 값에 해당하는 단을 출력한다.
//		예를 들어 사용자가 8이라는 숫자를 입력하면 8단 전체를 계산해 출력한다.
//		사용자가 2 이상, 9 이하가 아닌 값을 입력하는 경우 "2이상, 9이하의 값만 입력할 수 있습니다."라는 메시지를 출력한다.
		
		Scanner s = new Scanner(System.in);
		
		int dan = s.nextInt();
		
		if (dan < 2 || dan > 9)
		{
			System.out.println("2이상, 9 이하의 값만 입력할 수 있습니다.");
		}
		else
		{
			for (int i = 1; i < 10; i++)
			{
				System.out.println(dan + " * " + i + " = " + (dan*i));
			}
		}
		
		s.close();
	}

}
