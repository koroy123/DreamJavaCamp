package Chapter09;

public class Teacher extends Person{
	private String sudject;
	
	public Teacher(String name, String phoneNumber, String subject) {
		super(name, phoneNumber);
		this.sudject = subject;
	}
    public void teach() {
    	System.out.println("수업을 해요.");	
    }
    
    @Override
    public void eat() {
    	super.eat();
    	System.out.println("다같이 먹어요.");
    }
    

}
