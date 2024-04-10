package com.bank;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		ArrayList<Bank> database=new ArrayList<>();
		Validation val=new Validation();
		ArrayList<Transactions> transactions = new ArrayList<>();
		//Bank bank=new Bank();
		while(true)
		{
			System.out.println("1. create Account");
			System.out.println("2.Display  Account");
			System.out.println("3. Credit");
			System.out.println("4.Debit");
			System.out.println("5. Display all transaction details");
			System.out.println("6.Exit");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter first name:");
		        String firstName=sc.next();
		        while(val.validate_Name(firstName)==false) {
		            System.out.println("Enter firstName:");
		             firstName=sc.next();
		        }
		        System.out.println("Enter last name:");
		        String lastName=sc.next();
		        while(val.validate_Name(lastName)==false) {
		            System.out.println("Enter lastName:");
		             lastName=sc.next();
		        }
		        System.out.println("Enter phone number:");
		        String  phoneNumber=sc.next();
		        while(val.validate_PhoneNumber(phoneNumber)==false) {
		            System.out.println("Enter phone number:");
		             phoneNumber=sc.next();    
		        }
		        System.out.println("Enter address");
		        String address=sc.next();
		        System.out.println("Enter email:");
		        String email=sc.next();
		        while(val.validate_Email(email)==false) {
		            System.out.println("Enter email:");
		             email=sc.next();
		        }
		        System.out.println("Enter password:");
		        String password=sc.next();
		        while(val.validate_Password(password)==false)
		        {
		            System.out.println("Enter password:");
		            password=sc.next();
		        }

		        System.out.println("Enter account number:");
		        String accountNumber=sc.next();
		        while(val.validate_AccountNumber(accountNumber)==false)
		        {
		            System.out.println("Enter account number:");
		            accountNumber=sc.next();
		        }
				System.out.println("Enter branch");
				String branch=sc.next();
				System.out.println("Enter ifsc code");
				String ifsccode=sc.next();
				System.out.println("Enter acccount type");
				String account_type=sc.next();
				System.out.println("Enter Balance");
				int balance=sc.nextInt();
				System.out.println("Enter minimum balance");
				int min_balance=sc.nextInt();
				System.out.println("Enter amount to credit");
				int credit=sc.nextInt();
				database.add(new Bank(firstName,lastName,phoneNumber,address,email,password,accountNumber,branch,ifsccode,account_type,balance,min_balance,credit));
				break;
			case 2:
				System.out.println("enter account number");
				String ac=sc.next();
				System.out.println("enter account type");
				String at=sc.next();
				//System.out.println(database.size());
				for(int i=0;i<database.size();i++)
				{
					if(database.get(i).getAccount_number().equals(ac) && database.get(i).getAccount_type().equals(at))
					{
						database.get(i).printDetails();
					}
					
				}
				
				break;
			case 3:
				 System.out.println("Enter the amount to credit: ");
                 int credit1 = sc.nextInt();
                 System.out.println("Enter the account number: ");
                 String acc1 = sc.next();
                 System.out.println("Enter the account type: ");
                 String type1 = sc.next();
                 for(int k = 0; k<database.size(); k++){
                     if(database.get(k).getAccount_number().equals(acc1) && type1.equals("savings")){
                    	 ArrayList id =Savings.credit(credit1, acc1, database.get(k));
        
                         transactions.add(new Transactions((String) id.get(0), database.get(k).getAccount_number(),
                                 database.get(k).getBalance1(), database.get(k).getAccount_type(), (Date) id.get(1), (Integer) id.get(2)));
                     }else if(database.get(k).getAccount_number().equals(acc1) && type1 == "current"){
                         //Current.credit(credit1, acc1, database.get(k));
                         ArrayList id = Current.credit(credit1,acc1, database.get(k));
                         transactions.add(new Transactions((String) id.get(0), database.get(k).getAccount_number(),
                                 database.get(k).getBalance1(), database.get(k).getAccount_type(), (Date) id.get(1), (Integer) id.get(2)));
                     }else{
                         System.out.println("Enter the correct account details! ");
                     }
                 }
                 break;
			case 4:
				System.out.println("Enter the amount to debit: ");
                int debit1 = sc.nextInt();
                System.out.println("Enter the account number: ");
                String acc = sc.next();
                System.out.println("Enter the account type: ");
                String type = sc.next();
                for(int k = 0; k<database.size(); k++){
                    if(database.get(k).getAccount_number().equals(acc) && type.equals("savings")){
                        ArrayList id = Savings.debit(debit1,acc, database.get(k));
                        transactions.add(new Transactions((String) id.get(0), database.get(k).getAccount_number(),
                                database.get(k).getBalance1(), database.get(k).getAccount_type(), (Date) id.get(1), (Integer) id.get(2)));
                    }else if(database.get(k).getAccount_number().equals(acc) && type == "current"){
                       // Current.debit(debit1, acc, database.get(k));
                        ArrayList id = Current.debit(debit1,acc, database.get(k));
                        transactions.add(new Transactions((String) id.get(0), database.get(k).getAccount_number(),
                                database.get(k).getBalance1(), database.get(k).getAccount_type(), (Date) id.get(1), (Integer) id.get(2)));
                    }else{
                        System.out.println("Enter the correct account details! ");
                    }
                }

                break;
			case 5:
				System.out.println("Enter the account number: ");
                String acn = sc.next();
                for(int m = 0; m<transactions.size(); m++){
                    if(transactions.get(m).getAccount_number().equals(acn)){
                        transactions.get(m).detailtransactions();
                    }
                }
                break;
			case 6:
				System.exit(1);
				break;
			default:
				System.out.println("Select valid choice");
		}
		
	}
	}
}



