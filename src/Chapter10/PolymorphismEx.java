package Chapter10;

public class PolymorphismEx {

	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person("ȫ�浿", "111-2222");
		persons[1] = new Student("ȫ���", "111-2345", "��ǻ�Ͱ��а�");
		persons[2] = new Teacher("������", "222-3333", ",Java");
		
		for(Person p : persons) {
			p.eat();
			p.sleep();
			System.out.println();
			//�迭�� �����ΰ��� ���������� ��밡���� ����
			
	  //for(int i = 0; i < persons.length; i++) {
	  //persons[i].eat();
	  //persons[i].sleep();
	  //System.out.println();
			//�������� ����


		}

	}

}
