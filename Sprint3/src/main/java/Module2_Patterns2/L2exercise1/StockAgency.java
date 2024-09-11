package Module2_Patterns2.L2exercise1;

import java.util.Map;

public class StockAgency {
    private String name;

    public StockAgency(String name){
        this.name = name;
    }

    public void notifyChanges(Map stockExchange, String nameCompany, double value){
        String netValue = "";
        if (value > 0){
            netValue = " up " + String.valueOf(value);
        } else {
            netValue = " down " + String.valueOf(value);
        }
        System.out.println("The " + this.name + " has an update on the market.\n" +
                nameCompany + " value went" + netValue + " points.\n" +
                "The current value is: " + stockExchange.get(nameCompany) + "\n");
    }
}
