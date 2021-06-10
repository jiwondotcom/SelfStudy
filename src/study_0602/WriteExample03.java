package study_0602;

import java.io.FileOutputStream;
import java.io.OutputStream;

public class WriteExample03 {
	public static void main(String[] args) throws Exception {
		
		OutputStream os = new FileOutputStream("C:/Temp/test3.db");
		
		byte[] array = { 10, 20, 30, 40, 50 };
		
		os.write(array, 1, 3); // 배열의 1번 인덱스부터 3개를 출력
		
		os.flush();  
		os.close();

	}

}
