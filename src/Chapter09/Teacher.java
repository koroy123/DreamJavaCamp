package Chapter09;

public class Teacher extends Person{
	private String sudject;
	
	public Teacher(String name, String phoneNumber, String subject) {
		super(name, phoneNumber);
		this.sudject = subject;
	}
    public void teach() {
    	System.out.println("������ �ؿ�.");	
    }
    
    @Override
    public void eat() {
    	super.eat();
    	System.out.println("�ٰ��� �Ծ��.");
    }
    

}
