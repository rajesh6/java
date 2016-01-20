package com.bank;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Scanner;

public class CustomerOperations1 implements CommonOperations1,Serializable {
	@Override
	public void logout() 
	{
		try{
		
		System.out.println("successfully logout");
		MainBank1.cr[0].setTrns("successfully logout");
		}
		catch(Exception e){
    		System.out.println(e);
    		System.out.println("enter correct datails");
    		}
	}
	public void accountDetails() 
	{
		try
		{
		Scanner s=new Scanner(System.in);
    	System.out.println("enter account no");
    	int s1=s.nextInt();
    	 if((MainBank1.cr[s1].acctNo)==s1)
	{
		System.out.println("your name = "+MainBank1.cr[s1].getName());
		System.out.println("your Acnt no = "+MainBank1.cr[s1].getAcctNo());
		System.out.println("your present bal = "+MainBank1.cr[s1].getBall());
	} else
	{
		System.out.println("sory ur account number is wrong");
	}
		}
		catch(Exception e){
    		System.out.println(e);
    		System.out.println("enter correct datails");
    		}
    	 
 		}
	public void allTransaction()
	{try{
	
		System.out.println("last transactions are");
		Scanner s=new Scanner(System.in);
    	System.out.println("enter account no");
    	int i=s.nextInt();
    	for(int j=0;j<MainBank1.cr[i].i;j++){
		System.out.println(( MainBank1.cr[i].trans[j]));
		}
	}catch(Exception e){
		System.out.println(e);
		System.out.println("enter correct datails");
		}
    	
	} 
	public void transferMoney()
	{
		try
		{
		Scanner s=new Scanner(System.in);
    	System.out.println("enter account no");
    	int i=s.nextInt();
    	System.out.println("enter account no for trnfer money");
    	int s2=s.nextInt();
    	System.out.println("enter amount to trnfer");
    	int s3=s.nextInt();
    	
    	if((MainBank1.cr[i].acctNo!=-1) &&(MainBank1.cr[i].acctNo==i))
    	{
    	 if((MainBank1.cr[s2].acctNo!=-1) &&(MainBank1.cr[s2].acctNo==s2))
    	{
    		 MainBank1.cr[i].setBall((MainBank1.cr[i].getBall()-s3));
    		 MainBank1.cr[s2].setBall((MainBank1.cr[s2].getBall()+s3));
    		 System.out.println("successfully trnfer");
    	}}
    	else
    	{
    		System.out.println("sorry ur accnt no doesnt exist plz try again");
    	}
    	MainBank1.cr[i].setTrns("amount " +s3 +" is trnfer to  "+s2+ "  account");
		}catch(Exception e){
    		System.out.println(e);
    		System.out.println("enter correct datails");
    		}
	}
	public void last5transactions()
	{
		try
		{
		System.out.println("last transactions are");
		Scanner s=new Scanner(System.in);
    	System.out.println("enter account no");
    	int i=s.nextInt();
    	for(int j=0;j<5;j++){
		System.out.println(( MainBank1.cr[i].trans[j]));
		}
		}catch(Exception e){
    		System.out.println(e);
    		System.out.println("enter correct datails");
    		}
	}
	public void selectCustomerOperation() 
	{
	try{
	    int ch=0;
   	    do
   	    {
		CustomerOperations1 co=new CustomerOperations1();
		System.out.println("enter ur option");
		System.out.println("1. View account details\n2. View All Transaction\n3. Transfer Money\n4. View last 5 transactions\n5. Log Out ");
		Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
		switch(n){
		case 1:System.out.println("View account details");
		co.accountDetails();
		break;
		case 2:System.out.println("View All Transaction");
		co.allTransaction();
		break;
		case 3:System.out.println("Transfer Money");
		co.transferMoney();
		break;
		case 4:System.out.println(" View last 5 transactions");
		co.last5transactions();
		break;
		case 5:System.out.println(" ");
		co.logout();
		ch=100;
		break;
		}
		if(ch==100){
		System.out.println("do you want to continue, enter 1");
 		ch=s.nextInt();
 		
 		}}while(ch==1);
    	 System.out.println("your successfully logout from customer");
	}catch(Exception e){
		//System.out.println(e);
		System.out.println("enter valid/correct datails");
		}
	}

	
}
