import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        List<Coffee> listOfCoffee = new ArrayList<Coffee>();

        System.out.println("WELCOME TO COFFEEKNOWSME~");
        System.out.println("BUT FIRST LET ME KNOW HOW MANY COFFEES DO YOU WANT TO ADD");
        System.out.println("");

        try{
            System.out.print("Number of Coffees: ");
            Integer objects = input.nextInt();
            
            if(objects < 0){
                input.close();
                s.close();
                throw new CoffeeException("Your input is negative. Please input positive index.");
            }

            for(int i = 0; i < objects; i++){
                
                System.out.println("");
                System.out.print("Coffee: ");
                String cof = s.nextLine();

                System.out.print("Details: ");
                String cofd = s.nextLine();
    

                listOfCoffee.add(new Coffee(cof, cofd));
            }

            System.out.println("");
            System.out.println("This are the coffees tha you have added!");
            System.out.println("");
            for(Coffee list : listOfCoffee){
                System.out.println("Coffee: " + list.getCoffee() + " (" + "Details: " + list.getDetails() + ")");    
            }
            System.out.println("");
            System.out.println("");

            input.close();
            s.close();

        }
        catch(CoffeeException e){
            System.out.println(e.getMessage());
        }
        catch(InputMismatchException ex){
            System.out.println("ACCEPTED INPUT INTEGERS ONLY");
        }

    }
}