package edu.rit.Unit2.models.enums;

public enum BoilingPointEnum {

    CELSIUS("C", 100),
    FAHRENHEIT("F", 212),
    KELVIN("K", 373.5);

    private final String symbol;
    private final double boilingPoint;

    BoilingPointEnum(String symbol, double boilingPoint) {
        this.symbol = symbol;
        this.boilingPoint = boilingPoint;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getBoilingPoint() {
        return boilingPoint;
    }
}
