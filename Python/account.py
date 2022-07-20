import string

class Account:
    id = int
    name = str
    document = int
    email = str
    password = string
    
    def __init__(self, name, document):
        self.name = name
        self.document = document