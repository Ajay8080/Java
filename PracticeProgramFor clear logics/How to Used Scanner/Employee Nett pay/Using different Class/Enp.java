public class Enp {
    int basicPay;
    public void getbasicPay(int basicPay){
        this.basicPay = basicPay;
    }
    public void get1(){
        double Dallowance = 0.30 * basicPay;
        System.out.println("Dearness Allowance: "+Dallowance);
    }
    public void get2(){
        double Hallowance = 0.15 * basicPay;
        System.out.println("House Rent Allowance: "+Hallowance);
    }
    public void get3(){
        double Pf = 0.125 * basicPay;
        System.out.println("Provident Fund: "+Pf);
    }
    public void get4(){
        Enp e1 = new Enp();
        e1.get1();
        e1.get2();
        double Grosspay = basicPay + Dallowance + Hallowance;
        System.out.println("Gross Pay: "+Grosspay);
    }
    public void get5(){
        double Nettpay = Grosspay - Pf;
        System.out.println("NettPay: "+Nettpay);

    }
}
