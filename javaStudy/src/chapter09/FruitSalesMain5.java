package chapter09;

class FruitSeller2 {
	private int numOfApple;
	private int myMoney;
	private final int APPLE_PRICE;
	
	public FruitSeller2(int money, int appleNum, int price) {
		myMoney = money;
		numOfApple = appleNum;
		APPLE_PRICE = price;
	}
	
	public int saleApple(int money) {
		int num = money / APPLE_PRICE;
		numOfApple -= num;
		myMoney += money;
		return num;
	}
	
	public void showSaleResult() {
		System.out.println("���� ���: " + numOfApple);
		System.out.println("�Ǹ� ����: " + myMoney);
	}
} 

class FruitBuyer2 {
	private int myMoney; 
	private int numOfApple;
	
	public FruitBuyer2(int money) {
		myMoney=money;
		numOfApple=0;
	}
	
	public void buyApple(FruitSeller2 seller, int money) {
		numOfApple += seller.saleApple(money);
		myMoney -= money;
	}
	
	public void showBuyResult() {
		System.out.println("���� �ܾ�: " + myMoney);
		System.out.println("��� ����: " + numOfApple);		
	}
}

class FruitSalesMain5 {
	public static void main(String[] args) {
		FruitSeller2 seller = new FruitSeller2(0, 30, 1500);
		FruitBuyer2 buyer = new FruitBuyer2(10000);
		
		buyer.buyApple(seller, 4500);  // ������ ���� ���� ���
		
		System.out.println("���� �Ǹ����� ���� ��Ȳ");
		seller.showSaleResult();
		
		System.out.println("���� �������� ���� ��Ȳ");
		buyer.showBuyResult();
	}
}