package chapter22;

import java.util.LinkedList;

class IntroLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>();
		
		/* �������� ���� */
		list.add(new Integer(11));
		list.add(new Integer(22));
		list.add(new Integer(33));
		
		/* �������� ���� */
		System.out.println("1�� ����");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));
		
		/* �������� ���� */
		list.remove(0);
		System.out.println("2�� ����");
		for(int i=0; i<list.size(); i++)
			System.out.println(list.get(i));	
	}
}