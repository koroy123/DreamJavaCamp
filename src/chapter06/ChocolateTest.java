package chapter06;

import Chapter08.Chocolate;

public class ChocolateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate choco = new Chocolate();
		choco.name = "아마도라 ";
		choco.type = "다크";
		choco.price = 2200;
		choco.printChocolateInfo();
		
		String chocoName = choco.getName();
		int totalPrice = choco.calculatetitalPrice(20);
		System.out.println(chocoName + "초코렛 20개 : " + totalPrice);
		choco.changeChocoalteInf("카페 키리쉬", 2500);
		choco.printChocolateInfo();
		System.out.println("카페 키리쉬 초콜렛 15개(10%할인) : " + choco.calculateTotalPrice(15, 10));
		choco.changeChocoalteInf("트리플 불랑", "화이트", 2300);
		choco.printChocolateInfo();

	}

}
