/*In a competitive
examination, there were 150 questions. One candidate got 80% correct and the
other candidate 72% correct. Write a program to calculate and display the
correct answers each candidate got.  */
class Comp{
    int per;
    int que = 150;
    public void getPer(int per){
        this.per = per;
    }
        public void display(){
            double cAns = (per*que)/100;
            System.out.println("Your correct answers are: "+cAns);
        }
        
}