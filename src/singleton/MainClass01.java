package singleton;
/*
 싱글톤
 - 하나의 객체를 만들어 공유해서 사용하는 것 
*/
class A01 {
	int num;
	static int cnt;
	public A01() {
		cnt++;
		System.out.println(cnt+"객체 생성");
	}
}
// 세개의 공간 따로 만들기
public class MainClass01 {
	public static void main(String[] args) {
		A01 a01 = new A01();
		A01 a02 = new A01();
		A01 a03 = new A01();
		a01.num = 100;
		a02.num = 200;
		a03.num = 300;
		System.out.println("01 : " + a01.num + " : " + a01);
		System.out.println("02 : " + a02.num + " : " + a02);
		System.out.println("03 : " + a03.num + " : " + a03);
	}
}
