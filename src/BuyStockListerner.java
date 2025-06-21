
public class BuyStockListerner implements Observer{

    @Override
    public void update(float price) {
        if(price<95){
            System.out.println("Buying stock as stock price is low");
        }
    }
}
