package chapter06;

public class Car {
	String carName;
	int oilAmount;
	double distance;
	
	void addOil(int amount) {
		oilAmount += amount;
		System.out.println("�ֹ�����" + amount + "L �����մϴ�.");
	}
	
	void priceCarInfo() {
		System.out.println("[" + carName + "] ���� �⸧�� : " + oilAmount + "L, �� ����Ÿ� : " + distance + " Km");
	}
	void driveCar(String startPoint, String endPoint, double driveDistance) {
		System.out.println(startPoint + "����" + endPoint + "����" + driveDistance + "Km �����Ͽ����ϴ�.");
		distance += driveDistance;
		oilAmount -=(int)(driveDistance / 20);
	}
	void distanceCheck() {
		System.out.println("���డ�� �Ÿ��� ��" + (oilAmount * 20) + "Km�Դϴ�.");
	}

}
