package com.bank;



public class Validation extends Bank{
	    int length;
	    //***************************************name Validation**************************
	    public boolean validate_Name(String name) {
	        length=name.length();
	        int ch=0;
	        for(int i=0;i<length;i++)
	        {
	            if(Character.isUpperCase(name.charAt(i)))
	            {
	                ch++;
	            }
	            else if(Character.isLowerCase(name.charAt(i)))
	            {
	                ch++;
	            }
	        }
	        if(ch==length)
	        {
	            return true;
	        }
	        else
	        {
	            System.out.println("Invalid Name");    
	            return false;
	        }
	    }

	public boolean validate_Email(String email)
	{
	    length=email.length();
	    boolean attherate=false,dot=false;
	    String com=email.substring(length-4,length);

	    char firstLetter=email.charAt(0);
	    String a=".com";
	    if(Character.isLowerCase(firstLetter) || Character.isUpperCase(firstLetter))
	    {
	        if(com.equals(a))
	        {
	            for(int i=0;i<length;i++)
	                {
	                    if(email.charAt(i)=='@')
	                    {
	                        attherate=true;
	                        break;
	                    }
	                }
	         }
	    }
	    if(attherate==false)
	    {
	        System.out.println("Invalid mail");    
	        return false;
	    }
	        return true;
	}
		
		       
		    public boolean validate_Password(String password)
		    {
		        length=password.length();
		        int low=0,up=0,space=0,digit=0,sp_char=0;
		        if(length>=8)
		        {
		            for(int i=0;i<length;i++)
		            {
		                if(Character.isUpperCase(password.charAt(i)))
		                {
		                    up++;
		                }
		                else if(Character.isLowerCase(password.charAt(i)))
		                {
		                    low++;
		                }
		                else if(Character.isSpace(password.charAt(i)))
		                {
		                    space++;
		                }
		                else if(Character.isDigit(password.charAt(i)))
		                {
		                    digit++;
		                }
		                else {
		                    sp_char++;
		                }
		            }
		            if(up>=1 && low>=1 && space==0 && digit>=1 && sp_char>=1)
		            {
		                return true;
		            }
		        }
		        else
		        {
		            System.out.println("Invalid Password");    
		            return false;
		        }
		        return false;
		    }
		    public boolean validate_PhoneNumber(String phoneNumber)
		    {
		        length=phoneNumber.length();
		        int d=0;
		        if(length>=10 && length<=13)
		        {
		            for(int i=0;i<length;i++)
		            {
		                if(Character.isDigit(phoneNumber.charAt(i)))
		                {
		                    d++;
		                }
		            }
		        }
		        if(d==length)
		        {
		            return true;
		        }
		        else
		        {
		            System.out.println("Invalid phone number");    
		            return false;
		        }
		    }
		    
		    public boolean validate_AccountNumber(String accountNumber)
		    {
		        length=accountNumber.length();
		        int d=0;
		        if(length==13)
		        {
		            for(int i=0;i<length;i++)
		            {
		                if(Character.isDigit(accountNumber.charAt(i)))
		                {
		                    d++;
		                }
		            }
		        }
		        if(d==length)
		        {
		            return true;
		        }else
		        {
		            System.out.println("Invalid account number");    
		            return false;
		        }
		        
		    }
	}

