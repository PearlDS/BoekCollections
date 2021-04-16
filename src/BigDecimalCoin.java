import java.math.BigDecimal;

public enum BigDecimalCoin {

    ONE_CENT(new BigDecimal(0.01)), TWO_CENT(new BigDecimal(0.02)), FIVE_CENT(new BigDecimal(0.05)), TEN_CENT(new BigDecimal(0.10)), TWENTY_CENT(new BigDecimal(0.20)), FIFTY_CENT(new BigDecimal(0.50)), ONE_EURO(new BigDecimal(1.00)), TWO_EURO(new BigDecimal(2.00));


    private BigDecimal bigDecimal;


    BigDecimalCoin(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }
}
