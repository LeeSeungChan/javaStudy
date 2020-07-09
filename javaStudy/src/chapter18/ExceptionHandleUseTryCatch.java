package chapter18;

import java.util.Scanner;

class ExceptionHandleUseTryCatch {	
	public static void main(String[] args) {
		Scanner keyboard=new Scanner(System.in);
		int[] arr=new int[100];
		
		for(int i=0; i<3; i++) {
			try {
				System.out.print("������ �Է�: ");
				int num1=keyboard.nextInt();
				
				System.out.print("���� �Է�: ");
				int num2=keyboard.nextInt();
				
				System.out.print("�������� ������ �迭�� �ε��� �Է�: ");
				int idx=keyboard.nextInt();
				
				arr[idx]=num1/num2;
				System.out.println("������ ����� "+arr[idx]);
				System.out.println("����� ��ġ�� �ε����� "+idx);	
			} catch(ArithmeticException e) {
				System.out.println("������ 0�� �� �� �����ϴ�.");
				i-=1;
				continue;
			} catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("��ȿ���� ���� �ε��� ���Դϴ�.");
				i-=1;
				continue;
			}
		}
	}
}