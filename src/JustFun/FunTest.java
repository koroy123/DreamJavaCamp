package JustFun;

public class FunTest {

	public static void main(String[] args) {
		
		Fun[] funny = new Fun[3] ;
	    funny[0] = new Fun("하늘뜻", "177");
	    funny[1] = new Fun("카이로스", "175");
	    funny[2] = new Fun("퍼펙트", "169");
	    
	    funny[0].printIdolInfo();
	    funny[1].printIdolInfo();
	    funny[2].printIdolInfo();
	    
	    System.out.println();
	
	}

}
