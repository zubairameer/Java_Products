
public class Main {
	
	public static void main (String [] args)
	{
		Burger b1 = new Burger(true,100,true,"Jo");
		Drink d1 = new Drink(true,true, "Coke");
		//System.out.println(d1);
		
		//System.out.println(b1 + b1.getName() + b1.getSize());
		
		Burger b2 = new Burger(true,200,true,"Yo");
		Burger b3 = new Burger(false,100,true,"Po");
		Burger b4 = new Burger(true,300,false,"Do");
		
		Drink d2 = new Drink(false,true, "Spr");
		Drink d3= new Drink(true,true, "Fan");
		Drink d4= new Drink(true,false, "Wat");
		
		Product foods[] = new Product[8];
		foods[0] = b1;
		foods[1] = d1;
		foods[2] = b2;
		foods[3] = d2;
		foods[4] = b3;
		foods[5] = d3;
		foods[6] = b4;
		foods[7] = d4;
		
		for (int k = 0; k<8; k++)
		{
			System.out.println("\n foods[" + k + "]: "+foods[k]+" with Price of: "+foods[k].getPrice()+" and with size: "+foods[k].getSize()+"");
		}
		
	
	}
}