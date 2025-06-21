//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        StockExchnage stockExchnage=new StockExchnage();
        stockExchnage.addObserver(new BuyStockListerner());
        stockExchnage.addObserver(new SellStockListener());
        stockExchnage.start();

    }
}