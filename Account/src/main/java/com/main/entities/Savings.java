package com.main.entities;
import java.util.Date;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Savings Account")
public class Savings extends Account {

	private double interest;

	public Savings() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Savings(String accountCode, Date creationDate, double balance, Client client, double interest) {
		super(accountCode, creationDate, balance, client);
		this.interest = interest;
	}

	public double getInterest() {
		return interest;
	}

	public void setInterest(double interest) {
		this.interest = interest;
	}




}