package question6;

public abstract class Customer extends Person{
    private String clothingItems[];
    private String size;

    Customer(String name) {
        super(name);
    }


    public Customer(String name, String[] clothingItems, String size) {
        super(name);
        this.clothingItems = clothingItems;
        this.size=size;
    }
}
