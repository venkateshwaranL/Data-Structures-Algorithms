package in.org.exampleclass;

public class Laptop {
    private int price;
    private int ram;
    private boolean touch;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public boolean isTouch() {
        return touch;
    }

    public void setTouch(boolean touch) {
        this.touch = touch;
    }
    @Override
    public String toString(){
        return " "+this.price+" "+this.ram+" "+this.touch;
    }

    public Laptop(int price, int ram, boolean touch) {
        this.price=price;
        this.ram=ram;
        this.touch=touch;
    }
}