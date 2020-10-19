package javatest;

import java.io.*;

public class IOTest {
static String fileName="test.txt";// 파일(fileName)의 이름은 "test.txt"
static FileInputStream fis=null;  // FileInputStream 파일 입출력 을 fis라고 한다.
public static void main(String[] args) {
	try {
		fis=new FileInputStream(fileName);  //fileName("test.txt")파일 입출력(FileInputStream)을 fis에 넣는다.
		do {
			System.out.print((char)fis.read()); //fix파일을 읽어와서 출력
		}while(fis.read()!=-1);  //파일끝에 도달할때까지 반복 (fis.read():파일을 읽고 다음으로 넘긴다.)
	}catch(FileNotFoundException e) { //파일을 찾을수 없으면 fileNotFoundException 발생 출력 
		System.out.println("FileNotFoundException 발생");
	}catch(IOException e) {  
		System.out.println("IOException발생"); // 범위 오류발생하면 IOException발생 출력
	}finally { //마지막으로 실행
		try {
			fis.close(); //fis를 닫아준다.
			
		}catch(IOException e) { //오류가나면 file.close():예외발생을 출력
			System.out.println("file.close():예외발생");
		}
	}
}
}

/*
 * FileInputStream 은 int형의 데이터를 반환한다. 
 * fis를 읽고 출력을 한다음 다음으로 넘긴다 
 * while에서 읽고 다음으로 넘긴다.
 * 그래서 fis를 읽고 출력하고 다음으로넘기고 while문에서 읽고 다음로넘기고를 반복해서 0,2,4번째 문자를 출력을한다.
 * 결과값 : GOE
 * */
