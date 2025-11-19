package HashMap;

public class Product implements Comparable<Product>{
    private String id;
    private String brand;
    private String productName;
    private double price;

    public Product(String id, String brand, String productName, double price) {
        this.id = id;
        this.brand = brand;
        this.productName = productName;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", brand='" + brand + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product other) {
       // return Double.compare(other.price, this.price);
        return this.brand.compareTo(other.brand);
    }

}
