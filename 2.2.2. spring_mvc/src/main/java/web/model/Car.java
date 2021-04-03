package web.model;

public class Car {
    private String carBrand;
    private String theModelOfCar;
    private int yearOfIssue;

    public Car() {
    }

    public Car(String carBrand, String theModelOfCar, int yearOfIssue) {
        this.carBrand = carBrand;
        this.theModelOfCar = theModelOfCar;
        this.yearOfIssue = yearOfIssue;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String getTheModelOfCar() {
        return theModelOfCar;
    }

    public void setTheModelOfCar(String theModelOfCar) {
        this.theModelOfCar = theModelOfCar;
    }

    public int getYearOfIssue() {
        return yearOfIssue;
    }

    public void setYearOfIssue(int yearOfIssue) {
        this.yearOfIssue = yearOfIssue;
    }
}
