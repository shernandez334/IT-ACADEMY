package Module2_Patterns2.L2exercise1;

import java.util.HashMap;
import java.util.Map;

public class Stocks {
    Map<String, Double> stockExchange = new HashMap<>(Map.of(
            "Telefonica", 20000.50d,
            "Santander", 15000d,
            "Endesa", 8900.32d,
            "Caixa", 5400d));

    public Map getStocksMadrid(){
        return this.stockExchange;
    }

    public double showValues(String nameCompany){
        return this.stockExchange.get(nameCompany);
    }
    public void changeStockValue(String nameCompany, double valueModifier){
        double newValue = this.stockExchange.get(nameCompany) + valueModifier;
        stockExchange.replace(nameCompany, newValue);
    }
}
