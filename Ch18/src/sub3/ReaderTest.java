package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * ��¥ : 2020/05/21
 * �̸� : ��ö��
 * ���� : ���� ����� ��Ʈ�� �ǽ��ϱ� ���� p1032
 */
public class ReaderTest {
	public static void main(String[] args) {
		
		String file = "C:\\Users\\bigdata\\Desktop\\hello.txt";
		
		
		try {
			FileInputStream fis = new FileInputStream(file);
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
			
			int value = 0;
			
			while(true) {
				value = isr.read();
				
				if(value == -1) {
					break;
				}
				
				char c = (char) value;
				System.out.print(c);
			}
			
			isr.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}




