class SimpleCalculator implements Calculator{
    @Override
    public void calculateSum(int... numbers){
        int sum=0;
        for(int i=0; i<numbers.length; i++){
            sum += numbers[i];
        }
        System.out.println("Sum of the numbers: "+sum);
    }
}
