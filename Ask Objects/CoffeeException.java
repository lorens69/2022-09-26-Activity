public class CoffeeException extends Exception {

    public CoffeeException(String message){
        super(message);
    }
    
    public String notNumber(){
        return "Only strings can be accepted.";
    }

}