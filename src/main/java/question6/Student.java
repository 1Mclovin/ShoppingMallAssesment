package question6;

public class Student extends Customer implements Discountable{

private long studentId;
private final double DISCOUNT = 0.5;

    public Student(String name, String[] clothingItems, String size) {
        super(name, clothingItems, size);
    }

    @Override
    public double calculateDiscount() {
        return 0;
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }
}
