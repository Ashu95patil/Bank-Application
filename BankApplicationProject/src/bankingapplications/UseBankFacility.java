package bankingapplications;

import java.util.Scanner;

public  class UseBankFacility  {
	public static void main(String[] args) {
		UseBankFacility a=new UseBankFacility();
		a.showMenu();
	}
	
	  private int AccountNo;
	  private String  Fullname;
	  private String Email;
	  private String Password;
	  private String Address;
	  private String Mobno;
	  private String Dob;
	  private  String PanNo;
	  private  double Balance;

	  @Override
	public String toString() {
		return "UseBankFacility [AccountNo=" + AccountNo + "/n, Fullname=" + Fullname + "/n, Email=" + Email + "/n, Password="+ Password + "/n, Address=" + Address + "/n, Mobno=" + Mobno + "/n, Dob=" + Dob + "/n, PanNo=" + PanNo+ "/n, Balance=" + Balance + "]";
	}

		
		
		void showMenu() {
		
	
		int Option ='\1';
		
		Scanner sc=new Scanner (System.in);
		System.out.println("!!!!!----****************************Welcome to our Bank Services**********************-------!!!!!");
		
		
		
		System.out.println("Press 1:Create Your Account");
		System.out.println("Press 2:View Your Account");
		System.out.println("Press 3:Withdraw Money");
		System.out.println("Press 4:Deposite Money");
		System.out.println("Press 5:Update Your Account");
		System.out.println("Press 6:Exit");

		
		do
		{
			System.out.println("********************!!!!!!!!!!!!!****Enter Your Option****!!!!!!!!!!!!!*******************************");
			int choice = sc.nextInt();


			System.out.println("/n");


	 
		
	   
		switch(choice)
		{
		case 1:
			System.out.println("Create Your AccountNo:");
			AccountNo=sc.nextInt();
			System.out.println("Enter Your Fullname:");
			Fullname=sc.next();sc.nextLine();
			System.out.println("Create Your Email:");
			Email=sc.next();
			System.out.println("Create Your Password:");
		    Password=sc.next();
			System.out.println("Create Your Address:");
			Address=sc.next();
			System.out.println("Create Your Mobno:");
			Mobno=sc.next();
			System.out.println("Create Your Dob:");
			Dob=sc.next();
			System.out.println("Create Your PanNo:");
			PanNo=sc.next();
			System.out.println("Enter Amount you want Deposit :");
			Balance=sc.nextDouble();
			System.out.println("*** Your Account Created Successfully***");
			System.out.println("/n");
		     break;
		case 2:
		     System.out.println("Enter your AccountNo");
		     AccountNo=sc.nextInt();
		     System.out.println(toString());
		     System.out.println("/n");
		     break;
		     
		case 3:
			System.out.println("Enter Your Account Number");
			AccountNo=sc.nextInt();
			System.out.println("Enter Amount to be Withdrawal");
			if(Balance-Balance<0)
			{
				System.out.println("Withdraw Unsucessfull only"+Balance+"is left");
			}
			
				else
				{
					Balance-=sc.nextDouble();
					System.out.println("Withdraw Successful");
					System.out.println("Current Balance is"+Balance);
				}
			System.out.println("/n");
			break;
			
		case 4:
			System.out.println("Enter Your AccountNo");
			AccountNo=sc.nextInt();
			System.out.println("Enter Amount to be Deposit");
			Balance+=sc.nextDouble();
			System.out.println("Deposit is Successful");
			System.out.println("Current Balance is"+Balance);
			break;
			
		case 5:
			int ab='\0';
			System.out.println("Enter your AccountNo");
			AccountNo=sc.nextInt();
	        System.out.println("Press 1 : Update your name");
			System.out.println("Press 2 :  Update your Address");
			System.out.println("Press 3 :  update your Mobno");
			System.out.println("Press 4 : Update your Dob");
			System.out.println("Press 5 :  Update your PanNo");

			do {
				
			System.out.println("******************************Enter your update option**********************************************");
			int choice1=sc.nextInt();
         switch(choice1) 
        
         {
         
         case 1:
			
	        Fullname=sc.next();
	        System.out.println("Your name update Succcessful");
			System.out.println("/n");
           break;
         case 2: 
			Address=sc.next();
	        System.out.println("Your Address update Succcessful");
			System.out.println("/n");
			break;
		case 3:	

			Mobno=sc.next();
	        System.out.println("Your Mobno update Succcessful");
			System.out.println("/n");
			break;
		case 4:	

			Dob=sc.next();
	        System.out.println("Your Dob update Succcessful");
			System.out.println("/n");
			break;
		case 5:	

			PanNo=sc.next();
	        System.out.println("Your PanNo update Succcessful");
	        System.out.println("/n");
	        break;
			}
			}
			while(ab >=5 );
				{
					System.out.println("***********************************************************************************");
					
				}
			
	        break;
		case 6:
			System.out.println("*****Thank You For Using Our Services.....!!!*****");
			break;
		default:
			System.out.println("Invalid Option!!!!!! Please Enter Correct option");
			System.out.println("/n");
			break;
		}
		
		}
		
		while(Option != 6);
		{
			System.out.println("***************");
		}
		}
	
}




						
		

			
		

	


	

	

	
	