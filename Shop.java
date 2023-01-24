class Shop
{

static void buy(String item, double price,String brand)
{

System.out.println("executing buy start");
System.out.println("item:"+item);
System.out.println("price:"+price);
System.out.println("brand:"+brand);


	if(price>1000)
	{
	System.out.println("costly");
	}
	else if (price<500)
	{
		System.out.println("ok");
	}
	
	System.out.println("buying stoped");
}




static void exchange(String item,String itemBrand`)
{
	System.out.println("excueting exchange start");
	System.out.println("item:"+item);
	System.out.println("brand:"+itemBrand);
	
	System.out.println("exchange stoped");
}

}
