package pkg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
//import java.util.List;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import javax.sound.midi.Soundbank;


public class Cart 
{
	public Menu menu=new Menu();
	public Cart(Menu menu)	/*
					 * constructor for cart with Menu as argument as we need to make a link between
					 * the two
					 */
	{
		this.menu=menu;
	}
	
	
	public Map<String, Integer/*Quantity*/> cItems=new LinkedHashMap<>();
	
	
		
	public List<String> getCartItems() 
	{
        List<String> cartItemsList = new ArrayList<>();

        for (String itemName : cItems.keySet()) 
        {
            cartItemsList.add(itemName+" ("+cItems.get(itemName)+")");
        }

        return cartItemsList;
    }
	
//	public void addItem(String name) 
//	{	
//		System.out.print(name);
//		//System.out.println(A.available(name));
//		if(menu.available(name))
//		{
//			if(cItems.containsKey(name))
//					{IncrementQuantity(name);}
//			else {
//					System.out.println(" Added to cart");
//					cItems.put(name,+1);
//					System.out.println(cItems.get(name));
//				}
//			}
//		else 
//		{
//			
//			System.out.println(name+" Not availablez");
//		}
//	}	
	
	public int IncrementQuantity(String name)
	{
		if(menu.available(name)){
			
			if(cItems.containsKey(name)){
				
				if(cItems.get(name)>=0)	{
					int temp=cItems.get(name);
					cItems.put(name, ++temp);
					System.out.println(cItems);
					System.out.println("Successfully incremented val of "+name+": "+temp);
					return temp;
				}
			}
			else {
				System.out.println(" Added to cart");
				cItems.put(name,+1);
				System.out.println(cItems.get(name));
			}

		}
		else{				
		   System.out.println(name+" Not availablez");
		}
		return 0;
	}

	public int DecrementQuantity(String name) {
		if(menu.available(name)){
			
			if(cItems.containsKey(name)){
				
				if(cItems.get(name)>0 && cItems.get(name)!=null)	{
					
					int temp=cItems.get(name);
					cItems.put(name, --temp);
					System.out.println(cItems);
					System.out.println("Successfully decremented val of "+name+": "+temp);
					return temp;
				}
			}
			else {
				System.out.println(" removed from cart");
				System.out.println(cItems.get(name));
			}

		}
		else{				
		   System.out.println(name+" Not availablez");
		}
		return 0;
		
		
	}
	
	
	public int C_itemQuantity(String name) 
	{
		System.out.println(cItems.get(name));
		return cItems.get(name);
	}
	
	
	public void remItem(String name)//remove item
	{
		cItems.remove(name);
	}
	
	public boolean isEmpty()
	{
		return cItems.isEmpty();
	}
	
	public void clearCart()
	{
		cItems.clear();
	}
	 
	public int CartSize()
	{
		return cItems.size();
	}
	
	public int totalPrice()
	{	
		if(cItems.isEmpty()) 
		{
			System.out.println("Cart is Empty");
			return 0;
		}
		
		int Tprice=0;
		for (Map.Entry<String, Integer> crtEntry : cItems.entrySet()) 
		{
			String name=crtEntry.getKey();
			int quantity=crtEntry.getValue();
			int itemcost=menu.getPrice(name);//using Menu's Obj we get the prices of diff item
			
			Tprice= Tprice + (itemcost*quantity);
		}
		
		
		return Tprice;
	}
	
	
	public int Discout(String promo)
	{					
		if(promo.equals("20%")/*EqualsTo(=) wont work here as intended because of promo being string*/) {System.out.println("Accessed20"); return (totalPrice()-(totalPrice()*20/100));}
							
		if(promo.equals("30%")) {System.out.println("Accessed30"); return (totalPrice()-(totalPrice()*30/100));}
							
		if(promo.equals("40%")) {System.out.println("Accessed40"); return (totalPrice()-(totalPrice()*40/100));}
							
		return totalPrice();
	}
	
	
	
	
	
}
