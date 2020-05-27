package test10;
/*
 * 날짜 : 0000/00/00
 * 이름 : 홍길동
 * 내용 : 인터페이스 연습문제
 */
public class JavaTest10 {
	public static void main(String[] args) {
		Buyer  buyer  = new Customer();
		Seller seller = new Customer();
		
		buyer.buy();
		seller.sell();
	}
}
