/*An Electricity Company charges their consumers according to the
units consumed per month
According to the given traffic:
Units Consumed Charges
Up to 100 units Rs. 2 per unit
More than 100 units and up to 200 units Rs. 1.80 per unit
More than 200 units Rs.1.50 per unit
In addition to the above, every consumer has to pay Rs.200 as Service Charge
per month. Write a program to input the amount of units consumed and
calculate the total charges payable (Bill) by the consumer.*/

public class Bill{
	public static void main(String[] args){
	
		double unit = 400;
		double bill;

	if(100<=unit)
	{	
		bill=2*unit+200;
	}
	else if(unit>100 && unit<=200)
	{	
		bill=1.80*unit+200;
	}
	else 
	{	
		bill=1.50*unit+200;
	}
		System.out.println("Bill is "+bill);
	}
}