package sub1;

public class Apple {

	private String country;
	private int price;
	
	// ���������� ���ؼ� ����Ʈ ������ �ʿ�
	public Apple() {
		this.country = "���ѹα�";
		this.price = 5000;
	}
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void info() {
		System.out.println("������ : "+country);
		System.out.println("�� �� : "+price);
	}
	
	@Override
	public String toString() {
		
		System.out.println("������ : "+country);
		System.out.println("�� �� : "+price);
		
		return super.toString();
	}
	
	
}
