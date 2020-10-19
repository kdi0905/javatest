package javatest;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionTest {
	public static void main(String[] args) {
		ArrayList<Singer> list = new ArrayList(); // Singer클래스 배열을 생성하여 list에 값을 넣는다
		Singer singer; 
		singer = new Singer(); // Singer객체 생성
		
		singer.setName("admin"); // 캡슐화를 사용한 Singer클래스의 name에 admin의 값을 넣는다.
		singer.setAge(30);// 캡슐화를 사용한 Singer클래스의 age에 30의 값을 넣는다.
		list.add(singer); // singer객체의 값을 list에 추가한다.
		singer.setName("guest"); // 캡슐화를 사용한 Singer클래스의 name에 guest의 값을 넣는다.
		singer.setAge(32);// 캡슐화를 사용한 Singer클래스의 age에 32의 값을 넣는다.
		list.add(singer); // singer객체의 값을 list에 추가한다. 
		Iterator i = list.iterator(); 
		//Iterator는 반복하다라는 뜻이다. //무엇인가 반복할때 사용
		while (i.hasNext()) { // 다음에 읽을정보가 있을때까지 반복
			System.out.println((((Singer) i.next()).getName())); //이름을 출력
		}
	}
}
class Singer{ //Singer 클래스
	private String name; // name을 캡슐화(정보은닉)
	private int age; // age를 캡슐화(정보은닉)
	public String getName() { //getName 불러오기
		return name;
	}
	public void setName(String name) { // setName 값넣기
		this.name=name;
	}
	public int getAge() { //getAge 불러오기
		return age;
	}
	public void setAge(int age) { //setAge 값넣기
		this.age=age;
	}
}
//list는 singer객체를 출력을한다.
//singer객체는 1개이고 처음입력한 name,age는 나중에 입력한 name과 age가 덮어쓰기 때문에 singer객체 안에는 나중에 입력한 name과 age의 값이 넣어진다.
//list에 추가된 값들은 2개이고 모두 singer객체를 참조하므로 나중에 입력된 name의 값이 2번출력하게된다.
//결과물
//guest
//guest