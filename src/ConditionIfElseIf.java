
public class ConditionIfElseIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		
		if (age >= 19) {
			System.out.println("성인 입니다");
			System.out.println("입장하세요");
		}else if (age >=13) {
			System.out.println("청소년 입니다");
			System.out.println("조금만 기다려 주세요");
		}else {
			System.out.println("어린이 입니다");
			System.out.println("나가노세요");
		}

	}

}
