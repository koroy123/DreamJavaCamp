package chapter06;

import Chapter08.Chocolate;

public class ChocolateTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Chocolate choco = new Chocolate();
		choco.name = "�Ƹ����� ";
		choco.type = "��ũ";
		choco.price = 2200;
		choco.printChocolateInfo();
		
		String chocoName = choco.getName();
		int totalPrice = choco.calculatetitalPrice(20);
		System.out.println(chocoName + "���ڷ� 20�� : " + totalPrice);
		choco.changeChocoalteInf("ī�� Ű����", 2500);
		choco.printChocolateInfo();
		System.out.println("ī�� Ű���� ���ݷ� 15��(10%����) : " + choco.calculateTotalPrice(15, 10));
		choco.changeChocoalteInf("Ʈ���� �Ҷ�", "ȭ��Ʈ", 2300);
		choco.printChocolateInfo();

	}

}
