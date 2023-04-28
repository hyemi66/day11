package ex_ex;

import java.util.Scanner;

class funC {
	public void excel() {
		System.out.println("엑셀");
	}
	public void brake() {
		System.out.println("브레이크");
	}
	public void wiper() {
		System.out.println("와이퍼");
	}
	public void light() {
		System.out.println("라이트");
	}
}
class ship extends funC {
	public void d01() {
		System.out.println("닻");
	}
	public void d02() {
		System.out.println("돛");
	}
}
class car extends funC {
	public void eg() {
		System.out.println("엔진");
	}
	public void sit() {
		System.out.println("좌석열선");
	}
}
class air extends funC {
	public void put() {
		System.out.println("바퀴수납");
	}
}
class sub extends funC {
	public void scOpen() {
		System.out.println("스크린오픈");
	}
	public void scClose() {
		System.out.println("스크린닫기");
	}
}
public class MainClass01 {
	public static void main(String[] args) {
		/*
		  탈 것의 공통기능
		  1. 엑셀
		  2. 브레이크
		  3. 와이퍼
		  4. 라이트
		  
		  배 -> 닻, 돛 기능 추가
		  자동차 -> 엔진 모드, 좌석 열선 기능 추가
		  비행기 -> 랜딩 기어(바퀴 수납) 기능 추가
		  지하철 -> 스크린도어(열고 닫기) 연동 기능 추가
		*/
		Scanner sc = new Scanner(System.in);
		ship ship = new ship();
		car car = new car();
		air air = new air();
		sub sub = new sub();
		int num;
		while(true) {
			System.out.println("=== 탈 것 ===");
			System.out.println("1. 배");
			System.out.println("2. 자동차");
			System.out.println("3. 비행기");
			System.out.println("4. 지하철");
			System.out.println("5. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			if(num==1) {
				System.out.println("=== 배 ===");
				System.out.println("1. 엑셀");
				System.out.println("2. 브레이크");
				System.out.println("3. 와이퍼");
				System.out.println("4. 라이트");
				System.out.println("5. 닻");
				System.out.println("6. 돛");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { ship.excel(); }
				else if(num==2) { ship.brake(); }
				else if(num==3) { ship.wiper(); }
				else if(num==4) { ship.light(); }
				else if(num==5) { ship.d01(); }
				else if(num==6) { ship.d02(); }
			}
			else if(num==2) {
				System.out.println("=== 자동차 ===");
				System.out.println("1. 엑셀");
				System.out.println("2. 브레이크");
				System.out.println("3. 와이퍼");
				System.out.println("4. 라이트");
				System.out.println("5. 엔진모드");
				System.out.println("6. 좌석열선모드");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { car.excel(); }
				else if(num==2) { car.brake(); }
				else if(num==3) { car.wiper(); }
				else if(num==4) { car.light(); }
				else if(num==5) { car.eg(); }
				else if(num==6) { car.sit(); }
			}
			else if(num==3) {
				System.out.println("=== 비행기 ===");
				System.out.println("1. 엑셀");
				System.out.println("2. 브레이크");
				System.out.println("3. 와이퍼");
				System.out.println("4. 라이트");
				System.out.println("5. 바퀴수납");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { air.excel(); }
				else if(num==2) { air.brake(); }
				else if(num==3) { air.wiper(); }
				else if(num==4) { air.light(); }
				else if(num==5) { air.put(); }
			}
			else if(num==4) {
				System.out.println("=== 지하철 ===");
				System.out.println("1. 엑셀");
				System.out.println("2. 브레이크");
				System.out.println("3. 와이퍼");
				System.out.println("4. 라이트");
				System.out.println("5. 스크린열기");
				System.out.println("6. 스크린닫기");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { sub.excel(); }
				else if(num==2) { sub.brake(); }
				else if(num==3) { sub.wiper(); }
				else if(num==4) { sub.light(); }
				else if(num==5) { sub.scOpen(); }
				else if(num==6) { sub.scClose(); }
			}
			else if(num==5) { System.out.println("종료"); break; }
			else { System.out.println("다시선택"); }
		}
	}
}
