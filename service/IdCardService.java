package idcard.service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import idcard.model.IdentityCard;

public class IdCardService 
{
	IdentityCard idcard;
	public IdCardService(IdentityCard idcard) 
	{
		this.idcard=idcard;
		
	}
	
	HashMap<Integer,IdentityCard> map1 =new HashMap<>();
	public void register()
	{

		Scanner scan=new Scanner(System.in);
		Integer id=0;
		id++;
		map1.put(id, this.idcard);
		Set key=map1.keySet();
		Iterator itr=key.iterator();
			System.out.println("Registration sucessfull!! your Identity card no is: "+itr.next());
	}

	public void login() 
	{
		Scanner scan=new Scanner(System.in);
		boolean flag=false;
		System.out.println("Kindly enter your Identity card no");
		Integer cardNo=scan.nextInt();
		Set entry=map1.entrySet();
		Iterator itr=entry.iterator();
		while(itr.hasNext())
		{
			Map.Entry pair=(Entry) itr.next();
			Integer key=(Integer) pair.getKey();
			if(cardNo==key)
			{
				flag=true;
				System.out.println("Please enter password");
				String password=scan.next();
				if(password.equals(this.idcard.getPassword()))
				System.out.println("The details are : "+ pair.getValue());
				else
				{
					System.out.println("Password mismatch");
				}
			}
			
		}
		if(flag==false)
		{
			System.out.println("Identity card no "+cardNo+" don't exist");
		}
		
	}
}
