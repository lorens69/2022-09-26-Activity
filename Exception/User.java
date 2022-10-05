public class User<VariableType>{
    
    private String Coffeename;
    private String Coffeeprice;
    
    public void setCoffeeprice(String coffeeprice) {
        Coffeeprice = coffeeprice;
    }

    public String getCoffeeprice() {
        return Coffeeprice;
    }
    
    public void setCoffeename(String coffeename) {
        Coffeename = coffeename;
    }

    public String getCoffeename() {
        return Coffeename;
    }
}
