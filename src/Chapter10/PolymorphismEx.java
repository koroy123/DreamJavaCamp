package Chapter10;

public class PolymorphismEx {

	public static void main(String[] args) {
		Person[] persons = new Person[3];
		persons[0] = new Person("홍길동", "111-2222");
		persons[1] = new Student("홍길순", "111-2345", "컴퓨터공학과");
		persons[2] = new Teacher("강감찬", "222-3333", ",Java");
		
		for(Person p : persons) {
			p.eat();
			p.sleep();
			System.out.println();
			//배열로 무엇인가를 저장했을때 사용가능한 구조
			
	  //for(int i = 0; i < persons.length; i++) {
	  //persons[i].eat();
	  //persons[i].sleep();
	  //System.out.println();
			//전통적인 구조


		}

	}

}
