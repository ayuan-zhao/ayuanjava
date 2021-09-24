package edu.ayuan.basic.model.oobdesign;

public class Sale {
    Salesman salesman;
    Product product;

    /**
     * selling products.
     */
    public void sale() {
        System.out.println("Salesman " + this.salesman.name + " sells " + this.product.productName + "(" + this.product.ID + ")");
    }
}
