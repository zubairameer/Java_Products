//This class contains products from a pizza and burger restaurant
public abstract class Product {

	private Boolean takeAway;
	private String prod_name;

	
	protected Product()
	{
		
	}
	
	protected Product(Boolean takeAway, String prod_name)
	{
		this.prod_name = prod_name;
		this.takeAway = takeAway;
		
	}
	
	public String getName()
	{
		return prod_name;
	}
	
	public void setName(String Name)
	{
		this.prod_name = Name;
	}
	
	public Boolean isTakeAway()
	{
		return takeAway;
	}
	
	public void setTakeAway(boolean takeAway)
	{
		this.takeAway = takeAway;
	}
	
	public abstract int getPrice();
	
	public abstract String getSize();
}