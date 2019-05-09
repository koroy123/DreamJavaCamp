package Chapter09;

import Chapter10.Person;
import Chapter10.Student;
import Chapter10.Teacher;

public class InHerTest {

	public static void main(String[] args) {
		Student stu = new Student("홍길동", "123-4567", "컴퓨터 공학과");
		Teacher tea = new Teacher("홍길순", "333-4567", "컴퓨터 공학과");
		Person per = new Person("강감찬", "456-7890");
		
		System.out.println("=====Person=====");
		per.eat();
		per.sleep();
		
		System.out.println("=====Student=====");
		
		stu.study();
		stu.eat();
		
		System.out.println("=====Teacher=====");
		
		tea.teach();
		tea.eat();

	}

}
