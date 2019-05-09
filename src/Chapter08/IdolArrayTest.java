package Chapter08;

public class IdolArrayTest {

	public static void main(String[] args) {
		Idol[] idols = new Idol[4];
		idols[0] = new Idol("¼Ò³à½Ã´ë", "ÅÂ¿¬");
		idols[1] = new Idol("¾¾½ºÅ¸", "º¸¶ó");
		idols[2] = new Idol("ºò¹ð", "Áöµå·¡°ï");
		idols[3] = new Idol("ºñ½ºÆ®", "¾ç¿äÇÑ");
		
		idols[0].printIdolInfo();
		idols[1].printIdolInfo();
		idols[2].printIdolInfo();
		idols[3].printIdolInfo();
		
		System.out.println();
		
		}
		
}

