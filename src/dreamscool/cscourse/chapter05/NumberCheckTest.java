package dreamscool.cscourse.chapter05;

public class NumberCheckTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 2;
		int b = 3;
		int num = a * b;
		
		if (num < 10 && num >= 0) {
			System.out.println("�� �ڸ� �� �Դϴ�");
		}else if (num >= 10 && num < 100) {
			System.out.println("�� �ڸ� �� �Դϴ�");
		}else if (num >= 100 ) {
			System.out.println("�� �ڸ� �� �̻� �Դϴ�");
		}else {
			System.out.println("������ Ȯ������ �ʽ��ϴ�");
		}

	}

}
