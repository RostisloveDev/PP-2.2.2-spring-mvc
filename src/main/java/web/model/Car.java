package web.model;

public class Car {
    private String model;
    private int owners;
    private int mileage;

    public Car() {}

    public Car(String model, int owners, int mileage) {
        this.model = model;
        this.owners = owners;
        this.mileage = mileage;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getOwners() {
        return owners;
    }

    public void setOwners(int owners) {
        this.owners = owners;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }
}
