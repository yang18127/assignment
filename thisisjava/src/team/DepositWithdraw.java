package team;

import java.util.Scanner;

public class DepositWithdraw {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int budget = 0;
		
		while(true) {
			System.out.println("-------------------------");
			System.out.println("1.예금|2.출금|3.잔고|4.종료");
			System.out.println("-------------------------");
		
			System.out.print("선택>");
			String select = scan.nextLine();
			
			if (select.equals("1")) {
				System.out.print("예금액>");
				int deposit = Integer.parseInt(scan.nextLine());
				budget += deposit;
			} else if (select.equals("2")) {
				System.out.print("출금액>");
				int withDraw = Integer.parseInt(scan.nextLine());
				budget -= withDraw;
			} else if (select.equals("3")) {
				System.out.println("잔고>" + budget);
			} else if (select.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}

	}

}
