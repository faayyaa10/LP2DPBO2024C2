class Product:
    #constructor
    def __init__(self):
        #inisialisasi atribut untuk id, nama, nama brand dan harga
        self.id = ""
        self.name = ""
        self.brand = ""
        self.price = 0.0
    
    #membuat getter dan setter
    #set Id
    def setId(self, id):
        self.id = id
    
    #get Id
    def getId(self):
        return self.id
    
    #set Name
    def setName(self, name):
        self.name = name
    
    #get Name
    def getName(self):
        return self.name
    
    #set Brand
    def setBrand(self, brand):
        self.brand = brand
    
    #get Brand
    def getBrand(self):
        return self.brand
    
    #set Price
    def setPrice(self, price):
        self.price = price
    
    #get Price
    def getPrice(self):
        return self.price
