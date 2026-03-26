package machine;

public class ProdsList {
    private String prodName;
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

    public ProdsList(String prodName, int prodPrice) {
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return "ProdsList{" + "prodName=" + prodName + ", prodPrice=" + prodPrice + '}';
    }
}
