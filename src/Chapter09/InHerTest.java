package Chapter09;

import Chapter10.Person;
import Chapter10.Student;
import Chapter10.Teacher;

public class InHerTest {

	public static void main(String[] args) {
		Student stu = new Student("ȫ�浿", "123-4567", "��ǻ�� ���а�");
		Teacher tea = new Teacher("ȫ���", "333-4567", "��ǻ�� ���а�");
		Person per = new Person("������", "456-7890");
		
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
