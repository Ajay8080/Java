/*WAP to input a character and display its opposite case if its a letter otherwise
display a message "Not a  letter". */

public class CharCon{
    public void getChar(char ch){
        if(ch >= 'A' && ch <= 'z'){
            ch -= 32;
            System.out.println("Uppercase to Lowercase is:-  "+ch);
        }
        else if(ch >= 'A' && ch <= 'Z'){
            ch += 32;
            System.out.println("Lowercase to Uppercase is:-  "+ch);
        }
        else{
            System.out.println("Not a letter");
        }
    }
    public static void main(String[] args){
        CharCon character = new CharCon();
        character.getChar('a');
    }
}