package Goto.github;

import java.util.Scanner;

// ���� 4.
// Ŀ�� �ֹ��� �Ϸ��� �Ѵ�.
// �޴��� ����, �� �޴� ���� �� ���� �ֹ��� ������ �Է� �޾� �����ؾ� �� �� �ݾ��� ����� ����.
// �׸��� �� �ݾ��� ���� �ݾ��� �Ѿ�� ����Ʈ�� ������ �ش�.
// �� �ݾ� 12000�� �̻� : ���� �ݾ��� 1% ����
// �� �ݾ� 30000�� �̻� : ���� �ݾ��� 2% ����
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= �޴� =========" );
        System.out.println( " 1. �Ƹ޸�ī��   2000��" );
        System.out.println( " 2. ī���   3000��" );
        System.out.println( " 3. ���̱�   1500��" );
        System.out.println( " 4. ũ��ġ��   500��\n" );
        
        System.out.println( "========= �ֹ� =========" );
        System.out.print( " �Ƹ޸�ī�� �ֹ� ���� : " );
        int Americano = getUserInput();
        
        System.out.print( " ī��� �ֹ� ���� : " );
        int Cafelatte = getUserInput();
        
        System.out.print( " ���̱� �ֹ� ���� : " );
        int Bagel = getUserInput();
        
        System.out.print( " ũ��ġ�� �ֹ� ���� : " );
        int Creamcheese = getUserInput();
       
        int Americanototal = 2000 * Americano;
        int Cafelattetotal = 3000 * Cafelatte;
        int Bageltotal = 1500 *Bagel;
        int Creamcheesetotal = 500 * Creamcheese;
        int total = Americanototal + Cafelattetotal + Bageltotal + Creamcheesetotal;
        
        System.out.println("========�ݾ�=========");
        System.out.println(2000 * Americano);
        System.out.println(3000 * Cafelatte);
        System.out.println(1500 * Bagel);
        System.out.println(500 * Creamcheese);
        
        System.out.println("=================");
        System.out.println("�� ���� �ݾ� : " + total);
        if(total >= 30000) {
        	System.out.println("����Ʈ ���� : " + (total / 100 * 2) + "��");
        }else if(total < 30000 &&  total >= 12000) {
        	System.out.println("����Ʈ ���� : " + (total / 100 * 1) + "��");
        }else {
        	System.out.println("����Ʈ ���� : 0��");
        }
        
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
