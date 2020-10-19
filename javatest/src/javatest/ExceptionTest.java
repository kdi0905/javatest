package javatest;

public class ExceptionTest {
	static String result="1"; //result의 값은 1이다.
	public static void main(String[] args) {
		method(0); //int x가 0인 method 메서드를 실행
		System.out.println(result); // result를 출력
	}
	public static void method(int x) {
		try {
			x/=x; //초기값 x= 0 // 0/0
		}catch(ArithmeticException e) {//산수예외 0으로 나눠서 나오는 에러 
			result +="2"; // 12
		}catch(Exception e) { //exception(예외)오류가 나면 3출력
			result+="3"; 
		}finally { //try결과와 상관없이 마지막으로 실행
			result += "4"; // //124
		}
		
		result +="5"; //1245 
	}
}
//결과물 1245
//처음 문자 result의 값은 1이다.
/*
 *  method메서드를 실행할때 x=0이다.
 *  try문에서 x/x 는 0/0이며 오류가 날시 catch문을 실행을 한다.
 *  ArithmeticException 오류는 산수예외 0으로 나눠서 나오는 에러이고 이 에러가 발생했을시 result에 2가 추가가 된다.
 *   예외처리(exception) 오류가 발생시 3이 추가가 되지만 예외처리 오류가 발생하지 않아 추가가 되지 않는다.
 *   finally는 try결과와 상관없이 무조건 실행이 된다. 그래서 result에 4가 추가가 된다.
 *   마지막으로 try문에 들어가지 않은 result+="5"는 실행이 된다. 
 *   추가 된걸 확인해보면 처음 result값인 1
 *   ArithmeticException오류가 발생해 2가 추가
 *   finally로 무조건 실행하는 4가 추가
 *   마지막으로 try문에 들어가 있지 않은 5가 추가가 되서 결과물은 1245가 나온다. 
 */
