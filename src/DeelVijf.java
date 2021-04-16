import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class DeelVijf {
    public static void main(String[] args) {

       // Queue<BurgerOrder> burgerOrderList = new PriorityQueue<>(Comparator.comparing());

        Comparator<BurgerOrder> comparator = (BurgerOrder b1, BurgerOrder b2) -> b1.getNumber() - b2.getNumber();
        PriorityQueue<BurgerOrder> burgerOrderList = new PriorityQueue<>(new BurgerNumberComparator());
        burgerOrderList.offer(new BurgerOrder("Big Cheesy",5));
        burgerOrderList.offer(new BurgerOrder("Big Double Cream",1));
        burgerOrderList.offer(new BurgerOrder("The Perfect",3));
        burgerOrderList.offer(new BurgerOrder("The Perfect",4));
        burgerOrderList.offer(new BurgerOrder("The Perfect",7));

       while (!burgerOrderList.isEmpty()){
           System.out.println(burgerOrderList.poll());
       }


    }
}
