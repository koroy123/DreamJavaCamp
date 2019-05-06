package chapter05;

public class ConditionIfEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 나이 = 20;
		
		if (나이 < 19) {
			System.out.println("19세 이상만 입장 가능합니다");
			System.out.println("죄송합니다");
		}
		
		if (나이 >=19) {
			System.out.println("성인입니다");
			System.out.println("입장하세요");
		}

	}

}
