package machine;

public class ProdsList {
    private String prodName;
    private int quantity;
    private int prodPrice;

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public int getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(int prodPrice) {
        this.prodPrice = prodPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public ProdsList(String prodName, int quantity, int prodPrice) {
        this.prodName = prodName;
        this.quantity = quantity;
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return "ProdsList{" + "prodName=" + prodName + ", prodPrice=" + prodPrice + '}';
    }
}
