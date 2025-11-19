package team.BankAccount;

import java.util.*;

public class BankApplication {
    private static Account[] accountList = new Account[100];

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("-------------------------------------");
            System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
            System.out.println("-------------------------------------");
            System.out.print("선택> ");
            int select = Integer.parseInt(scanner.nextLine());

            if (select == 1) {
                createAccount();
            } else if (select == 2) {
                showAccountList();
            } else if (select == 3) {
                deposit();
            } else if (select == 4) {
                withdraw();
            } else if (select == 5) {
                System.out.println("프로그램 종료");
                break;
            }
        }
    }

    private static void createAccount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------");
        System.out.println("계좌생성");
        System.out.println("-------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();
        System.out.print("계좌주: ");
        String owner = scanner.nextLine();
        System.out.print("초기입금액: ");
        int budget = Integer.parseInt(scanner.nextLine());
        Account account = new Account(accountNumber, owner, budget);
        for (int i = 0; i < accountList.length; i++) {
            if (accountList[i] == null) {
                accountList[i] = account;
                break;
            }
        }
        System.out.println("결과: 계좌가 생성되었습니다.");
    }

    private static void showAccountList() {
        System.out.println("-------");
        System.out.println("계좌목록");
        System.out.println("-------");
        for (Account account : accountList) {
            if (account == null) {
                break;
            }
            System.out.println(account.getAccountNumber() + "    " + account.getOwner() + "    " + account.getBudget());
        }
    }

    private static void deposit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------");
        System.out.println("예금");
        System.out.println("-------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();
        Account account = findAccount(accountNumber);
        System.out.print("예금액: ");
        int money = Integer.parseInt(scanner.nextLine());
        account.deposit(money);

    }

    private static void withdraw() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("-------");
        System.out.println("출금");
        System.out.println("-------");
        System.out.print("계좌번호: ");
        String accountNumber = scanner.nextLine();
        Account account = findAccount(accountNumber);
        System.out.print("출금액: ");
        int money = Integer.parseInt(scanner.nextLine());
        account.withdraw(money);
    }

    private static Account findAccount(String accountNumber) {
        Account account = null;
        for (int i = 0; i < accountList.length; i++ ) {
                if (accountList[i].getAccountNumber().equals(accountNumber)) {
                    account = accountList[i];
                    break;
                }
        }
        return account;
    }
}