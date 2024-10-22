package Task3;

class Car {
    private String brand;
    private String model;
    private int year;

    Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void displayCarDetails() {
        System.out.println("{\n" + "Brand :" + brand + "\n" + "Model :" + model + "\n" + "Year :" + this.year + "\n}");
    }

}
