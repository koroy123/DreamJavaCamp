package Chapter10.heroes;

public class SuperMan extends Hero{
	@Override
	public void action() {
		System.out.print(this.toString() + "이");
		swim();
		System.out.print(this.toString() + "이");
		fight();
		System.out.print(this.toString() + "이");
	    fight();
	}
	@Override
	public String toString() {
		return "슈퍼맨";
	}

}
