package sub2;

import sub1.Apple;

public class ClassNewInstanceTest {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// �����ε����� ��ü���� 
		Class object = Class.forName("sub1.Apple");
		Apple apple = (Apple) object.newInstance();
				
		apple.info();	
	}
}
