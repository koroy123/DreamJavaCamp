package chapter06;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car myCar = new Car();
		myCar.carName = "Dreac School Car~~";
		myCar.oilAmount = 5;
		myCar.distance = 140;
		
		myCar.priceCarInfo();
		
		myCar.addOil(10);
		
		myCar.priceCarInfo();
		
		myCar.driveCar("IT센터", "인천공항", 10.17);
		
		myCar.priceCarInfo();
		
		myCar.driveCar("인천공항", "곤지암 리조트", 60.21);

		myCar.priceCarInfo();
		
		myCar.distanceCheck();
	}

}
