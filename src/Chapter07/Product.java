package Chapter07;

public class Product {
	String name;
	int price;
	int discount;
	
	
	public Product() {
	}


	public Product(String name, int price) {
		this.name = name;
		this.price = price;
	}


	public Product(String name, int price, int discount) {
		this.name = name;
		this.price = price;
		this.discount = discount;
	}


	void printproductInfo() {
		System.out.println("=====" + this.name + "=====");
		System.out.println("���� : " + this.price + "��");
		if(this.discount != 0) {
			System.out.println("������ : " + this.discount + "��");
		}else {
			System.out.println("������ : �������� ����");
		}
	}
	
}
