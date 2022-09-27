import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class secondact_HashMap{

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        Character choice, clear;
    
        Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();
        


        while(true){
            System.out.println("SELECT BELOW~");
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


            switch(choice){
                case 'a':
                    System.out.println("ONLY COMPOSITE NUMBERS ARE ACCEPTED!");
                    System.out.print("Enter the number to add: ");
                    int add = input.nextInt();
                    System.out.println("");

                    int j = add/2;
                    int isPrime = 0;

                    if(add == 0 || add == 1){
                        System.out.print("Enter the key: ");
                        int key = input.nextInt();
                        System.out.println("");

                        hashmap.put(key, add);
                        System.out.println(key + ";" + add + " is added to the HashMap successfully!");

                    }
                    else{
                        for(int i = 2; i <= j; i++){
                            if(add%i == 0){
                                System.out.print("Enter the key: ");
                                int key = input.nextInt();
                                System.out.println("");

                                hashmap.put(key, add);
                                System.out.println(key + ";" + add + " is successfully added to the HashMap!");
                                isPrime = 1;
                                break;
                            }
                        }
                        if(isPrime == 0){
                            System.out.println("It is a prime number, please input only composite numbers.");
                        }
                    }

                    break;
                case 'b':
                    System.out.print("Enter the key to remove: ");
                    int remove = input.nextInt();
                    System.out.println("");

                    if(hashmap.containsKey(remove)){
                        System.out.println(remove + ";" + hashmap.get(remove) + " is removed successfully!");
                        hashmap.remove(remove);
                    }

                    break;

                case 'c':
                    
                    System.out.println("Representing...");
                    System.out.println("The HashMap~");

                    hashmap.entrySet().forEach(entry -> {
                        System.out.println(entry.getKey() + ";" + entry.getValue());
                    });

                    
                    System.out.println(" ");

                    break;

                case 'd':

                    System.out.print("Are you sure?(y/n): ");
                    clear = input.next().charAt(0);
                    clear = Character.toLowerCase(clear);
                    switch(clear){
                        case 'y':
                            
                            hashmap.clear();
                            System.out.println("All Cleared Succesfully!");
                            System.out.println(" ");
                            break;
                        case 'n':
                            System.out.println("Failed Succesfully~");
                            break;
                    }
                    break;
                case 'e':
                    input.close();
                    System.exit(0);
                default:
                    System.out.println("Oops ~ watch your typing~");

            
            }

        }
    }
}