class Main {

    public static void main(String[] args) {
        //Create new object

        Driver driver = new Driver("Luisa Acero",1234567890);
        UberX uberX = new UberX("FIS629" , driver,"Chevrolet","Aveo");
        uberX.setPassengers(1);
        uberX.printDataCar();

        Driver driver2 = new Driver("Sandra Martinez", 789456125);
        UberPool uberPool = new UberPool("ZXC956", driver2,"Hyundai","i5");
        uberPool.printDataCar();

    }
}