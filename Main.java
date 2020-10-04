import java.util.Scanner;
/**
 *This program will name the animal based on user's choices.
 * @author Sevde
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // create a Scanner for user input 
    Scanner input = new Scanner(System.in);
    //ask the user if the animal has feathers 
    System.out.println("Does the animal have feathers? ");
    String feathers = input.nextLine();
    // does the animal have feathers 
    if( feathers.equals ("yes")){
     //can this animal swim
      System.out.println("Does the animal swim?");
     String swim = input.nextLine();
    //does the animal swim
    if(swim.equals ("yes")){
      System.out.println("This is a duck");
    }else
      System.out.println ("This is a hen");
    
  
    }else
    //does the animal have legs
    System.out.println("Does the animal have legs?");
    String legs = input.nextLine();
    if (legs.equals ("yes")){
      System.out.println("This is a lizard");
     
    }else
    //tell the user its a snake
    System.out.println("This is a snake");

  }
}
