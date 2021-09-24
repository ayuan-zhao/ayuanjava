package edu.ayuan.basic.model.oobdesign;

public class God {
    /**
     * simulate a selling action.
     */
    public static void main(String[] args) {
        // 1. create a salesman
        Salesman salesman = new Salesman();
        salesman.name = "Peter";
        salesman.age = 30;
        // 2. create some products.
        Product p1 = new Product();
        p1.ID = "acddd";
        p1.productName = "Macbook";
        Product p2 = new Product();
        p2.ID = "dfdsfd";
        p2.productName = "iphone";

        // 3. this salesman is selling products.
        // 1st transaction.
        Sale saleObject = new Sale();
        saleObject.salesman = salesman;
        saleObject.product = p1;
        saleObject.sale();

        // 2nd trans
        saleObject.product = p2;
        saleObject.sale();
    }
}
