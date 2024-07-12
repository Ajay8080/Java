/*WAP using suitable input stream to input hours and minutes,convert
hours to minutes and minutes to hours.Display with suitable message.
 */

 public class TimeCon{
    public static void Time(int hour, int min){
        System.out.println("Hour to minute "+hour *60);
        System.out.println("Minutes to hour "+minute/60);
    }
    public static void main(String[] args) {
        
        Time(1,60);
    }
 }