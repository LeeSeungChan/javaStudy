package chapter13;

import java.util.Scanner;

class WhyNeedArray {
	public static void main(String[] args) {
		int fstHighScore=0;		// 1�� ����
		int sndHighScore=0;		// 2�� ����

		Scanner sc=new Scanner(System.in);

		System.out.print("���� �Է�: ");		
		int score1=sc.nextInt();

		if(score1>=fstHighScore) {
			sndHighScore=fstHighScore;
			fstHighScore=score1;
		} else if(score1<fstHighScore && score1>sndHighScore) {
			sndHighScore=score1;
		}

		System.out.print("���� �Է�: ");		
		int score2=sc.nextInt();

		if(score2>=fstHighScore) {
			sndHighScore=fstHighScore;
			fstHighScore=score2;
		} else if(score2<fstHighScore && score2>sndHighScore) {
			sndHighScore=score2;
		}

		System.out.print("���� �Է�: ");		
		int score3=sc.nextInt();

		if(score3>=fstHighScore) {
			sndHighScore=fstHighScore;
			fstHighScore=score3;
		} else if(score3<fstHighScore && score3>sndHighScore) {
			sndHighScore=score3;
		}
		
		System.out.printf("A ������ %d�� �̻��Դϴ�. \n", sndHighScore);
	}
}