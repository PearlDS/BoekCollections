public enum Coin {
    ONE_CENT(0.01), TWO_CENT(0.02), FIVE_CENT(0.05), TEN_CENT(0.10), TWENTY_CENT(0.20), FIFTY_CENT(0.50), ONE_EURO(1.00), TWO_EURO(2.00);


    double v;

    Coin(double v) {
        this.v = v;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }
}
