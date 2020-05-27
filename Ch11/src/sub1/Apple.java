package sub1;

public class Apple {

	private String country;
	private int price;
	
	// 동적생성을 위해서 디폴트 생성자 필요
	public Apple() {
		this.country = "대한민국";
		this.price = 5000;
	}
	
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void info() {
		System.out.println("원산지 : "+country);
		System.out.println("가 격 : "+price);
	}
	
	@Override
	public String toString() {
		
		System.out.println("원산지 : "+country);
		System.out.println("가 격 : "+price);
		
		return super.toString();
	}
	
	
}
