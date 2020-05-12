package com.vijai.ATM.Entity;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private long id;
	
	@Column(name = "User_Name")
	private String userName;
	
   @Column(name = "User_Pin")
	private int userPin;
	
   @OneToMany(cascade = CascadeType.ALL,mappedBy="user")
	private Set<Account> account;

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getUserName() {
	return userName;
}

public void setUserName(String userName) {
	this.userName = userName;
}

public int getUserPin() {
	return userPin;
}

public void setUserPin(int userPin) {
	this.userPin = userPin;
}

public Set<Account> getAccount() {
	return account;
}

public void setAccount(Set<Account> account) {
	this.account = account;
}

@Override
public String toString() {
	return "User [id=" + id + ", userName=" + userName + ", userPin=" + userPin + ", account=" + account + "]";
}


   
	

}
