from payment import Payment

class Card(Payment):
    
    number = int
    cvv = int
    date = str