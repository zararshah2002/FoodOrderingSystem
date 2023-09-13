package pkg;

import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Menu //More for Admin Management
{
	String name;
	Scanner inp= new Scanner(System.in);
	private static int MenuCount =0;
	/*
	 * instead of making a sep Class with variables to store name and price and then
	 * make its List i simply made a Map withMap Name and Price of
	 * item.LinkedHashmap used instead of simple hashmap as i want it to preserve
	 * the order of item insertion.
	 */ 
	public Menu() 
	{
		
		mItem.put("C1", 500);
		mItem.put("C2", 500);
		mItem.put("C3", 500);
		mItem.put("C4", 800);
		mItem.put("C5", 700);
		mItem.put("C6", 725);
		mItem.put("C7", 700);
		mItem.put("C8", 525);
		mItem.put("B1", 800);
		mItem.put("B2", 800);
		mItem.put("B3", 575);
		mItem.put("B4", 575);
		
	}
	public Map<String,Integer/*price*/> mItem=new LinkedHashMap<>();
	
	protected void addItem(String name,int price) 	
	{
		System.out.println(name+" Added");
		mItem.put(name, price);
	}
	
	void addToCart()
	{
		
	}
	
	protected void remItem(String name)	
	{
		mItem.remove(name);//removes both name&price as entry in hashmap is a KeyValue pair.
		System.out.println("Removed "+name+" from Menu\n");
	}
	
	protected void update(String name,int price)
	{
		if (mItem.containsKey(name)) 
		{
			addItem(name, price);
			/*
			 * checks if item is present in map, if yes then updates the price by calling
			 * addItem method
			 */
			System.out.println("updated Price of "+name+": "+price);
		}
		else 
		{
			System.out.println(name+" not in menu, press 1 to add || 0 to return");
			int x=inp.nextInt();
			if(x==1) {addItem(name, price);}			
		}
		
	}
	
	public int getPrice(String name)	
	{
		if(mItem.getOrDefault(name, -1)==-1)
		{
			System.out.println(name+" not in Menu");
			return 0;			
		}
		else 
		{
			//System.out.println(name+": "+mItem.get(name)+".Rs\n");
			return mItem.get(name);
		}		
	}
	
	public List<String> getItems()
	{
		return new ArrayList<>(mItem.keySet());//makes a List of the items in Map and returns it.
	}
	
	protected int getSize()	
	{
		return mItem.size();
	}
	
	protected boolean available(String name)		
	{
		//System.out.println("Av name::"+name);
		return mItem.containsKey(name);
	}
	
	
	
	
	
	
}
