#import kelas Product dari modul product
from product import Product

#membuat kelas Clothing, turunan dari kelas Product
class Clothing(Product):
    #constructor
    def __init__(self):
        #inisialisasi atribut untuk size, material dan gender
        super().__init__()
        self.size = ""
        self.material = ""
        self.gender = ""
    
    #set Size
    def setSize(self, size):
        self.size = size
    
    #get Size
    def getSize(self):
        return self.size
    
    #set Material
    def setMaterial(self, material):
        self.material = material
    
    #get Material
    def getMaterial(self):
        return self.material
    
    #set Gender
    def setGender(self, gender):
        self.gender = gender
    
    #get Gender
    def getGender(self):
        return self.gender
