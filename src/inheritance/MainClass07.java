package inheritance;
class A07 {
	public void test() {
		System.out.println("부모 test 실행");
	}
}
class B07 extends A07 {
	public void bbb() {
		System.out.println("자식 bbb 실행");
		super.test(); // 부모꺼
		this.test(); // 자기 자신꺼
	}
	public void test() {
		System.out.println("자식 test 실행");
	}
}
public class MainClass07 {
	public static void main(String[] args) {
		B07 b = new B07();
		b.bbb();
		//b.test();
	}
}
