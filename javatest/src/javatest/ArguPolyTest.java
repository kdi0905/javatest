package javatest;

public class ArguPolyTest {
	public static void main(String[] args) {
		Person[] persons = new Person[2];//배열 Persons에 Person클래스 공간 2개를 생성한다.
		persons[0]=new Dancer(); //첫번째 공간에는 dancer클래스의 공간을 생성 [다형성]
		persons[1]=new Actor();// 두번째 공간에는 Actor클래스의 공간을 생성[다형성]
		for(int i=0; i<persons.length;i++) { //persons공간의 크기만큼 반복
			persons[i].play();    //person클래스의 play메서드 실행
			persons[i].display(); //person클래스의 display메서드 실행
		}
	}
}

abstract class Person{ //부모클래스
	String str;
	abstract void play(); //추상
	void display() {
		System.out.println(str); //출력
	}
}
class Dancer extends Person{//[상속] //자식클래스
	@Override //오버라이딩
	protected void play() { //부모클래스의 play를 오버라이딩해서 수정
		str="춤춘다";
	}
}
class Actor extends Person{//[상속]
	@Override //오버라이딩
	protected void play() { //부모클래스의 play를 오버라이딩해서 수정
		str="연기하다";
	}
}
//배열의 persons[0]에는 dancer클래스가 persons[1]에는 Actor 클래스가 들어가있다.[다형성]
//dancer클래스에는 부모에게 상속받은 play를 오버라이딩해서 str를 "춤춘다" 로 
//Actor 클래스에는 부모에게 상속받은 play를 오버라이딩해서 str를 "연기하다"로 값을 넣는다.
//배열의 크기만큼 반복 실행을 해서 
//결과물은 춤춘다 연기하다 가 출력된다.