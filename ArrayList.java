import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ArrayList {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Character choice, clear;
    
        List<Integer> arraylist = new ArrayList<Integer>();

        while(true){
        
            System.out.println("SELECT BELOW!");
            System.out.println("");
            System.out.println("A. Add number");
            System.out.println("B. Remove number");
            System.out.println("C. Display numbers");
            System.out.println("D. Clear number");
            System.out.println("E. Exit");
            System.out.println("");
            System.out.print("YOUR CHOICE: ");
            choice = input.next().charAt(0);
            choice = Character.toLowerCase(choice);
            System.out.println("");
            System.out.println("");


            switch(choice){
                case 'a':
                    System.out.print("Add your number here(strings are not accepted!): ");
                    int add = input.nextInt();
                    System.out.println("");
                    
                    if(add > 0){

                        arraylist.add(add);
                        
                        System.out.println("Your number " + add + " is added to the ArrayList successfully!");
                        break;

                    }
                    else{
                        System.out.println("Failed Succesfully!");
                        break;
                    }

                    
                case 'b':
                    System.out.print("Input number you want to remove here: ");
                    int remove = input.nextInt();
                    System.out.println("");

                    if(arraylist.contains(remove)){
                        arraylist.remove(Integer.valueOf(remove));
                        System.out.println("Number " + remove + " is removed successfully!");
                        break;
                    }
                    
                case 'c':
                    System.out.println("Representing... ");
                    System.out.println("The ArrayList!~");
                    for (Integer number : arraylist){
                        System.out.println(number);
                    }
                    System.out.println(" ");
                    break;

                case 'd':
                    System.out.print("Confirm.(c/n): ");
                    clear = input.next().charAt(0);
                    clear = Character.toLowerCase(clear);
                    switch(clear){
                        case 'c':
                            
                            arraylist.clear();
                            System.out.println("ALl Cleared!");
                            break;
                        case 'n':
                            System.out.println("ArrayList is safe.");
                            break;
                    }
                    break;
                case 'e':
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Watch your typing! ;)");

            
            }

        }
    }
}