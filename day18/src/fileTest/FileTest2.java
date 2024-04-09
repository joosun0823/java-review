package fileTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {
		//workspace폴더에 test18.txt파일을 생성하고
		//abc라는 문자를 넣기
		
		File f = new File("../test18.txt");
//		try {
//			f.createNewFile();
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
		
		 try {
			FileOutputStream fos = new FileOutputStream(f);
			 fos.write('a');
			 fos.write('\n');			 
			 fos.write('b');
			 fos.write('\n');
			 fos.write('c');
			 fos.close();
			 System.out.println("된건가요?");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
