package Goto.github;

import java.util.Scanner;

// 문제 4.
// 커피 주문을 하려고 한다.
// 메뉴를 보고, 각 메뉴 별로 몇 개씩 주문할 것인지 입력 받아 지불해야 할 총 금액을 계산해 보자.
// 그리고 총 금액이 일정 금액을 넘어서면 포인트를 적립해 준다.
// 총 금액 12000원 이상 : 구매 금액의 1% 적립
// 총 금액 30000원 이상 : 구매 금액의 2% 적립
public class Workshop04 {
    
    public static void main( String[] args ) {
        
        System.out.println( "========= 메뉴 =========" );
        System.out.println( " 1. 아메리카노   2000원" );
        System.out.println( " 2. 카페라떼   3000원" );
        System.out.println( " 3. 베이글   1500원" );
        System.out.println( " 4. 크림치즈   500원\n" );
        
        System.out.println( "========= 주문 =========" );
        System.out.print( " 아메리카노 주문 수량 : " );
        int Americano = getUserInput();
        
        System.out.print( " 카페라떼 주문 수량 : " );
        int Cafelatte = getUserInput();
        
        System.out.print( " 베이글 주문 수량 : " );
        int Bagel = getUserInput();
        
        System.out.print( " 크림치즈 주문 수량 : " );
        int Creamcheese = getUserInput();
       
        int Americanototal = 2000 * Americano;
        int Cafelattetotal = 3000 * Cafelatte;
        int Bageltotal = 1500 *Bagel;
        int Creamcheesetotal = 500 * Creamcheese;
        int total = Americanototal + Cafelattetotal + Bageltotal + Creamcheesetotal;
        
        System.out.println("========금액=========");
        System.out.println(2000 * Americano);
        System.out.println(3000 * Cafelatte);
        System.out.println(1500 * Bagel);
        System.out.println(500 * Creamcheese);
        
        System.out.println("=================");
        System.out.println("총 구매 금액 : " + total);
        if(total >= 30000) {
        	System.out.println("포인트 적립 : " + (total / 100 * 2) + "점");
        }else if(total < 30000 &&  total >= 12000) {
        	System.out.println("포인트 적립 : " + (total / 100 * 1) + "점");
        }else {
        	System.out.println("포인트 적립 : 0점");
        }
        
        
    }
    
    public static int getUserInput() {
        
    	Scanner scanner = new Scanner(System.in);
    	int value = scanner.nextInt();
    	return value;
    	
    }
}
