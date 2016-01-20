package com.bank;
import java.io.IOException;
import java.util.Scanner;

public class MainBank1 {

	static Customer1[] cr=new Customer1[20];
	static {
		System.out.println("Welcome to Nacre Bank");
	}
	public static void main(String[] args)  {
		try{
		AdminOperations1 admn=new AdminOperations1();
		CustomerOperations1 co=new CustomerOperations1();
		
		Scanner s=new Scanner(System.in);
		int ch = 0;
		do{
		System.out.println("enter your option");
		System.out.println("1. Login as Admin\t2. Login as Customer\t3. Exit ");
		int n=s.nextInt();
		switch(n)
		{
		case 1:System.out.println("welcome to admin");
		admn.selectAdminOperation();   
	    break;
		case 2:System.out.println("welcom to custemer");
		co.selectCustomerOperation(); 
		break;
		case 3:System.out.println("are you sure!!!");
		break;
		}
		
		System.out.println("do you want to continue for another transactions, enter 1");
		ch=s.nextInt();
		
		}while(ch==1);
		System.out.println("Thank U for Visiting Us. Visit Again ");
		}
		catch(Exception e){
			//System.out.println(e);
			System.out.println("plz enter valid/corrct options");
			
		}
	}
		
		

}
