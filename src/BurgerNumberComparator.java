import java.util.Comparator;

public class BurgerNumberComparator implements Comparator<BurgerOrder> {
    @Override
    public int compare(BurgerOrder o1, BurgerOrder o2) {
        return (int) Math.max(o1.getNumber(), o2.getNumber());
    }
}
