package hello;

import java.util.Scanner;

public class Gugudan2to3 {

	public static void main(String[] args) {
//		����ڰ� �Է��� ���� ���� �ش��ϴ� ���� ����Ѵ�.
//		���� ��� ����ڰ� 8�̶�� ���ڸ� �Է��ϸ� 8�� ��ü�� ����� ����Ѵ�.
//		����ڰ� 2 �̻�, 9 ���ϰ� �ƴ� ���� �Է��ϴ� ��� "2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�."��� �޽����� ����Ѵ�.
		
		Scanner s = new Scanner(System.in);
		
		int dan = s.nextInt();
		
		if (dan < 2 || dan > 9)
		{
			System.out.println("2�̻�, 9 ������ ���� �Է��� �� �ֽ��ϴ�.");
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
