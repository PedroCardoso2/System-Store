package entities;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private String name;
    private PriceProducts priceProducts;




    public Products(String name, PriceProducts priceProducts) {
        this.name = name;
        this.priceProducts = priceProducts;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PriceProducts getPriceProducts() {
        return priceProducts;
    }

    public void setPriceProducts(PriceProducts priceProducts) {
        this.priceProducts = priceProducts;
    }

    public String toString(){
        return getName() + " --> " + getPriceProducts().valueAmount();
    }


}

