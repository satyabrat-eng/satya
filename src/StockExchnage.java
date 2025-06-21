import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchnage implements Subject{
    private float price = 100;
    private Random random;
    private List<Observer> observers;

    public StockExchnage(){
        random=new Random();
        observers=new ArrayList<>();
    }

    public void start(){
        while (true){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

       //generate the next S(n+1) random stock price
            price=price + 2 * random.nextFloat()-1;
            notifyAllObserver();
            System.out.println(price);
        }
    }

    @Override
    public void addObserver(Observer o) {
        this.observers.add(o);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer: observers){
            observer.update(price);
        }
    }
}
