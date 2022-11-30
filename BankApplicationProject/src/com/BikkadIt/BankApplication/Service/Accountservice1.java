package com.BikkadIt.BankApplication.Service;

import java.util.Scanner;

import com.BikkadIt.BankApplication.Entity.Account;

public class Accountservice1 implements AccountService {
	Account acc=new Account();
	Scanner sc=new Scanner(System.in);
	@Override
	public void CreateAccount() {
		System.out.println("Enter your Account No");
		int accno=sc.nextInt();
		acc.setAccountNo(accno);
		System.out.println("Enter your Fullname");
		String fname=sc.next()+" "+sc.next()+" "+sc.next();
		acc.setFullname(fname);
		System.out.println("Enter your Email");
		String email=sc.next();
		acc.setEmail(email);
		System.out.println("Enter Your Password");
		String pass=sc.next();
		acc.setPassword(pass);
		System.out.println("Enter your Address");
		String add=sc.next();
		acc.setAddress(add);
		System.out.println("Enter your Mobno");
		String mob=sc.next();
		acc.setMobno(mob);
		System.out.println("Enter Your Dob");
		String dob=sc.next();
		acc.setDob(dob);
		System.out.println("Enter your PanNo");
		String panno=sc.next();
		acc.setPanNo(panno);
		System.out.println("Enter you want to Deposit ");
		double deposit=sc.nextDouble();
		acc.setBalance(deposit);
		
		System.out.println("************Your Account Created Successfully***************");
		
	
	}

	@Override
	public void viewAccount() {
		System.out.println("******print using get method******");
		System.out.println("Enter your Account No");
		int useraccno=sc.nextInt();

        System.out.println("Account No:"+acc.getAccountNo());
        System.out.println("Fullname:"+acc.getFullname());
        System.out.println("Email:"+acc.getEmail());
        System.out.println("Password:"+acc.getPassword());
        System.out.println("PanNo:"+acc.getPanNo());
        System.out.println("Balance:"+acc.getBalance());
	}
	{
        System.out.println("Print using tostring method:"+toString());

		
	}

	@Override
	public void WithdrawMoney() {
		System.out.println("Enter Account Number");
		int userAccNo = sc.nextInt();

		if (userAccNo == acc.getAccountNo()) {
			System.out.println("Enter amount to be withdraw");
			double amount = sc.nextDouble();
			if (amount <= acc.getBalance()) {
				double balAmount = acc.getBalance() - amount;
				acc.setBalance(balAmount);
				System.out.println("Withdraw Successful.Current Balance is :" + acc.getBalance());

			} else {
				System.out.println("*****!!!Insufficient Fund!!!*******");
			}

		} else {
			System.out.println("########Create Account first###########");
		}

	}

	@Override
	public void DepositMoney() {
		System.out.println("Enter Account no ");
		int userAcc = sc.nextInt();
		if (userAcc == acc.getAccountNo()) {

			System.out.println("Enter Amount you want to deposit money");
			double creditAmount = sc.nextDouble();
			creditAmount = acc.getBalance() + creditAmount;

			acc.setBalance(creditAmount);
			System.out.println("Your deposit successful .Current balance is :" + acc.getBalance());

		} else {
			System.out.println("******You need to create Account first*******");
		}
		
	}

	@Override
	public void UpdateAccount() {
		System.out.println("Enter Account No ");
		int userAccNo = sc.nextInt();

		if (userAccNo == acc.getAccountNo()) {

			boolean flag = true;
			while (flag) {
		        System.out.println("Press 1 : Update your name");
				System.out.println("Press 2 :  Update your Address");
				System.out.println("Press 3 :  update your Mobno");
				System.out.println("Press 4 : Update your Dob");
				System.out.println("Press 5 :  Update your PanNo");
				System.out.println("Press 6 :  Exit");



				int ch = sc.nextInt();

				switch (ch) {

				case 1:
					System.out.println("Enter Name you want to update");
					String updatedname = sc.next();
					acc.setFullname(updatedname);
					System.out.println("Your update name is :" + acc.getFullname());
					break;
				case 2:
					System.out.println("Enter Address you want to update");
					String updateadd=sc.next();
					acc.setAddress(updateadd);
					System.out.println("Your update Address is:"+acc.getAddress());

					break;
				case 3:
					System.out.println("Enter MobNo you want to update");
					String updatemob=sc.next();
					acc.setMobno(updatemob);
				  System.out.println("Your update mobno is:"+acc.getMobno());

					break;
				case 4:
					System.out.println("Enter Dob you want to update");
					String dob=sc.next();
					acc.setDob(dob);
					System.out.println("Your update dob is:"+acc.getDob());
					break;
				case 5:
					System.out.println("Enter PanNo you want to update");
					String panno=sc.next();
					acc.setPanNo(panno);
					System.out.println("Your update panNo is:"+acc.getPanNo());
					break;
				case 6:
					

					flag = false;
					break;
				default:
					System.out.println("*******Invalid input********");
					break;
				}
			}
		} else {
			System.out.println("*******Create Account first**********");
		}

	}
		
	}


