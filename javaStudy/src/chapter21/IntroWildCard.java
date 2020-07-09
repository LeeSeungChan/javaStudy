package chapter21;

class Fruit {
	public void showYou() { 
		System.out.println("난 과일입니다.");
	}
}

class Apple2 extends Fruit {
	public void showYou() {
		super.showYou();
		System.out.println("난 붉은 과일입니다.");
	}	
}

class FruitBox2<T> {
	T item;
	public void store(T item) { this.item=item; }
	public T pullOut() { return item; }
}

class IntroWildCard {
	public static void openAndShowFruitBox(FruitBox2<? extends Fruit> box) {
		Fruit fruit=box.pullOut();
		fruit.showYou();
	}
	
	public static void main(String[] args) {
		FruitBox2<Fruit> box1=new FruitBox2<Fruit>();
		box1.store(new Fruit());
		
		FruitBox2<Apple2> box2=new FruitBox2<Apple2>();
		box2.store(new Apple2());
		
		openAndShowFruitBox(box1);
		openAndShowFruitBox(box2);
	}
}