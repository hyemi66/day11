package ex_ex;

import java.nio.file.spi.FileSystemProvider;
import java.util.Scanner;

class onOff {
	public void on() {
		System.out.println("전원on");
	}
	public void off() {
		System.out.println("전원off");
	}
}
class airr extends onOff {
	public void time() {
		System.out.println("타이머");
	}
	public void smell() {
		System.out.println("냄새제거");
	}
}
class dry extends onOff {
	public void temp() {
		System.out.println("온도조절");
	}
	public void wind() {
		System.out.println("바람세기조절");
	}
}
class nBook extends onOff {
	public void login() {
		System.out.println("로그인");
	}
	public void logout() {
		System.out.println("로그아웃");
	}
}
public class MainClass03 {
	public static void main(String[] args) {
		/*
		 가전제품
		 부모 : 전원 ON/OFF
		 1. 공기청정기 : 냄새제거, 타이머기능
		 2. 드라이기 : 온도조절, 바람세기조절
		 3. 노트북 : 로그인/로그아웃
		*/
		Scanner sc = new Scanner(System.in);
		airr airr = new airr();
		dry dry = new dry();
		nBook nBook = new nBook();
		int num;
		while(true) {
			System.out.println("=== 가전제품 ===");
			System.out.println("1. 공기청정기");
			System.out.println("2. 드라이기");
			System.out.println("3. 노트북");
			System.out.println("4. 종료");
			System.out.print(">>> ");
			num = sc.nextInt();
			if(num==1) {
				System.out.println("=== 공기청정기 ===");
				System.out.println("1. 전원켜기");
				System.out.println("2. 전원끄기");
				System.out.println("3. 냄새제거");
				System.out.println("4. 타이머기능");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { airr.on(); }
				else if(num==2) { airr.off(); }
				else if(num==3) { airr.smell(); }
				else if(num==4) { airr.time(); }
			}
			else if(num==2) {
				System.out.println("=== 드라이기 ===");
				System.out.println("1. 전원켜기");
				System.out.println("2. 전원끄기");
				System.out.println("3. 온도조절");
				System.out.println("4. 바람세기조절");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { dry.on(); }
				else if(num==2) { dry.off(); }
				else if(num==3) { dry.temp(); }
				else if(num==4) { dry.wind(); }
			}
			else if(num==3) {
				System.out.println("=== 노트북 ===");
				System.out.println("1. 전원켜기");
				System.out.println("2. 전원끄기");
				System.out.println("3. 로그인");
				System.out.println("4. 로그아웃");
				System.out.print(">>> ");
				num = sc.nextInt();
				if(num==1) { nBook.on(); }
				else if(num==2) { nBook.off(); }
				else if(num==3) { nBook.login(); }
				else if(num==4) { nBook.logout(); }
			}
			else if(num==4) { System.out.println("종료"); break; }
			else { System.out.println("다시선택"); }
		}
	}
}
