package Module2_Patterns2.L2exercise1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class BlackRock {
    List<StockAgency> stockAgencies = new ArrayList<>();
    Stocks stockExchangeMadrid = new Stocks();
    Map stocksMadrid = stockExchangeMadrid.getStocksMadrid();

    public void addAgency(StockAgency stockAgency){
        this.stockAgencies.add(stockAgency);
    }

    public void notifyStockChanges(String nameCompany, double valueModifier){
        stockExchangeMadrid.changeStockValue(nameCompany, valueModifier);
        for (StockAgency a: stockAgencies){
            a.notifyChanges(stocksMadrid, nameCompany, valueModifier);
        }
    }
}
