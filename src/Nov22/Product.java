package Nov22;

public class Product {

         private String id;
        private String name;
        private String brand;
        private double price;


        public Product(String id, String name, String brand, double price) {
            this.id = id;
            this.name = name;
            this.brand = brand;
            this.price = price;
        }

        // Getters
        public String getId() { return id; }
        public String getName() { return name; }
        public String getBrand() { return brand; }
        public double getPrice() { return price; }

        @Override
        public String toString() {
            return id + " - " + name + " - " + brand + " - $" + price;
        }
    }


