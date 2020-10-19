package javatest;

public class OperatorTest {
	private static int result=0; //result의 값은 0이고 정보은닉이 되어있다.
	private static boolean flag=false; // flag의 값은 false이고 정보은닉이 되어있다.
	public static void main(String[] args) {
		setResult(10); // setResult의 값을 10을 넣는다.
		display();  // display메서드를 실행한다.
	}
	public static void setResult(int x) { //result에 값을 넣어준다.
		flag= method1(x) || method2();  // method1(x)이 참이면 flag에 에 값을 넣어주고 거짓이면 method2의 값을 넣어준다.
	}
	public static boolean method1(int x) { 
		boolean temp=false; //temp는 false이다.
		if(x>0) { //x가 0보다 크면 
			result=x; //x의 값을 result에 넣는다
			temp=true; //temp를 true를 한다.
		}
		return temp; //temp를 리턴한다.
		
	}
	public static boolean method2() {
		result = result*10; //result값을 10곱한후 result에 넣어준다.
		return true; //method2에 true를 리턴한다.
	}
	public static void display() {
		System.out.print(result+" "); //result의 값을 출력 //10
		System.out.println(flag); // flag를 출력 //true
	}
}
//결과값:10 true 
//method1(10)을 실행하면 x=10이 되고 x가 0보다 커서 x의 값을 result에 넣고 true를 리턴한다.
//method1(10)의 값이 true를 리턴해서 method2()가 실행이 되지 않고 flag에 ture가 넣어진다.
//그래서 methoe1은 result에 10 flag에 true 가 넣어져 결과물이 10 true가 나오게 된다.