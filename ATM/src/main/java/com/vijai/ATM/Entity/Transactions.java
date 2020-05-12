package com.vijai.ATM.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Account_Transactions")
public class Transactions {
    
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	
	@Column(name="Transaction_Amount")
	private long transactionAmount;
	
	@Column(name="Transaction_Type")
	private String transactionType;
	
	@ManyToOne
	@JoinColumn(name="Tran_Act_Id",nullable=false)
	private Account account;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getTransactionAmount() {
		return transactionAmount;
	}

	public void setTransactionAmount(long transactionAmount) {
		this.transactionAmount = transactionAmount;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Transactions [id=" + id + ", transactionAmount=" + transactionAmount + ", transactionType="
				+ transactionType + ", account=" + account + "]";
	}
	
}
