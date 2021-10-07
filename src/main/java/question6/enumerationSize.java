package question6;

public interface enumerationSize {

    S("Small"),M("Medium"),L("Large"),XL("Extra-Large");

    private String size;

    enumerationSize(String size){
        this.size=size;
    }
}
