package Chapter10;

public class AnimalTest {

	public static void main(String[] args) {
		Animal bird1 = new Bird("������", 3, "�������");
		System.out.println(bird1.getKind() + "(" + bird1.getAge() + "��) : " + ((Bird)bird1).getHabitat());
		
		((Bird)bird1).spreaWings();
		((Bird)bird1).fly();
		
		Flyable bird2 = new Bird("������", 3, "�������");
		System.out.println(((Bird)bird2).getKind() + "( " + ((Bird)bird2).getAge() + "��) : " + ((Bird)bird2).getHabitat());
		
		bird2.spreaWings();
		bird2.fly();


	}

}
