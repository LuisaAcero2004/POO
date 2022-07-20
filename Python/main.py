
from pip import main
from car import Car
from uberx import UberX
from driver import Driver
from uberpool import UberPool


if __name__ =="__main__":
    driver = Driver("Luisa Acero",12345680)
    car = UberX("ASD960",driver,"Chevrolet","Aveo")
    print(vars(car))
    print(vars(car.driver))
    
    driver2 = Driver("Sandra Martinez",879200054)
    car2 = UberPool("ZXC096", driver2,"Hyundai","i5")
    print(vars(car2))
    print(vars(car2.driver))