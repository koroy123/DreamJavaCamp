package dreamscool.cscourse.chapter05;

public class MultipleFiveSumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int count = 1;
		
		while (sum < 100) {
			int mulFive = count * 5;
			if(mulFive >= 100) {
				break;
			}
			sum += mulFive;
			System.out.println(count +".( + " + mulFive + ") " + sum);
			count++;
		}
		
	}

}
