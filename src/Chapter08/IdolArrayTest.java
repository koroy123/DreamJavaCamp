package Chapter08;

public class IdolArrayTest {

	public static void main(String[] args) {
		Idol[] idols = new Idol[4];
		idols[0] = new Idol("�ҳ�ô�", "�¿�");
		idols[1] = new Idol("����Ÿ", "����");
		idols[2] = new Idol("���", "���巡��");
		idols[3] = new Idol("��Ʈ", "�����");
		
		idols[0].printIdolInfo();
		idols[1].printIdolInfo();
		idols[2].printIdolInfo();
		idols[3].printIdolInfo();
		
		System.out.println();
		
		}
		
}

