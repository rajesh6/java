package com.bank;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Scanner;

public class AdminOperations1 implements CommonOperations1,Serializable {

	
	public void logout()
	{
		System.out.println("successfully logout");	
	}
	public void accountopen() throws IOException
	{
	try{
		Scanner s=new Scanner(System.in);
		System.out.println("enter  name");
		String s1=s.next();
		System.out.println("enter  accnt no");
		int i=s.nextInt();
		Customer1 c=new Customer1();
		
		System.out.println("enter amount");
	    int s2=s.nextInt();
		c.setName(s1);
		c.setBall(s2);
		c.setAcctNo(i);
		MainBank1.cr[i]=c;
		//MainBank1.cr[i].setTrns("acoount no is opned");
	}
	catch(Exception e){
	//System.out.println(e);
	System.out.println("enter valid/correct datails");
	}}
	public void amountdeposit()
	{  
		try{
		Scanner s=new Scanner(System.in);
		System.out.println("enter acount number");
		int i=s.nextInt();
		System.out.println("enter deposit amount");
		int d=s.nextInt();
		if((MainBank1.cr[i].acctNo!=-1) &&(MainBank1.cr[i].acctNo==i))
		{
			System.out.println("successfully deposited");
			System.out.println("now account"+MainBank1.cr[i].acctNo+" amount is"+(MainBank1.cr[i].getBall()+d));
			MainBank1.cr[i].setBall((MainBank1.cr[i].getBall()+d));
		}
		else
		{
			System.out.println("sory no such type of account is present");
		}
		MainBank1.cr[i].setTrns("amount  "+d +" is depostited");
		}
		catch(Exception e){
			//System.out.println(e);
			System.out.println("enter valid/correct datails");
			}
	}
     public void amountwithdrawl()
     {
    	 try{
    	Scanner s=new Scanner(System.in);
    	System.out.println("enter acount number");
 		int s1=s.nextInt();
    	System.out.println("enter withdwl amount");
 		int d=s.nextInt();
 		if((MainBank1.cr[s1].acctNo!=0 )&& (MainBank1.cr[s1].acctNo==s1))
		{
 		if(MainBank1.cr[s1].getBall()<d)
 		{
 			System.out.println("sory acount "+MainBank1.cr[s1].acctNo+" contain only"+MainBank1.cr[s1].getBall());
 		}
 		else
 		{
 			System.out.println("successfully withdrwl ");
 			System.out.println("now account"+MainBank1.cr[s1].acctNo+" remaining amount is"+(MainBank1.cr[s1].getBall()-d));
 			MainBank1.cr[s1].setBall((MainBank1.cr[s1].getBall()-d));
 		}
		}
		else
		{
			System.out.println("sory no such type of account is present");
		}
 		MainBank1.cr[s1].setTrns("amount  "+d +" is withdral");
    	 }
    	 catch(Exception e){
    			//System.out.println(e);
    			System.out.println("enter valid/correct datails");
    			}
    	 
     }
     public void deletingaccount()
     
     {
    	 try
    	 {
    		 Scanner s=new Scanner(System.in);
    	 
 	System.out.println("enter acount number");
		int s1=s.nextInt();
    	MainBank1.cr[s1].setAcctNo(-1) ;
    	System.out.println("successfully acount deleted");
    	MainBank1.cr[s1].setTrns("amount   is deleted");
    	 }
    	 catch(Exception e){
    			//System.out.println(e);
    			System.out.println("enter valid/correct datails");
    			}
     }
     public void selectAdminOperation() throws IOException
     {
    	try{
    	 int ch=0;
    	 do
    	 {
         AdminOperations1 admn=new AdminOperations1();
    	 System.out.println("select ur option");
    	 System.out.println("1. Open an account\n2. Deposit\n3. Withdrawal\n4. Delete an account\n5. Log Out ");
    	Scanner s=new Scanner(System.in);
    	int n=s.nextInt();
    	 switch(n){
    	 case 1:System.out.println("open an account");
    	 admn.accountopen(); 
    	 break;
    	 case 2:System.out.println("deposit");
    	 admn.amountdeposit();
    	 break;
    	 case 3:System.out.println("withdrawl");
    	 admn.amountwithdrawl();
    	 break;
    	 case 4:System.out.println(" ");
    	 admn.deletingaccount();
    	 break;
    	 case 5:System.out.println(" ");
    	 admn.logout();
    	 ch=2;
    	 break;
    	 
    	 }
    	 if(ch!=2){
    	 System.out.println("do you want to continue, enter 1");
 		ch=s.nextInt();
    	 
 		}}while(ch==1);
    	 System.out.println("your successfully logout from admin");
    	}catch(Exception e){
    		//System.out.println(e);
    		System.out.println("plz enter valid/correct datails");
    		}
    	 
     }
	
}
