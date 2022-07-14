import string
from account import Account

class Car:
    id = int
    license = str
    driver = Account("",0)
    passengers = int
    
    def __init__(self,license, driver):
        self.license = license
        self.driver = driver