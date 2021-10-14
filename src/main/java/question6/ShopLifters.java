package question6;

public abstract class ShopLifters extends Person implements Discountable{

    @Override
    public double calculateDiscount(Clothing clothing) {
        return 0;
    }
}
