package Helper;

public class Product {
    private String productName;
    private double productPrice;
    private String productId;
    private Boolean productOutofStock;
    private String productImageURL;

    public String getProductImageURL() {
        return productImageURL;
    }

    public void setProductImageURL(String productImageURL) {
        this.productImageURL = productImageURL;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public Product(){

    }
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Product(String productName,
                   int productQuantity,
                   String productId,
                   Boolean productOutofStock){
       this.productName = productName;
       this.productPrice = productQuantity;
       this.productId = productId;
       this.productOutofStock = productOutofStock;
   }

    public Boolean getProductOutofStock() {
        return productOutofStock;
    }

    public void setProductOutofStock(Boolean productOutofStock) {
        this.productOutofStock = productOutofStock;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                ", productId='" + productId + '\'' +
                ", productOutofStock=" + productOutofStock +
                ", productImageURL='" + productImageURL + '\'' +
                '}';
    }
}
