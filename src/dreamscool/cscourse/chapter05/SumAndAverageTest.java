package dreamscool.cscourse.chapter05;

public class SumAndAverageTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		double average = 0;
		
		for (int i = 1; i <= 500; i++) {
			sum += i;
		}
		average = (double)sum / 500;
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + average);
		
	}

}
