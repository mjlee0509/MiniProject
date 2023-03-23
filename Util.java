package miniProject;

import java.util.Scanner;

public class Util {
	
	static Scanner sc = new Scanner(System.in);
	
	public int numberCheck() {
		int result;
		while (true) {
			if (sc.hasNextInt()) {
				result = sc.nextInt();
				break;
			} else {
				System.out.print("\u001B[31m" + "0 또는 1로 응답하세요" + "\u001B[30m" +  " >>> ");
				sc.next();
			}
		}
		return result;
	}
	
//	System.out.print(" - ");
//	try {
//		Thread.sleep(500); //0.05초 대기
//	} catch (InterruptedException e) {
//		e.printStackTrace();
//	}
//	System.out.print(" - ");

}
