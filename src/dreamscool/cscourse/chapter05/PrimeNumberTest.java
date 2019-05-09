package dreamscool.cscourse.chapter05;

public class PrimeNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 22;
		
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
				System.out.println( num + " = 소수가 아닙니다.");
				break;
			}else {
				System.out.println(num + " = 소수입니다.");
				break;
			}
			
		}
		

	}

}
