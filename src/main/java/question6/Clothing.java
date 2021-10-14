package question6;

public class Clothing {
    private String description;
    private double price;
    private enumerationSize size;



    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

//    public enumerationSize getSize() {
//        return size;
//    }


    public enumerationSize getSize() {
        return size;
    }

    public void setSize(enumerationSize size) {
        this.size = size;
    }

    public Clothing(String description, enumerationSize size, double price){
        super();
        this.description = description;
        this.size=size;
        this.price=price;

    }

    @Override
    public String toString() {
        return "Clothing{" +
                "description='" + description + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }
}
