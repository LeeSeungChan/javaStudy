package chapter22;

class Box<T> {
	public Box<T> nextBox;
	T item;

	public void store(T item) { this.item=item; }
	public T pullOut() { return item; }
}

class SoSimpleLinkedListImpl {
	public static void main(String[] args) {
		Box<String> boxHead=new Box<String>();
		boxHead.store("First String");
		
		boxHead.nextBox=new Box<String>();
		boxHead.nextBox.store("Second String");
		
		boxHead.nextBox.nextBox=new Box<String>();
		boxHead.nextBox.nextBox.store("Third String");
		
		Box<String> tempRef;
		
		/* �� ��° �ڽ��� ��� ���ڿ� ��� ���� */
		tempRef=boxHead.nextBox;
		System.out.println(tempRef.pullOut());

		/* �� ��° �ڽ��� ��� ���ڿ� ��� ���� */
		tempRef=boxHead.nextBox;
		tempRef=tempRef.nextBox;
		System.out.println(tempRef.pullOut());
	}
}