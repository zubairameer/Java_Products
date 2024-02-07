
public class Drink extends Product {

	private Boolean soda;
	private int price;
	
	public Drink()
	{
		
	}
	
	public Drink(Boolean soda, Boolean takeAway, String name)
	{
		super(takeAway,name);
		this.soda = soda;
	}
	
	public Boolean getSoda()
	{
		return soda;
	}
	
	public void setSoda(Boolean soda)
	{
		this.soda = soda;
	}
	
	public int getPrice()
	{
		if(this.soda == true)
		{
			return price = 20;
		}
		else
		{
			return price;
		}
	}
	
	public String getSize()
	{
		if(price > 10)
		{
			return "Regular";
		}
		else
			return "Large";
	}
	
	@Override
	public String toString()
	{
		return "[Drink] Price = " + price;
	}
	
}