package Goto.github;

//문제 2.
//아래와 같이 변수가 선언되어 있을 때,
//백의 자리만 남기고 나머지 자리수는 0으로 바꾸는 프로그램을 완성하시오.
public class Workshop02 {
 
	public static void main( String[] args ) {
		int number1 = 100;
		int number2 = number1 / 10;
		
		if (number2<10) {
			System.out.println("세 자리 수가 아닙니다.수를 다시 입력해 주세요.");
		}else {
			System.out.println(number1 / 100 * 100);
		}
		
		
		
     
     
 	}
}