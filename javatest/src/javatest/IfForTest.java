package javatest;

public class IfForTest {
static int[] arNum= {7,9,1,4,5};

public static void main(String[] args) {
	int out,in; // 변수 선언
	IfForTest t= new IfForTest(); // 객체 생성
	for(out=arNum.length-1;out>0;out--){ // arNum배열의 개수 만큼 반복
		for(in=0; in<out;in++) { // 0부터 배열 개수만큼 반복
			if(arNum[in]>arNum[in+1]) { // 배열 1번째 값이 배열 2번째 값보다 크면 스왑
				t.swap(in,in+1);
			}
		}
	}
	t.display(); // 출력
}
void swap(int one,int two) { // 첫번째 값과 두 번째 값을 변경
	int temp=arNum[one];
	arNum[one]=arNum[two];
	arNum[two]=temp;
}
void display() {  //출력
	for(int index=0;index<arNum.length;index++) { //배열의 개수 만큼 반복
		System.out.print(arNum[index]);
	}
}
}
//n번째 배열의 값과 n+1번째 배열의 값을 비교해서 n번째 값이 n+1값보다 크면 바꿔주는 코드
//출력 :14579