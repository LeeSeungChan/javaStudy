package chapter09;

class SinivelCap {   // 콧물 처치용 캡슐
	public void take(){System.out.println("콧물이 싹~ 납니다.");}
}

class SneezeCap {  // 재채기 처치용 캡슐
	public void take() {System.out.println("재채기가 멎습니다.");}
}

class SnuffleCap {   // 코막힘 처치용 캡슐
	public void take() {System.out.println("코가 뻥 뚫립니다.");}
}

class ColdPatient {
	public void takeSinivelCap(SinivelCap cap){cap.take();}
	public void takeSneezeCap(SneezeCap cap){cap.take();}
	public void takeSnuffleCap(SnuffleCap cap){cap.take();}
}

class Encapsulation1 {
	public static void main(String[] args) {
		ColdPatient sufferer = new ColdPatient();
		sufferer.takeSinivelCap(new SinivelCap());
		sufferer.takeSneezeCap(new SneezeCap());
		sufferer.takeSnuffleCap(new SnuffleCap());
	}
}