package com.BikkadIt.BankApplication.Controller;

import java.util.Scanner;

import com.BikkadIt.BankApplication.Service.Accountservice1;

public class ClassAdmin {
	public static void main(String[] args) {
		Accountservice1 accountservice1=new Accountservice1();
		boolean flag = true;

		while(flag)
		{

		System.out.println("**------!!!!***** WELCOME TO OUR BANK SERVICES *****!!!!-------**");

		System.out.println("Press 1:Create Your Account");
		System.out.println("Press 2:View Your Account");
		System.out.println("Press 3:Withdraw Money");
		System.out.println("Press 4:Deposite Money");
		System.out.println("Press 5:Update Your Account");
		System.out.println("Press 6:Exit");
		
		System.out.println("********-----!!!!*******Choose your Option******!!!!------*********");
		
		Scanner sc= new Scanner (System.in);
		int choice=sc.nextInt();
		
	   switch(choice)
	   {
	   case 1:  
		   accountservice1.CreateAccount();
		   break;
	   case 2:
		   accountservice1.viewAccount();

		   break; 
       case 3:
		   accountservice1.WithdrawMoney();

			   break;
			   
	   case 4:
		   accountservice1.DepositMoney();

		   break;
	   case 5:
		   accountservice1.UpdateAccount();

		   break;
	   case 6:
			flag = false;
			   


			System.out.println("*******!!!!!!*********Thanks for using Bank Services*********!!!!!!**********");
  
		   
	   }
	   }

	}

}
