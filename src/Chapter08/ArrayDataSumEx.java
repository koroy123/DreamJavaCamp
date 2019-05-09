package Chapter08;

public class ArrayDataSumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []numbers = {11,22,33,44,55,66,77,88,99};
		int sum = 0;
		System.out.print("각 요소 : ");
		for(int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
			sum += numbers[1];
		}
		System.out.println();
		
		System.out.println("종합 : " + sum);

	}

}
