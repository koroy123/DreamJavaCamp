package dreamscool.cscourse.chapter05;

public class ChangeWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i= 1;
		while(i <= 10) {
			int j = 1;
			while(j <= i) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
