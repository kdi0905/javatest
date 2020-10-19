package javatest;

public class Player {
	private static int nextId=1; //private를 사용해서 nextId=1을 외부에서 직접 변경할수없다.(정보 은닉)
	private int id; //private를 사용해서 id를 외부에서 직접 변경할수 없다..
	public Player() {
		id= nextId++; //id값은 nextId보다 1크다. //초기값 생성
		
	}
	protected int getId() { //id값을 불러올수있게 해준다.
		return id;
	}
	private void setId(int id) { // id값을 변경할수 있게 한다 하지만외부에서는 변경을 못하고 클래스 내부에서만 바꿀수있다.
		this.id=id; 
	}
}
// 캡슐화 상태로 외부에서 id를 접근하지 못해서 직접 변경하거나 출력할수 없다. 그래서 get명령어와 set명령어를 사용하여 변경, 출력을 할수있다.
//하지만 set명령어도 private로 정보 은닉이 되어 있어 Player클래스 내부에서만 변경이 가능하다.