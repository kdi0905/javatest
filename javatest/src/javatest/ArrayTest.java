package javatest;

public class ArrayTest {
	public static void main(String[] args) {
		int ar[][]=new int[3][]; // ar이라는 행,열이있는 2중배열에  행이 3의 크기를 가진 배열을 생성한다.
		int value = 0; // value 의 값은 0으로 초기화
		ar[0]=new int[2]; //ar의 0번째 행에 2개의 열을 생성한다.
		ar[1]=new int[3]; //ar의 1번째 행에 3개의 열을 생성한다.
		ar[2]=new int[4]; //ar의 2번째 행에 4개의 열을 생성한다.
		for(int out=0; out<ar.length; out++) { // out(행)은 0부터 시작하고 ar배열의 행 크기만큼 반복한다. //행
			for(int in=0; in<ar[out].length; in++) { // in(열)은 0부터 시작하고 ar배열 행의 열 크기만큼 실행한다. //열
				ar[out][in]=++value; //2중 배열문에 1을 더한 value값을 넣는다  // ar[0,0]=1, ar[0,1]=2 , ar[1,0]=3, ... 
			}
		}
		try {
			for(int out=0; out<ar.length; out++) { // out(행)은 0부터 시작하고 ar배열의 행 크기만큼 반복한다.
				for(int in=0; in<ar.length; in++) { //in(열)은 0부터 시작하고 ar배열의 행 크기만큼 반복한다.
					System.out.println(ar[out][in]); // 출력
				}
			}
		}catch(ArrayIndexOutOfBoundsException e) { //배열에 오류가 발생하면 실행
			System.out.println("ArrayIndexOutOfBoundsExcepion 발생");
		}
	}
	
}
// 결과값에 오류가 발생한이유 : in(열)이 ar배열의 행(3개)만큼 반복하여 출력하지만 ar의 0번째 행에 2개의 열만 있고 3번째의 열은 없어 오류가 발생한다.
//결과물
//1
//2
//ArrayIndexOutOfBoundsExcepion 발생