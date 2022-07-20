class Main {

    public static void main(String[] args) {
        //Create new object

        Driver driver = new Driver("Luisa Acero",1234567890);
        UberX car = new UberX("FIS629" , driver,"Chevrolet","Aveo");
        car.passengers = 4;
        car.printDataCar();

        Driver driver2 = new Driver("Sandra Martinez", 789456125);
        UberPool car2 = new UberPool("ZXC956", driver2,"Hyundai","i5");
        car2.passengers = 3;
        car2.printDataCar();
    }
}