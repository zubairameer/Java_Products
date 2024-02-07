
public class Burger extends Product{
	
	private int Price;
	Boolean Fries;
	
	public Burger()
	{
		
	}
	
	public Burger(Boolean Fries,int price, Boolean takeAway, String Name)
	{
		super(takeAway, Name);
		this.Price = price;
		this.Fries = Fries;
	}
	
	public int getPrice()
	{
		return Price;
	}
	
	public void setPrice(int price)
	{
		this.Price = price;
	}
	
	public boolean Total(Product product)
	{
		if(Fries == false)
		{
			return this.Price == product.getPrice();
		}
		else
			return this.Price == product.getPrice() + 20;
		
	}
	
	public String getSize()
	{
		if(Price <= 100)
		{
			return "Regular";
		}
		else
			return "Large";
	}
	
	@Override
	public String toString()
	{
		return "[Burger] Price = " + Price;
	}
	
}