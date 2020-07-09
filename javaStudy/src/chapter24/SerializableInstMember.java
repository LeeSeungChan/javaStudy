package chapter24;

import java.io.*;

class Point implements Serializable {
	int x, y;
	
	public Point(int x, int y) {
		this.x=x;
		this.y=y;
	}
}

class Circle2 implements Serializable {
	Point p;
	double rad;
	
	public Circle2(int x, int y, double r) {
		p=new Point(x, y);
		rad=r;
	}
	
	public void showCirlceInfo() {
		System.out.printf("[%d, %d] \n", p.x, p.y);
		System.out.println("rad: "+rad);
	}
}

class SerializableInstMember {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		/* �ν��Ͻ� ���� */
		ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream("Object.ser"));
		
		out.writeObject(new Circle2(1, 1, 2.4));
		out.writeObject(new Circle2(2, 2, 4.8));	
		out.writeObject(new String("String implements Serializable"));
		out.close();
		
		/* �ν��Ͻ� ���� */
		ObjectInputStream in= new ObjectInputStream(new FileInputStream("Object.ser"));
		Circle2 cl1=(Circle2)in.readObject();
		Circle2 cl2=(Circle2)in.readObject();
		String message=(String)in.readObject();
		in.close();
		
		/* ������ ���� ��� */
		cl1.showCirlceInfo();
		cl2.showCirlceInfo();
		System.out.println(message);
	}
}