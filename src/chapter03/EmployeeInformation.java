package chapter03;

public class EmployeeInformation {

	public static void main(String[] args) {
		String name = ("ȫ�浿");
		int now = 2019;
		String year = "2002";
		
		int parseYear = Integer.parseInt(year);
		
		System.out.println("�̸� : " + name);
		System.out.println("�Ի�⵵ : " + year);
		System.out.println("�ٹ���� : " + (now - parseYear));

	}

}
