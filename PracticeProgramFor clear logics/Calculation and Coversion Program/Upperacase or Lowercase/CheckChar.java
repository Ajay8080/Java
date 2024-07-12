/*WAP to store a character, check and display whether it is uppercase letter
or lowercase letter or a digit.Display teh character alongwith suitable message.
[Take a parametrized method which takes input of charcter and performs above
task] */

public class CheckChar{
    public void getChar(char ch){
    if (ch >= 'A' && ch <= 'Z' ){
        System.out.println(ch+" is an uppercase letter");
    }
    else if(ch >= 'a' && ch <= 'z'){
        System.out.println(ch+" is a Lowercase letter");
    }
    else if(ch >= '0' && ch <= '9'){
        System.out.println(ch+" is a digit");
    }
    else{
        System.out.println(ch+" is a special character");
    }

    }
    public static void main(String[] args) {
        CheckChar c = new CheckChar();
        c.getChar('0');
    }
}