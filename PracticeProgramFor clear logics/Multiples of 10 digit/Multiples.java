class Multiples{

    public static void main(String[] args) {
        int num = 32;
        

        if(num%10<5){

            System.out.println("less than 5 ="+((num/10))*10);
        }
        else{

            System.out.println(((num/10)+1)*10);
        }
    }
}