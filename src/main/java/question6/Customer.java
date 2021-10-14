package question6;

import java.util.Arrays;

public abstract class Customer extends Person{
    private String clothingItems[];
    private enumerationSize size;

    Customer(String name) {
        super(name);
    }


    public Customer(String name, String[] clothingItems, enumerationSize size) {
        super(name);
        this.clothingItems = clothingItems;
        this.size=size;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "clothingItems=" + Arrays.toString(clothingItems) +
                ", size=" + size +
                '}';
    }
}
