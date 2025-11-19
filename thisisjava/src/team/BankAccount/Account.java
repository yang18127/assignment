package team.BankAccount;

public class Account {
    private String accountNumber;
    private String owner;
    private int budget;


    public Account(String accountNumber, String owner, int budget) {
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.budget = budget;
    }

    public void deposit(int money) {
        this.budget += money;
    }

    public void withdraw(int money) {
        this.budget -= money;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwner() {
        return owner;
    }

    public int getBudget() {
        return budget;
    }

}