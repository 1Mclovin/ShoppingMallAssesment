package question6;

public enum enumerationSize {

    S("Small"),M("Medium"),L("Large"),XL("Extra-Large");

    private String size;

    enumerationSize(String size){
        this.size=size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }


}
