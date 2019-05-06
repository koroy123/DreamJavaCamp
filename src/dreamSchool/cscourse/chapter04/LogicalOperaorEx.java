package dreamSchool.cscourse.chapter04;

public class LogicalOperaorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10;
		int num2 = 3;
		
		boolean a = (num1 > num2) && (num1 > 5);
		boolean b = (num1 > num2) && (num1 == num2);
		boolean c = (num1 <= num2) || (num1 != num2);
		boolean d = (num1 <=num2) ||! (num1 > num2);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(!d);
				
	}

}
