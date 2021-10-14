package question6;

public class Manager extends Employee implements Discountable{
    public Manager(String name) {
        super(name);
    }


    @Override
    public double calculateDiscount(Clothing clothing) {
        return 0;
    }
}
