/*In Hyderabad logistics and solutions type firms have grown and they all charges 
for parcels as per the following tariff:

Weight Charges
Upto 10 Kg. Rs. 30 per Kg.
For the next 20 Kg. Rs. 20 per Kg.
Above 30 Kg. Rs. 15 per Kg.

Write a program in Java to calculate the charge for a parcel, 
taking the weight of the parcel as an input */

public class Parcel{
    public void getWeight(double wt){
        if(wt<=10){
            double Charges = wt * 30;
            System.out.println("Total charges for the parcel:- "+Charges);
        }
        else if(wt>10 && wt<30){
            double Charges = wt * 20;
            System.out.println("Total charges for the parcel:- "+Charges);
        }
        else{
            double Charges = wt * 15;
            System.out.println("Total charges for the parcel:- "+Charges); 
        }
    }

    public static void main(String[] args){
        Parcel p = new Parcel();
        p.getWeight(78);
    }

}