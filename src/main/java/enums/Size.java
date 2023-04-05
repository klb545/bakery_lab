package enums;

public enum Size {
    SMALL(1),
    MEDIUM(2),
    LARGE(3);


    private int sizeInteger;
    Size(int sizeInteger){
        this.sizeInteger = sizeInteger;
    }
    public int getSizeInteger() {
        return this.sizeInteger;
    }

}
