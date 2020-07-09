package chapter22;

import java.util.HashMap;

class IntroHashMap {
	public static void main(String[] args) {
		HashMap<Integer, String> hMap=new HashMap<Integer, String>();

		hMap.put(new Integer(3), "�����");		
		hMap.put(5, "������");	
		hMap.put(8, "���ȹ�");	
		
		System.out.println("6�г� 3�� 8�� �л�: "+hMap.get(new Integer(8)));
		System.out.println("6�г� 3�� 5�� �л�: "+hMap.get(5));
		System.out.println("6�г� 3�� 3�� �л�: "+hMap.get(3));
		
		hMap.remove(5);		/* 5�� �л� ���� �� */
		System.out.println("6�г� 3�� 5�� �л�: "+hMap.get(5));		
	}
}