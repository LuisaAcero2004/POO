class Main {

    public static void main(String[] args) {
        //Create new object
        Account driver = new Account("Luisa Acero",1234567890);
        Car car = new Car("FIS629" , driver);
        car.passengers = 4;
        car.printDataCar();

        Account driver2 = new Account("Sandra Martinez", 789456125);
        Car car2 = new Car("ZXC956", driver2);
        car2.passengers = 3;
        car2.printDataCar();
    }
}