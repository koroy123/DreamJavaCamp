package Chapter08;

public class MaxMinTest {

	public static void main(String[] args) {
		int [] numbers = {12,53,24,10,22,38,64,39};
		
		int max = numbers[0];
		int min = numbers[0];
		
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > max) {
				max = numbers[i];
		}
		if(numbers[i] < min) {
			min = numbers[i];
		}
	  }
		System.out.println("ÃÖ´ñ°ª : " + max);
		System.out.println("ÃÖ¼Ú°ª : " + min);
   }

}
