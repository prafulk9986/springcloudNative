package com.pack.foundry.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private int custId;
	private int accNo;
	private String firstName;
	private String lastName;
	private int balance;
	boolean blacklisted;

	public Customer() {
	}

	public int getCustId() {
		return custId;
	}

	public void setCustId(int custId) {
		this.custId = custId;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public boolean isBlacklisted() {
		return blacklisted;
	}

	public void setBlacklisted(boolean blacklisted) {
		this.blacklisted = blacklisted;
	}

	@Override
	public String toString() {
		return "Account [custId=" + custId + ", accNo=" + accNo + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", balance=" + balance + ", blacklisted=" + blacklisted + "]";
	}
}
