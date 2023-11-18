package idcard.main;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import idcard.model.IdentityCard;
import idcard.service.IdCardService;


public class LaunchIDCard {

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Welcome to Information center");
		System.out.println("Do you want to Register?(Y/N)");
		String input1=scan.next();
		
		if(input1.equalsIgnoreCase("Y"))
		{
			
			IdCardService s=new IdCardService(null);
			System.out.println("Please enter your name");
			String name=scan.nextLine();
			scan.nextLine();
			System.out.println("Please enter your age");
			Integer age=scan.nextInt();
			System.out.println("Please enter your city");
			String city=scan.next();
			System.out.println("Please set a password");
			String pwd=scan.next();
			IdentityCard idcard=new IdentityCard(name,age,city,pwd);
			IdCardService service=new IdCardService(idcard);
			service.register();
			System.out.println("Do you want to login?(Y/N)");
			String input2=scan.next();
			
			if(input2.equalsIgnoreCase("Y"))
			{
				service.login();
			}
			else if(input2.equalsIgnoreCase("N"))
			{
				System.out.println("Do you want to Register another id?(Y/N)");
			}
		}
		else
		{
			System.out.println("Thank you for visiting!!");
		}

	}

}
