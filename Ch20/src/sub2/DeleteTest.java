package sub2;
/**
 * ��¥ : 2020/05/26
 * �̸� : ��ö��
 * ���� : JDBC Delete �ǽ��ϱ�
 */
public class DeleteTest {
	public static void main(String[] args) throws Exception {
		// DB����
		String host = "jdbc:mysql://192.168.44.7:3306/chhak";
		String user = "chhak";
		String pass = "1234";
		
		// 1�ܰ� - JDBC����̹� �ε�
		// 2�ܰ� - �����ͺ��̽� ����
		// 3�ܰ� - SQL���ఴü ����
		// 4�ܰ� - SQL����
		String sql = "DELETE FROM `USER1` WHERE `uid`='J101'";
		
		// 5�ܰ� - �����ó��(SELECT�� ���)
		// 6�ܰ� - �����ͺ��̽� ����
	}
}
