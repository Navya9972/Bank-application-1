package com.bank;

public class Bank {
	private String first_name,last_name,phone_number,address,email,password,account_number,branch,ifsc_code,date,account_type;
	private boolean credit_card,debit_card;
	private int balance1,min_balance,credit,initialbalance;
	public Bank(String first_name, String last_name, String phone_number, String address, String email, String password,
			String account_number, String branch, String ifsc_code,  String account_type, int balance1,
			int min_balance, int credit) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_number = phone_number;
		this.address = address;
		this.email = email;
		this.password = password;
		this.account_number = account_number;
		this.branch = branch;
		this.ifsc_code = ifsc_code;
		this.account_type = account_type;
		this.balance1 = balance1;
		this.min_balance = min_balance;
		this.credit = credit;
	}
	Bank()
	{
		
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(String phone_number) {
		this.phone_number = phone_number;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAccount_number() {
		return account_number;
	}
	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public String getIfsc_code() {
		return ifsc_code;
	}
	public void setIfsc_code(String ifsc_code) {
		this.ifsc_code = ifsc_code;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getAccount_type() {
		return account_type;
	}
	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}
	public boolean isCredit_card() {
		return credit_card;
	}
	public void setCredit_card(boolean credit_card) {
		this.credit_card = credit_card;
	}
	public boolean isDebit_card() {
		return debit_card;
	}
	public void setDebit_card(boolean debit_card) {
		this.debit_card = debit_card;
	}
	public int getBalance1() {
		return balance1;
	}
	public void setBalance1(int balance1) {
		this.balance1 = balance1;
	}
	public int getMin_balance() {
		return min_balance;
	}
	public void setMin_balance(int min_balance) {
		this.min_balance = min_balance;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public int getInitialbalance() {
		return initialbalance;
	}
	public void setInitialbalance(int initialbalance) {
		this.initialbalance = initialbalance;
	}
	public void printDetails()
	{
		System.out.println(getFirst_name());
		System.out.println(getLast_name());
		System.out.println(getPhone_number());
		System.out.println(getAddress());
		System.out.println(getEmail());
		System.out.println(getPassword());
		System.out.println(getAccount_number());
		System.out.println(getBranch());
		System.out.println(getIfsc_code());
		System.out.println(getAccount_type());
		System.out.println(getBalance1());
		System.out.println(getMin_balance());
		System.out.println(getCredit());
		
	}

}
