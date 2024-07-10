/*Write a program for the following requirement:
   StudyTable is an object of the class Furniture.
   Provide the operations and data members of your choice.
   Print the details with suitable message. 
   
   Note: In java, methods represents operations / behaviour.
   */


    class Furniture{
      // Attributes / variables
     String ftype;
     String color;
     

     //method/behaviour
    public void showDetails()
    {
        System.out.println("Furniture Type:"+ftype);
    
        System.out.println("Furniture Color:"+color);
        }
        public static void main(String[] args)
        {
            Furniture studyTable=new Furniture();
            studyTable.ftype="Wooden";
               studyTable.color="Brown";
            studyTable.showDetails();
            }

   }