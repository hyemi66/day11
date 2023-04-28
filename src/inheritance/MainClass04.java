package inheritance;
class A04 {
	public A04() { System.out.println("부모클래스"); }
}
class B04 extends A04 {
	public B04() { System.out.println("자식클래스"); }
}
public class MainClass04 {
	public static void main(String[] args) {
		// 상속받은 클래스(부모클래스) 먼저 생성자 실행
		B04 b = new B04();
	}
}
