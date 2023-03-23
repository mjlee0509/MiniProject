package miniProject;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		TestService testService = TestService.getInstance();
		MbtiService mbtiService = MbtiService.getInstance();
		boolean login = false;

		while (true) {
			System.out.println("=================||반응형 웹기반 Back-end 개발자를 위한 심리테스트||=================");
			if (!login) {
				System.out.println("\t1.회원가입\t\t\t2.로그인\t\t\t0.종료\t");
			} else {
				System.out.println("\t1.테스트 하러가기   2.마이페이지   3.테스트 내역   4.로그아웃   0.종료\t");
			}
			System.out.println("============================================================================");

			System.out.print("메뉴를 선택하세요 >>> ");
			int menu = sc.nextInt();

			if (menu == 1) {
				if (!login) {
					testService.save();
				} else {
					mbtiService.mbtiSave();

				}
			} else if (menu == 2) {
				if (!login) {
					login = testService.loginCheck();
				} else {
					testService.findById();

				}

			} else if (menu == 3 && login) {
				mbtiService.findAll();

			} else if (menu == 4 && login) {
				testService.logout();
				login = false;

			} else if (menu == 0) {
				break;
			} else {
				System.out.println("다시 입력하세요");
			}
			System.out.println();

		}
		System.out.println("프로그램을 종료합니다.");

	}

}
