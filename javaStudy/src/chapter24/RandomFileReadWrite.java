package chapter24;

import java.io.*;

class RandomFileReadWrite {
	public static void main(String[] args) throws IOException {
		RandomAccessFile raf=new RandomAccessFile("data.bin", "rw");
		
		System.out.println("Write..............");
		System.out.printf("���� ����� ��ġ: %d ����Ʈ \n", raf.getFilePointer());
		
		raf.writeInt(200);
		raf.writeInt(500);
		System.out.printf("���� ����� ��ġ: %d ����Ʈ \n", raf.getFilePointer());
		
		raf.writeDouble(48.65);
		raf.writeDouble(52.24);
		System.out.printf("���� ����� ��ġ: %d ����Ʈ \n\n", raf.getFilePointer());
		
		System.out.println("Read..............");
		raf.seek(0);	// �� ������ �̵�
		System.out.printf("���� ����� ��ġ: %d ����Ʈ \n", raf.getFilePointer());
		
		System.out.println(raf.readInt());
		System.out.println(raf.readInt());
		System.out.printf("���� ����� ��ġ: %d ����Ʈ \n", raf.getFilePointer());
		
		System.out.println(raf.readDouble());
		System.out.println(raf.readDouble());
		System.out.printf("���� ����� ��ġ: %d ����Ʈ \n", raf.getFilePointer());
		raf.close();
	}
}