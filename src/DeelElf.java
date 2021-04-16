import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DeelElf {
    public static void main(String[] args) {


        Map<Coin, Integer> portemonee = new LinkedHashMap<>();

        portemonee.put(Coin.FIFTY_CENT, 21);
        portemonee.put(Coin.ONE_CENT, 37);
        portemonee.put(Coin.FIVE_CENT,47);
        portemonee.put(Coin.ONE_CENT, 12);

        double money = 0;
        for (Coin coin : portemonee.keySet()){

            System.out.println("For this coin: "+coin.name()+" I have "+ portemonee.get(coin)+ " pieces.");
            money+= portemonee.get(coin)*coin.getV();
        }

        System.out.println("I have $ "+ money);

    }
}
