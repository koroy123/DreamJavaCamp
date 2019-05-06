package dreamSchool.cscourse.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 456;
		int aaa = num / 100;
		int aa = (num % 100) / 10;
		int a = 456 % 10;
		
		System.out.println("숫자 : " + num);
		System.out.println("백의 자리 수 : " + aaa);
		System.out.println("십의 자리 수 : " + aa);
		System.out.println("일의 자리 수 : " + a);

	}

}
