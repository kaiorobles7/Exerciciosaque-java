package entities;

import exception.DomainException;

public class Account {

	private Integer number;
	private String holder;
	private Double balance;
	private Double withdrawLimit;
	public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
		this.withdrawLimit = withdrawLimit;
	}
	public Integer getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}

	public Double getBalance() {
		return balance;
	}
	public void setBalance(Double balance) {
		this.balance = balance;
	}
	public Double getWithdrawLimit() {
		return withdrawLimit;
	}
public void deposit(double amount) {
	balance+=amount;
	}
public void withdraw(double amount) {
	if(amount > withdrawLimit) {
		throw new DomainException("Withdraw error: The amount exceeds withdraw limit");
	}
	else if(amount > balance) {
		throw new DomainException("Withdraw error: Not enough balance");
	}
	else {
		balance -= amount;
	}

 }
}
