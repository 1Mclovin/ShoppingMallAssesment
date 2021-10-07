package question6;

public class Clothing extends Person{
    private String description;
    private double price;
    private String size;



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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public Clothing(String description, String size, double price){
        super();
        this.description = description;
        this.size=size;
        this.price=price;

    }

}
