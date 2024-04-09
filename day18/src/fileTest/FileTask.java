package fileTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTask {
   public static void main(String[] args) {
      //현재 경로에 animal.txt 파일을 생성한다
	   //File객체로 생성
      //파일 내용은 사슴, 고라니, 너구리, 토끼 네가지 동물을 작성한다
	   // 배열로 생성
      //각 동물은 줄바꿈 후 다음 동물을 넣도록 한다
      //* 배열 이용할것, 반복문 사용할 것
      
	   try {
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("animal.txt")));
		   
		   String[] animal = {"사슴", "고라니", "너구리", "토끼"};
		   for(int i = 0; i < animal.length; i++) {
			   bw.write(animal[i]);
			   bw.newLine();
		   }
		   bw.close();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
	   try {
		BufferedReader br = new BufferedReader(new FileReader("animal.txt"));
		   String line = null;
		   while((line = br.readLine()) != null) {
			   System.out.println(line);
		   }
		   br.close();
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	   
	   
   }
}