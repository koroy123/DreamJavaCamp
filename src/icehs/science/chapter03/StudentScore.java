package icehs.science.chapter03;

public class StudentScore {

	public static void main(String[] args) {
		double math = 94.7;
		double english = 83.2;
		double koreaLanguage = 87.1;
		
		int intMath = (int)math;
		System.out.println("수학 : " + intMath);
		//System.out.println("수학 int 변환 : " + intMath);
		
		int intEnglish = (int)english;
		System.out.println("영어 : " + intEnglish);
		//System.out.println("영어 int 변환 : " + intEnglish);
		
		int intKoreaLanguage = (int)koreaLanguage;
		System.out.println("국어 : " + intKoreaLanguage);
		//System.out.println("국어 int 변환 : " + intKoreaLanguage);
		
	}

}
