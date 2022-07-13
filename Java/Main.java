class Main {

    public static void main(String[] args) {
        //Create new object
        Car car = new Car();
        car.license = "FIS629";
        car.driver = "Luisa Acero";
        car.passengers = 4;
        car.printDataCar();

        Car car2 = new Car();
        car2.license = "ZXC956";
        car2.driver = "Sandra Martinez";
        car2.passengers = 3;
        car2.printDataCar();
    }
}