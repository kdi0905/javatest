/*package javatest;

public class PolyTest {
	public static void main(String[] args) {
		Parent parent=new Parent(); 			// parent라는 객체를 생성한다.
		Child child=new Child();	 			// child라는 객체를 생성한다.
		parent=child; 							// parent라는 객체에 child라는 객체를 넣는다.
		child=(Child)parent;					// parent라는 객체를 강제로 child객체로 형변환 시켜서  child객체에 넣는다
		parent.subMethod(); //오류 발생 			// 부모 클래스는 자식클래스에 있는 메서드를 사용할수 없다.
		child.superMethod();
		System.out.println(parent.a);//오류발생   	//Parent클래스에 a의 값이 있지만 private로 정보은닉이 되어있어 사용이 불가능하다.
		System.out.println(parent.b);    
		System.out.println(parent.c);
		System.out.println(parent.x);//오류발생 	// 부모클래스는 자식클래스에 있는 값을 사용할수 없다.
		System.out.println(parent.y);//오류발생	// 부모클래스는 자식클래스에 있는 값을 사용할수 없다.
		System.out.println(parent.z);//오류발생	// 부모클래스는 자식클래스에 있는 값을 사용할수 없다.
		System.out.println(child.a);//오류발생 	//자식클래스인 child클래스는 부모클래스인 Parent클래스를 사용할 수있지만  a의 값이  private로 정보은닉이 되어있어 사용이 불가능하다.
		System.out.println(child.b);
		System.out.println(child.c);
		System.out.println(child.x);//오류발생		//Child클래스에 있는 x의 값이 잇지만 private로 정보은닉이 되어있어 사용이 불가능하다.
		System.out.println(child.y);
		System.out.println(child.z);
		
	}
}
class Parent{
	private int a=1;
	protected int b=2;
	public int c=3;
	public void superMethod() {
		System.out.println("superMethod");
	}
}
class Child  extends Parent{
	private int x=4;
	protected int y=5;
	public int z=6;
	public void subMethod() {
		System.out.println("subMethod");
	}
}
*/