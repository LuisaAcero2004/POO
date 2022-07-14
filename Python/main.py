from pip import main
from car import Car
from account import Account

if __name__ =="__main__":
    driver = Account("Luisa Acero",12345680)
    car = Car("ASD960",driver)
    print(vars(car))
    print(vars(car.driver))
    
    driver2 = Account("Sandra Martinez",879200054)
    car2 = Car("ZXC096", driver2)
    print(vars(car2))
    print(vars(car2.driver))