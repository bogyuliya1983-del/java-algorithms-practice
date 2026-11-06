package practice;

public class Car {
    private String name;
    private double price;
    private int year;
    private long mileKm;
    private int numberOfOwners;

    public Car(String name, double price, int year, long mileKm, int numberOfOwners) {
        this.name = name;
        this.price = price;
        this.year = year;
        this.mileKm = mileKm;
        this.numberOfOwners = numberOfOwners;
    }

    public String getName() { return name; }
    public double getPrice() { return price; }
    public int getYear() { return year; }
    public long getMileKm() { return mileKm; }
    public int getNumberOfOwners() { return numberOfOwners; }

    @Override
    public String toString() {
        return "авто: " + getName() +
                ", год выпуска: " + getYear() +
                ", пробег: " + getMileKm() +
                ", цена: " + getPrice() +
                ", количество владельцев: " + getNumberOfOwners();
    }
}
