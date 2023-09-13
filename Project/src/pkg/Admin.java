	package pkg;
	
	import java.util.List;
	
	public class Admin 
	{
		public Admin() 
		{
			uname=null;passwor=null;
		}
		
		private String uname;
		private String passwor;

		
		public String getUname() {
			return uname;
		}



		public void setUname(String uname) {
			this.uname = uname;
		}



		public String getPasswor() {
			return passwor;
		}



		public void setPasswor(String passwor) {
			this.passwor = passwor;
		}
		

		Menu M=new Menu();
		Admin(Menu M)
		{
			this.M=M;
		}
		
		
		
		
		
		//(item)	Add			/		Update		/		Remove
		
		void addItem(String name,int price){		M.addItem(name, price);	}
		
		void updItem(String name,int price){		M.update(name, price);	}
		
		void RemoveItem(String name){		M.remItem(name);	}
		
		
		protected void getItems()
		{
			System.out.println("Menu: "+M.getItems());
		}
		
		protected void viewOrder() 
		{
			
			
		}
		
		
		
		
	}
