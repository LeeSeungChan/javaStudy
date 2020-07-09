package chapter24;

import java.io.File;

class FileMove {
	public static void main(String[] args) {
		File myFile=new File("C:\\MyJava\\my.bin");
		if(myFile.exists()==false) {
			System.out.println("���� ������ �غ�Ǿ� ���� �ʽ��ϴ�.");
			return;
		}
		
		File reDir=new File("C:\\YourJava");
		reDir.mkdir();
		File reFile=new File(reDir, "my.bin");
		myFile.renameTo(reFile);
		if(reFile.exists()==true)
			System.out.println("���� �̵��� �����Ͽ����ϴ�.");
		else
			System.out.println("���� �̵��� �����Ͽ����ϴ�.");
	}
}