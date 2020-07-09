package chapter24;

import java.io.*;

class StringWriter {
	public static void main(String[] args) throws IOException {
		BufferedWriter out= new BufferedWriter(new FileWriter("Strint.txt"));
		
		out.write("������ - �޽� ���߰� �ϴµ� �����ϰڴ�.");
		out.newLine();
		out.write("�� ������ ������ �־� �ְ��� �����̴�.");
		out.newLine();
		out.write("���� �¸��ϴ� ���� ���� ���� �ּ��� ���ϰڴ�.");
		out.newLine();
		out.write("ȯ������ ������� �� ���̴�.");
		out.newLine();
		out.newLine();
		out.write("��� ���� �� �����ڷ�");
		out.newLine();
		out.write("press@goodnews.co.kr");
		out.close();
		System.out.println("��� �Է� �Ϸ�.");		
	}
}