package javatest;

public class OOPTest {
	public static void main(String[] args) {
		Sub sub = new Sub("admin", 30); //sub메서드에 이름과 나이를 넣는다.
		
	}
}

class Super{ //Super 부모 클래스
	String name;
	int age;
	Super(){}
	Super(String str, int val){
		name=str;
		age=val;
	}
}

class Sub extends Super{ //Sub 자식 클래스 
	Sub(String str, int val){
		if(name.equals("")) { //name의 값이 없으면
			name="guest"; // guest를 이름에 추가
		}
		if(age<1|| age>200) { 	// 1살 미만 또는 200살 초과면
			age=0;  			// 나이는 0;
		}
		
		System.out.println("이름:"+name+"/나이:"+age);// 이름과 나이를 출력
	}
}
//결과물 exception in thread "main" java.lang.NullPointerException
/*
 * sub클래스의 sub메서드에 admin과 30의 값을 넣지만 sub의 조건에는 if문이랑 출력이 있다
 *  부모 클래스인 super에서  name 과 age의 변수를 상속하지만 name과 age에 값을 넣어주는 Super메서드는 실행이 되지않아 
 *  초기값은 name=null, age=0으로 값이 들어간다. 객체와 객체, 문자열끼리 비교할때는 equals의 명렁어를 사용해야하지만
 *  null은 객체가 아니기 때문에 비교할때 equals명령어를 사용하면 안되고 ==이라는 명령어를 사용해야 한다.
 */
