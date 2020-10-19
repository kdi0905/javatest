package javatest;

public class ReferenceTest {
 public static void main(String[] args) {
	 ReferenceTest t= new ReferenceTest(); //참조 테스트
	 int a=20; //변수값
	 int b[]= {100,200,300}; // 배열값
	 t.change(a,b); //change메서드를 실행한다.
	 t.display(a,b); //display메서드를 실행하여 출력한다.
 }
 void change(int a, int b[]) { // a의 값과 배열 b값을 받아온다.
	 a+=10;  //기존에 있던 a값에 10을 더한다.
	 b[1] +=10; //기존에 있던 1번째 배열값에 10을 더한다.
 }
 void display(int a,int b[]) { //a의 값과 배열 b의 값을 받아온다.
	 System.out.print(a+"/"+b[1]); // a와 b[1]을 출력한다.
 }
}
// 각각 a와 배열b라는 공간을 생성한다. 
// change의 메서드에 a와 배열 b를 가져와서 각각 10을 더한다.
// change의 메서드에 a라는 공간을 만들고 10을 더하지만 리턴(참조)을하지 않아  메서드안에서만 10이 더해진다.
// change의 메서드에 b라는 공간을 만들고  1번째를 참조하는 공간 배열b에 10을 더하면  참조하는 값이 바뀌면서 다른 메서드에서 사용할때도  n번째 값을 참조하는 공간배열b를 가져다 쓴다.
// 그래서 배열은 n번째 값을 참조하므로 10이 더해진 상태로 출력이 된다.
// 출력 결과 : 20/210
