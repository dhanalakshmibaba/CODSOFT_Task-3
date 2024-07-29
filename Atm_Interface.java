package codsoft;
import java.util.*;

public class Atm_Interface {

	private static String Tamil;

	public static void main(String[] args) {
		int balance =200000,withdraw,deposite,num;
		Scanner sc=new Scanner(System.in);
		String card;
		Scanner s = new Scanner(System.in);
		while(true)
		{
			System.out.println("Welcome to the Atm Macine");
			System.out.println("please insert your card");
			card  = s.next();
			System.out.println("card inserted successfully");
			System.out.println(" 1.Withdraw");
			System.out.println(" 2.Deposite ");
			System.out.println(" 3.check balance");
			System.out.println(" 4.Exit");
			num = sc.nextInt();
			switch(num)
			{
			case 1:
			{
				System.out.println("Enter the Amount to withdraw");
				withdraw = sc.nextInt();
				if(balance>=withdraw)
				{
					balance = balance-withdraw;
					System.out.println("Balance Amount is:    "+ balance);
					System.out.println("please wait,While the transcation is being processing.......");
					System.out.println("Please Collect your Money!!");	
				}
				else
				{
					System.out.println("Insufficient balnce to Withdraw");
				}
				System.out.println(" ");
			}
				break;
				case 2:
				{
					System.out.println("Enter the Amount the deposite");
					deposite = sc.nextInt();
					balance = balance+deposite;
					System.out.println("balance Amount is :   " + balance);
					System.out.println("Money has been deposited successfully");
					System.out.println(" ");
				}
				break;
				case 3:
				{
					System.out.println("Balance of your account is:        "+balance);
					System.out.println("  ");
					}
				break;
				case 4:
				{
					System.exit(0);
					System.out.println("   ");
				}
				break;
				default:
					System.out.println(" Thanks for using Atm");
					System.out.println("have a nice day");
					
				}
		}
	}
	
			
			
			
			
		
		// TODO Auto-generated method stub

	

}
