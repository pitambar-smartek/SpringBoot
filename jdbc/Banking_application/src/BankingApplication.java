import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nareshit.dto.Account;
import com.nareshit.exception.AccountNotFoundException;
import com.nareshit.exception.InsufficientFundException;
import com.nareshit.exception.ProcessingException;
import com.nareshit.service.AccountService;

public class BankingApplication {

	public static void main(String[] args)throws Exception {
		BufferedReader br=null;
		try{
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
				"service.xml");
		AccountService service = (AccountService) context
				.getBean("service");
		
		br= new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Menu Of Banking");
		System.out.println("1 . For CreateAccount");
		System.out.println("2 . For WithDraw");
		System.out.println("3 . For Deposit");
		System.out.println("4 . For Closing an Bank Account");
		System.out.println("5 . For Balance Inquiry");
		System.out.println("Enter your Choice No.=");
		int choice=Integer.parseInt(br.readLine());
		switch (choice) {
		case 1: {
			System.out.println("open Account");
			Account acc = new Account();
			System.out.println("Enter Amount=");
			double balance = Double.parseDouble(br.readLine());
			
			System.out.println("Enter Account No=");
			String accountNo = br.readLine();
			
		
			System.out.println("Enter Account Holder Name=");
			String name = br.readLine();
			acc.setName(name);
			acc.setBalance(balance);
			acc.setAccountNo(accountNo);
			try {
				service.openAccount(acc);
			} catch (ProcessingException e) {

				System.out.println("Server Error please try after some time");
			}
			System.out.println("One Account Details is inserted successfull");
			break;
		}
		case 2: {
			System.out.println("WithDraw money from Account");
			System.out.println("Enter A/C No=");
			String accountNO = br.readLine();
			System.out.println("Enter Amount To WidthDraw");
			double amount =Double.parseDouble(br.readLine());
			try {

				service.withDraw(accountNO, amount);
			} catch (InsufficientFundException e) {
				System.out
						.println("Due to insufficient fund in your AccountNo");
			} catch (ProcessingException e) {
				System.out.println("Server error try after some time");
			} catch (AccountNotFoundException e) {
				System.out.println("Account does not exists");

			}
			System.out.println("WithDraw Successfull");
			break;
		}
		case 3: {
			System.out.println("Deposit money into your Account");
			System.out.println("WithDraw money from Account");
			System.out.println("Enter A/C No=");
			String accountNO = br.readLine();
			System.out.println("Enter Amount To WidthDraw");
			double amount = Double.parseDouble(br.readLine());
			try {
				service.deposit(accountNO, amount);
			} catch (ProcessingException e) {
				System.out.println("Server error please try after some time");
			} catch (AccountNotFoundException e) {
				System.out.println("Sorry Account does not exits");
			}
             System.out.println("Deposit is successful");
			break;
		}
		case 4: {
			System.out.println("Close an Account");
			System.out.println("Enter accountNO");
			String accountNo = br.readLine();
			try {
				service.closeAccount(accountNo);
			} catch (ProcessingException e) {
				System.out.println("Server error please try after some time");
			} catch (AccountNotFoundException e) {
				System.out.println("Sorry account does not exists");

			}
			System.out.println("One Account is deleted successful");
			break;
		}
		case 5: {
			System.out.println("Balance Details");
			System.out.println("Enter accountNO");
			String accountNo = br.readLine();
			try {
				double balance=service.getBalance(accountNo);
				System.out.println("Your Current Balance is="+balance);
			} catch (AccountNotFoundException e) {
				System.out.println("Sorry Account does not exists");

			} catch (ProcessingException e) {
				System.out.println("Server error Please try after some time");
			}
              System.out.println("Getting Balance Detail is successfull ");
			break;
		}

		}

	
	}finally{
		br.close();
		br=null;
		
	}
	}

}
