package entities;

public class PriceProducts {
    private Double Price;
    private Integer quantity;

    public PriceProducts(Double price, Integer quantity) {
        Price = price;
        this.quantity = quantity;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double valueAmount(){
        return getPrice() * getQuantity();
    }
}
