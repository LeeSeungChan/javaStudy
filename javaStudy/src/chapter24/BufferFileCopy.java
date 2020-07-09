package chapter24;

import java.io.*;

class BufferFileCopy {
	public static void main(String[] args) throws IOException {
		InputStream in=new FileInputStream("org.bin");
		OutputStream out=new FileOutputStream("cpy.bin");
		
		int copyByte=0;
		int readLen;
		byte buf[]=new byte[1024];
		
		while(true) {
			readLen=in.read(buf);
			if(readLen==-1)
				break;
			out.write(buf, 0, readLen);
			copyByte+=readLen;			
		}

		in.close();
		out.close();		
		System.out.println("����� ����Ʈ ũ�� "+ copyByte);
	}
}