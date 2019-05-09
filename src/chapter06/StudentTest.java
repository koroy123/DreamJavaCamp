package chapter06;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.studentName = "홍길동";
		stu.studentId = "S001";
		stu.korean = 94;
		stu.english = 80;
		stu.math = 89;
		
		stu.printStudentInfo();
		System.out.println("* 학번을 번경합니다.!!!");
		stu.ChangeStudentId("STU0001");
		stu.printStudentInfo();

	}

}
