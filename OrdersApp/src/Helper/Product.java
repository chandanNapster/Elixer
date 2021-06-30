package Helper;

public class Product {
    private String productName;
    private int productQuantity;
    private String productId;
    private Boolean productOutofStock;

   public Product(String productName,
                  int productQuantity,
                  String productId,
                  Boolean productOutofStock){
       this.productName = productName;
       this.productQuantity = productQuantity;
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
        return "Product{" + "\n"+
                "productName='" + productName + '\'' + "\n"+
                ", productQuantity=" + productQuantity + "\n"+
                ", productId='" + productId + '\'' +
                '}';
    }
}
