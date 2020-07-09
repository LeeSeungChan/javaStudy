package chapter22;

import java.util.Iterator;
import java.util.HashSet;

class SimpleNumber2 {
	int num;
	public SimpleNumber2(int n) {
		num=n;
	}
	
	public String toString() {
		return String.valueOf(num);
	}
	
	public int hashCode() {
		return num%3;
	}
	
	public boolean equals(Object obj) {
		SimpleNumber2 comp=(SimpleNumber2)obj;
		if(comp.num==num)
			return true;
		else
			return false;		
	}
}

class HashSetEqualityTwo {
	public static void main(String[] args) {
		HashSet<SimpleNumber2> hSet=new HashSet<SimpleNumber2>();
		hSet.add(new SimpleNumber2(10));
		hSet.add(new SimpleNumber2(20));
		hSet.add(new SimpleNumber2(20));
		
		System.out.println("����� ������ ��: "+hSet.size());
		
		Iterator<SimpleNumber2> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}