package com.bank;


	import java.util.Date;

	public class Transactions{

	    private String account_number, account_type, id;
	    private Date date;
	    private int amount, balance;

	    public Transactions(String id, String account_number, int balance, String account_type, Date date, int amount){

	        this.id = id;
	        this.account_number = account_number;
	        this.balance = balance;
	        this.account_type = account_type;
	        this.date = date;
	        this.amount = amount;

	    }

	    public String getAccount_number() {
	        return account_number;
	    }

	    public void setAccount_number(String account_number) {
	        this.account_number = account_number;
	    }

	    public String getAccount_type() {
	        return account_type;
	    }

	    public void setAccount_type(String account_type) {
	        this.account_type = account_type;
	    }

	    public Date getDate() {
	        return date;
	    }

	    public void setDate(Date date) {
	        this.date = date;
	    }

	    public String getId() {
	        return id;
	    }

	    public void setId(String id) {
	        this.id = id;
	    }

	    public int getAmount() {
	        return amount;
	    }

	    public void setAmount(int amount) {
	        this.amount = amount;
	    }

	    public int getBalance() {
	        return balance;
	    }

	    public void setBalance(int balance) {
	        this.balance = balance;
	    }

	    public void detailtransactions(){
	        System.out.println("---------------------------------------------");
	        System.out.println(getAccount_number() + "\n" + getId() + "\n" + getAccount_type() + "\n"
	                + getAmount() + "\n" + getBalance() + "\n" + getDate());
	        System.out.println("---------------------------------------------");

	    }
	}

