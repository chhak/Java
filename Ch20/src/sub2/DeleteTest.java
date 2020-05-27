package sub2;
/**
 * 날짜 : 2020/05/26
 * 이름 : 김철학
 * 내용 : JDBC Delete 실습하기
 */
public class DeleteTest {
	public static void main(String[] args) throws Exception {
		// DB정보
		String host = "jdbc:mysql://192.168.44.7:3306/chhak";
		String user = "chhak";
		String pass = "1234";
		
		// 1단계 - JDBC드라이버 로드
		// 2단계 - 데이터베이스 접속
		// 3단계 - SQL실행객체 생성
		// 4단계 - SQL실행
		String sql = "DELETE FROM `USER1` WHERE `uid`='J101'";
		
		// 5단계 - 결과셋처리(SELECT일 경우)
		// 6단계 - 데이터베이스 종료
	}
}
