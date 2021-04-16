import java.math.BigDecimal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class DeelElf {
    public static void main(String[] args) {

    // Normal
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


        //BigDecimal

        Map<BigDecimalCoin, Integer> portemoneeBD = new LinkedHashMap<>();

        portemoneeBD.put(BigDecimalCoin.FIFTY_CENT, 21);
        portemoneeBD.put(BigDecimalCoin.ONE_CENT, 37);
        portemoneeBD.put(BigDecimalCoin.FIVE_CENT,47);
        portemoneeBD.put(BigDecimalCoin.ONE_CENT, 12);

        BigDecimal moneyBD = BigDecimal.valueOf(0.0);
        for (BigDecimalCoin coin : portemoneeBD.keySet()){

            System.out.println("For this coin: "+coin.name()+" I have "+ portemoneeBD.get(coin)+ " pieces.");
            moneyBD=moneyBD.add( BigDecimal.valueOf(portemoneeBD.get(coin)*coin.getBigDecimal().doubleValue()));
        }

        System.out.println("I have $ "+ moneyBD.doubleValue());


    }
}
