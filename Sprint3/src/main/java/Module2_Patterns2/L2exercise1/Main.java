package Module2_Patterns2.L2exercise1;

public class Main {
    public static void main(String[] args){
        BlackRock blackRock = new BlackRock();
        blackRock.addAgency(new StockAgency("Stock Exchange of New York"));
        blackRock.addAgency(new StockAgency("Stock Exchange of Barcelona"));
        blackRock.addAgency(new StockAgency("Stock Exchange of Madrid"));

        blackRock.notifyStockChanges("Telefonica", -0.3);
        blackRock.notifyStockChanges("Santander", 0.3);
    }
}
