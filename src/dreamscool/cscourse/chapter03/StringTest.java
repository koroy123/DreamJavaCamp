package dreamscool.cscourse.chapter03;

public class StringTest {

	public static void main(String[] args) {
		String name = "ȫ�浿";
		String department = "������";
		
		System.out.println(name);
		System.out.println(department);
		
		String mathScore = "86";
		int intMathScore = Integer.parseInt(mathScore) + 1;
		
		System.out.println(name);
		System.out.println(department);
		
		System.out.println(name + department);
		System.out.println(name + " : " + department);
		System.out.println("�������� : " + mathScore + 1);
		System.out.println("�������� : " + intMathScore + 1);
		
	}

}
