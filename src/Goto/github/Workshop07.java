package Goto.github;

import java.util.Random;
import java.util.Scanner;

public class Workshop07 {

	public static void main(String[] args) {
		int compNo = getHiddenNumber();
		System.out.println(compNo);
		
		for(int i = 1; i <= 10; i++) {
			System.out.println(i + "��° ��ȸ�Դϴ� . ���ڸ� �Է��ϼ��� : ");
						int userNo = getUserInput();
			if (userNo == compNo) {
				System.out.println("������ ���߼̽��ϴ�. �����մϴ�!!");
				break;
			}else if (userNo > compNo) {
				System.out.println(userNo + "���� �۽��ϴ�.");
			}else if (userNo < compNo) {
				System.out.println(userNo + "���� Ů�ϴ�");
			}
		}
		System.out.println("�����մϴ�. Bye~Bye~");

	}
	public static int getHiddenNumber() {
		Random random = new Random();
		int num = random.nextInt(100);
		return num;
	}
	public static int getUserInput() {
        
       	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    }

}
