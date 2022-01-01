package MoneyCalculator.model;


public class Money {
    private String code;
    private String symbol;
    private String name;
    
    public Money(String code, String name, String symbol){
        this.code = code;
        this.name = name;
        this.symbol = symbol;
    }
    
    public String getSymbol(){
        return this.symbol;
    }
    
    public String getCode(){
        return this.code;
    }
    
    public String getName(){
        return this.name;
    }
    
    @Override
    public String toString(){
        return this.name;
    }
    
}
