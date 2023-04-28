package ex_ex;

import java.util.Scanner;

class cCar {
	public void wheel() {
		System.out.println("바퀴");
	}
	public void handle() {
		System.out.println("핸들");
	}
}
class fCar extends cCar {
	public void free() {
		System.out.println("자율주행모드");
	}
}
class wCar extends cCar {
	public void water() {
		System.out.println("잠수모드");
	}
}
public class MainClass02 {
	public static void main(String[] args) {
		/*
		 자동차 -> 기본적으로 바퀴와 핸들을 가짐, 이동 기능
		 자율주행자동차 -> 자율 주행 모드 추가
		 수중자동차 -> 잠수 모드 추가 
		*/
		Scanner sc = new Scanner(System.in);
		int num;
		fCar fCar = new fCar();
		wCar wCar = new wCar();
		while(true) {
			System.out.println("=== 자동차종류 ===");
			System.out.println("1. 자율주행자동차");
			System.out.println("2. 수중자동차");
			System.out.println("3. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			if(num==1) {
				System.out.println("=== 자율주행자동차 ===");
				System.out.println("1. 바퀴");
				System.out.println("2. 핸들");
				System.out.println("3. 자율주행모드");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { fCar.wheel(); }
				else if(num==2) { fCar.handle(); }
				else if(num==3) { fCar.free(); }
			}
			else if(num==2) {
				System.out.println("=== 수중자동차 ===");
				System.out.println("1. 바퀴");
				System.out.println("2. 핸들");
				System.out.println("3. 잠수모드");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { wCar.wheel(); }
				else if(num==2) { wCar.handle(); }
				else if(num==3) { wCar.water(); }
			}
			else if(num==3) { System.out.println("종료"); break; }
			else { System.out.println("다시선택"); }
		}
	}
}
