package chapter06;

public class Account {
	String accName;
	String accNo;
	int balance;
	
	void deposit(int money) {
		if(money < 0) {
			System.out.println("[에러]금액은 음수를 입력할 수 없습니다.");
		}else {
			balance += money;
		}
		
	}
	
	int withdraw(int money) {
		if (money < 0 ) {
			System.out.println("[에러]금액은 음수를 입력할 수 없습니다.");
			return 0;
		}else if (money > balance) {
			System.out.println("[에러] 진액이 부족합니다.");
			return 0;
		}else {
			balance -= money;
			return money;
		}
		
	}
	
	void printAccountInfo() {
		System.out.println("계좌 : " + accNo + "(예금주 : " + accName + ")");
		

	}


}
