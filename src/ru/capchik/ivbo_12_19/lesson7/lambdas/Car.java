package ru.capchik.ivbo_12_19.lesson7.lambdas;

public class Car {
    private final String brand;
    private final String model;
    private final int year;
    private double mileage;

    public Car(String brand, String model, int year, double mileage) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }


    public double getMileage() {
        return mileage;
    }

    public void addMileage(double mileage) {
        this.mileage += Math.abs(mileage);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", mileage=" + mileage +
                '}';
    }
}
