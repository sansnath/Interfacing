package interfacing;

public class Invoice implements Pembayaran {
    private String productName;
    private int quantity;
    private int pricePerItem;

    public Invoice(String productName, int quantity, int pricePerItem) {
        this.productName = productName;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }

    public double getPayableAmount() {
        return quantity * pricePerItem;
    }

    public double getPrice() {
        return quantity * pricePerItem;
    }

    public String toString() {
        return "\n\nProduct: " + productName + "\nQuantity: " + quantity + "\nPrice per Item: $" + pricePerItem;
    }

}
