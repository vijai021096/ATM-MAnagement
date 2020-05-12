package com.vijai.ATM.Entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Account {
   
	@Id
	private long id;
	
   @Column(name = "Acc_Num") 	
	private long accountNumber;
	
   @Column(name = "Acc_Type")
	private String accountType;
	
   @Column(name="Acc_Branch")
	private String accountBranch;
   
   @Column(name="Account_Balance")
   private String accountBalance;
	
   public String getAccountBalance() {
	return accountBalance;
}

public void setAccountBalance(String accountBalance) {
	this.accountBalance = accountBalance;
}

@ManyToOne
	@JoinColumn(name="User_acct_Id",nullable=false)
	private User user;

@OneToMany(cascade = CascadeType.ALL,mappedBy="account")
private Set<Transactions> transactions;

public long getId() {
	return id;
}

public Set<Transactions> getTransactions() {
	return transactions;
}

public void setTransactions(Set<Transactions> transactions) {
	this.transactions = transactions;
}

public void setId(long id) {
	this.id = id;
}

public long getAccountNumber() {
	return accountNumber;
}

public void setAccountNumber(long accountNumber) {
	this.accountNumber = accountNumber;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public String getAccountBranch() {
	return accountBranch;
}

public void setAccountBranch(String accountBranch) {
	this.accountBranch = accountBranch;
}

public User getUser() {
	return user;
}

public void setUser(User user) {
	this.user = user;
}

@Override
public String toString() {
	return "Account [id=" + id + ", accountNumber=" + accountNumber + ", accountType=" + accountType
			+ ", accountBranch=" + accountBranch + ", accountBalance=" + accountBalance + ", user=" + user
			+ ", transactions=" + transactions + "]";
}





 
   
}

