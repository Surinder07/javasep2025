package testAssignment;

import java.util.Objects;

public class Products {
    private String id;
    private String name;
    private String brand;
    private Double price;

    public Products(String id, String name, String brand, Double price) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Objects.equals(id, products.id) && Objects.equals(name, products.name) && Objects.equals(brand, products.brand) && Objects.equals(price, products.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, brand, price);
    }
}
