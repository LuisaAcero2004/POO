from pip import main
from car import Car

if __name__ =="__main__":
    car = Car()
    car.license = "ASD960"
    car.driver = "Luisa Acero"
    print(vars(car))
    
    car2 = Car()
    car2.license = "ZXC096"
    car2.driver = "Sandra Martinez"
    print(vars(car2))