class Fish{
	static void sell(double price){
	
		if (price==0)
		
		{
		return;
		}
		
		
		else if (price>500 && price<1000)
		{
			System.out.println("i will not buy");
		}
		
		else if (price==80)
		{
			System.out.println("i will buy");
		}
		
		else if (price>80&& price<500)
		{
			System.out.println("i will not buy");
		}
		
		else if (price>1000)
		{
			System.out.println("i will not eat wish only");
		}
		}
		static void cook(String fish,String[] ingredents)
		{
			if (ingredents== null)
			{
				return;
			}
			
			else if (fish==null)
			{
		        return;
			}
			for (int i=0;i<ingredents.length;i++)
			{
				System.out.println("ingredents"+ingredents[i]);
			}
		}
			
		static void die(int year,int month,int date){
			
			if (year<2000|year>2023)
			{
			return;
			}
			
			else if (month>12)
			{
				return;
			}
			else if(month>31)
			{
				return;
			}
			
			else if (year<0|month<0|date<0)
			{
				return;
			}
			else 
			{
				System.out.println("Fish can be consumed");
			}
		}
	


}