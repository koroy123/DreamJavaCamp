package Chapter10;

public class MobileTest {

	public static void main(String[] args) {
		Mobile [] mobiles = new Mobile[2];
		mobiles[0] = new Galaxy("Galaxy");
		mobiles[1] = new IPhone("IPhone");
		Galaxy gal = (Galaxy)mobiles[0];
		gal.setOsVersion("�ȵ���̵� ������");
		IPhone ip = (IPhone)mobiles[1];
		ip.setColor("���");
		
		System.out.println("Galaxy : " + gal.getOsVersion());
		mobiles[0].call(5);
		mobiles[0].charge(30);
		System.out.println("IPhone : " + ip.getColor());
		mobiles[1].call(10);
		mobiles[1].charge(15);
		
	}

}
