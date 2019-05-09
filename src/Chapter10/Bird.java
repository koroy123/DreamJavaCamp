package Chapter10;

public class Bird extends Animal implements Flyable{
	
	private String habitat;

	public Bird(String kind, int age, String habitat) {
		super(kind, age);
		this.habitat = habitat;
	}
	
	public String getHabitat() {
		return habitat;
		
	}

	public void setHabitat(String habitat) {
		
	}

	@Override
	public void fly() {
		System.out.println("날아간다.");
		
	}

	@Override
	public void spreaWings() {
		System.out.println("날개를 펼친다.");
		
	}
	
	

}
