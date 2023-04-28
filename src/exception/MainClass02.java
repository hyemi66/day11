package exception;

public class MainClass02 {
	public static void main(String[] args) {
		int num = 0;
		while(true) {
			try {
				System.out.println("실행");
				System.out.println(10/num);
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("0입력금지");
			}
		}
	}
}
