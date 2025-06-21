
public class SellStockListener implements Observer{

    @Override
    public void update(float price) {
        if(price>105){
            System.out.println("Selling as Stock price is high");
        }
    }
}
