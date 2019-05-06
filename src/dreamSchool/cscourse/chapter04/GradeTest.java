package dreamSchool.cscourse.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int 점수 = 75;
		
		System.out.println("A학점 : " +(점수 <= 100 && 점수 >= 90));
		System.out.println("B학점 : " + (점수 <=89 && 점수 >= 80));
		System.out.println("C학점 : " + ( 점수 <= 79 && 점수 >= 70));
		System.out.println("D학점 : " + (점수 <= 69 && 점수 >= 60));
	
	}

}
