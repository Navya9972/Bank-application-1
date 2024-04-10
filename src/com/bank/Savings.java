package com.bank;
import java.util.*;
import java.util.ArrayList;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Savings extends Bank {


//    savings save = new savings();
public static ArrayList debit(int amount, String acc, Bank database){
  SimpleDateFormat formatter = new SimpleDateFormat("ddMM yyyy HH mm ss");
  Date date = new Date();
  String id = "D"+acc.substring(0,4)+(formatter.format(date).replace(" ",""));
  ArrayList details = new ArrayList();

  if(amount < database.getBalance1() && database.getMin_balance() > database.getBalance1()){
	
      int amount1 = database.getBalance1() - 20 - amount;
      
      database.setBalance1(amount1);
      System.out.println("Transaction successful of "+ amount + "Rs");
      System.out.println("Transaction id: " + id);
      System.out.println("Date of Transaction: "+ date);
      System.out.println("Balance amount: "+database.getBalance1());
      details.add(id);
      details.add(date);
      details.add(amount);

  }else if(amount < database.getBalance1() && database.getMin_balance() < database.getBalance1()){
      int amount1 = database.getBalance1() - amount;
      database.setBalance1(amount1);
      System.out.println("Transaction successful of "+ amount + "Rs");
      System.out.println("Transaction id: " + id);
      System.out.println("Date of Transaction: "+ date);
      System.out.println("Balance amount: "+database.getBalance1());
      details.add(id);
      details.add(date);
      details.add(amount);

  }else if(amount > database.getBalance1()){
	  System.out.println("Insufficient balance!!!");
  	System.out.println("Availale balance in your account: "+database.getBalance1());
      int amount1 = database.getBalance1() - 50;
      database.setBalance1(amount1);
     // System.out.println("In sufficient balance "+ amount + "Rs");
      System.out.println("Transaction id: " + id);
      System.out.println("Date of Transaction: "+ date);
      System.out.println("Balance amount: "+database.getBalance1());
      details.add(id);
      details.add(date);
      details.add(amount);

  }else{
      System.out.println("Insufficient Balance! Check your balance and try again");
  }

  return details;
}

public static ArrayList credit(int amount, String account_number2, Bank database) {

  SimpleDateFormat formatter = new SimpleDateFormat("ddMM yyyy HH mm ss");
  Date date = new Date();
  String id2 = "C"+account_number2.substring(0,4)+(formatter.format(date).replace(" ",""));
  ArrayList details1 = new ArrayList();

  int amount1 = database.getBalance1() + amount;
  database.setBalance1(amount1);
  System.out.println(amount + "Rs Credited Successful  in your account");
  System.out.println("Transaction id: " + id2);
  System.out.println("Date of Transaction: "+ date);
  System.out.println("Balance amount: "+database.getBalance1());
  details1.add(id2);
  details1.add(date);
  details1.add(amount);
  return details1;
}
}
