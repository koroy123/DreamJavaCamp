package dreamscool.cscourse.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int num = a * b;
		
		if (num < 10 && num >= 0) {
			System.out.println("한 자리 수 입니다");
		}else if (num >= 10 && num < 100) {
			System.out.println("두 자리 수 입니다");
		}else if (num >= 100 ) {
			System.out.println("세 자리 수 이상 입니다");
		}else {
			System.out.println("음수는 확인하지 않습니다");
		}

	}

}
