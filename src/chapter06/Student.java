package chapter06;

public class Student {

	
		String studentName;
		String studentId;
		int korean;
		int english;
		int math;
		
		double calculateAverage() {
			double avg = (korean + english + math) /(double)3;
			return avg;
		}
		
		void printStudentInfo() {
			System.out.println("학생명 : " + studentName);
			System.out.println("학번 : " + studentId);
			System.out.println("국어점수 : " + korean);
			System.out.println("영어점수 : " + english);
			System.out.println("수학점수 : " + math);
			System.out.println("평균점수 : " + (int)calculateAverage());
			
		} 
		
		void ChangeStudentId(String newId) {
			studentId = newId;
		}


}
