package ex_ex;

import java.util.Scanner;

class action {
	public void eat() {
		System.out.println("먹음");
	}
	public void sleep() {
		System.out.println("잠");
	}
	public void run() {
		System.out.println("달림");
	}
}
class dog extends action {
	public void bow() {
		System.out.println("짖음");
	}
	public void hit() {
		System.out.println("물기");
	}
}
class cat extends action {
	public void hit() {
		System.out.println("할퀴기");
	}
	public void jump() {
		System.out.println("점프");
	}
}
class rhino extends action {
	public void runInto() {
		System.out.println("들이받음");
	}
}
public class MainClass04 {
	public static void main(String[] args) {
		/*
		 육상동물
		 1. 먹는 행동
		 2. 자는 행동
		 3. 달리는 행동
		 
		 ex
		 개 : 짖기, 물기
		 고양이 : 할퀴기, 점프
		 코뿔소 : 들이받기
		*/
		Scanner sc = new Scanner(System.in);
		dog dog = new dog();
		cat cat = new cat();
		rhino rhino = new rhino();
		int num;
		while(true) {
			System.out.println("=== 동물 ===");
			System.out.println("1. 개");
			System.out.println("2. 고양이");
			System.out.println("3. 코뿔소");
			System.out.println("4. 참여종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			if(num==1) {
				System.out.println("=== 개 ===");
				System.out.println("1.먹기 2.잠 3.달림 4.짖기 5.물기");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { dog.eat(); }
				else if(num==2) { dog.sleep(); }
				else if(num==3) { dog.run(); }
				else if(num==4) { dog.bow(); }
				else if(num==5) { dog.hit(); }
			}
			else if(num==2) {
				System.out.println("=== 고양이 ===");
				System.out.println("1.먹기 2.잠 3.달림 4.할퀴기 5.점프");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { cat.eat(); }
				else if(num==2) { cat.sleep(); }
				else if(num==3) { cat.run(); }
				else if(num==4) { cat.hit(); }
				else if(num==5) { cat.jump(); }
			}
			else if(num==3) {
				System.out.println("=== 코뿔소 ===");
				System.out.println("1.먹기 2.잠 3.달림 4.들이받음");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { rhino.eat(); }
				else if(num==2) { rhino.sleep(); }
				else if(num==3) { rhino.run(); }
				else if(num==4) { rhino.runInto(); }
			}
			else if(num==4) { System.out.println("참여종료"); break; }
			else { System.out.println("다시선택"); }
		}
	}
}
