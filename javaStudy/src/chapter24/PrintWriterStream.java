package chapter24;

import java.io.*;

class PrintWriterStream {
	public static void main(String[] args) throws IOException {
		PrintWriter out= new PrintWriter(new FileWriter("printf.txt"));
		
		out.printf("�� ���̴� %d�� �Դϴ�.", 24);
		out.println("");
		
		out.println("���� �ڹٰ� �����ϴ�.");
		out.print("Ư�� I/O �κп��� ���� �ŷ��� �����ϴ�.");
		out.close();
	}
}