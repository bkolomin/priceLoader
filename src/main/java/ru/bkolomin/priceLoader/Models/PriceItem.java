package ru.bkolomin.priceLoader.Models;

public class PriceItem {

    private Integer rowNumber;
    private String comment;
    private String code;
    private String name;
    private Double price;
    private String stock;

    public PriceItem(Integer rowNumber, String comment, String code, String name, Double price, String stock) {
        this.rowNumber = rowNumber;
        this.comment = comment;
        this.code = code;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "PriceItem{" +
                "rowNumber=" + rowNumber +
                ", comment='" + comment + '\'' +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stock='" + stock + '\'' +
                '}';
    }
}
