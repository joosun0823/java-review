package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTest4 {
   public static void main(String[] args) {
      try {
         BufferedWriter bw = new BufferedWriter(new FileWriter(new File("test3.txt")));
         bw.write("테스트중입니다");
         // 줄바꿈을 하고 싶으면 1) \n을 사용한다 2) newLine()를 사용한다
         bw.newLine();
         bw.write("오늘은 4월 3일입니다");
//      bw.flush(); //버퍼를 비운다(버퍼에 있는 데이터를 전송한다)
         bw.close();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

      try {
         BufferedReader br = new BufferedReader(new FileReader("test3.txt"));
//         String line = null;
//         while((line = br.readLine()) != null ) {
//            System.out.println(line);
//         System.out.println((char)br.read());
         System.out.println(br.readLine());
         System.out.println(br.readLine());
         System.out.println(br.readLine());
//      }
         System.out.println("출력 완료");
      } catch (FileNotFoundException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }

   }
}
