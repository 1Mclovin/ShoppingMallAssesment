package question6;

public class Student extends Customer implements Discountable{

private long studentId;
private final double DISCOUNT = 0.05;

    Student(String name) {
        super(name);
    }

    public Student(String name, String[] clothingItems, enumerationSize size) {
        super(name, clothingItems, size);
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

    @Override
    public double calculateDiscount(Clothing clothing) {
        return 0;
    }
}
