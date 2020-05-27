package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * 날짜 : 2020/05/21
 * 이름 : 김철학
 * 내용 : 문자 입출력 스트림 실습하기 교재 p1032
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




