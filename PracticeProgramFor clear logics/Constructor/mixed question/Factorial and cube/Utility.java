class Utility{
    public static void findFact(int num){
        int fact = 1;
for(int i=1; i<=num;i++){
    fact *= i;
}        
System.out.println("factorial: "+fact);
    }

    public static void findCube(int num){
        System.out.println("Cube: "+(num*num*num));
    }
}