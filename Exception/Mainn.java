import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Mainn{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        List<String> coffees = new ArrayList<String>();
        
        User<String> c1 = new User<String>();
        c1.setCoffeename("Iced Coffee");
        c1.setCoffeeprice("99.0");
        coffees.add(c1.getCoffeename() + " is for only " + c1.getCoffeeprice());

        User<String> c2 = new User<String>();
        c2.setCoffeename("Americano");
        c2.setCoffeeprice("99.0");
        coffees.add(c1.getCoffeename() + " is for only " + c1.getCoffeeprice());

        User<String> c3 = new User<String>();
        c1.setCoffeename("Capuccino");
        c1.setCoffeeprice("99.0");
        coffees.add(c1.getCoffeename() + " is for only " + c1.getCoffeeprice());

        User<String> c4 = new User<String>();
        c1.setCoffeename("Milky Way");
        c1.setCoffeeprice("99.0");
        coffees.add(c1.getCoffeename() + " is for only " + c1.getCoffeeprice());



        System.out.println("Enter Coffee index: ");
        System.out.println("We only have 4 coffees available for today ~ :3");
        Integer user = input.nextInt();

        try{
            if(user < 0){
                input.close();
                throw new CoffeeException("No negative numbers please ~");
            }
            if(user > 4){
                input.close();
                throw new CoffeeException("Index should be in 0-3");
            }

            System.out.println("COFFEE: " + user);
            System.out.println(coffees.get(user));

        }
        catch(CoffeeException e){
            System.out.println(e.getMessage());
        }

        input.close();

    }
}