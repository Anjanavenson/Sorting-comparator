public class Laptop {
    int price;
    int ram;
    boolean touch;
    public String toString(){
        return " : " + this.price + " : " + this.ram + " : " + this.touch;
    }
    public Laptop( int price, int ram, boolean touch) {
        this.price = price;
        this.ram = ram;
        this.touch = touch;
        
    }
}
