#import kelas Clothing dari modul clothing
from clothing import Clothing

#kelas Shirt, turunan dari kelas Clothing
class Shirt(Clothing):
    #constructor
    def __init__(self):
        #inisialisasi atribut untukk color dan sleeve type
        super().__init__()
        self.color = ""
        self.sleeve_type = ""
    
    #set Color
    def setColor(self, color):
        self.color = color
    
    #get Color
    def getColor(self):
        return self.color
    
    #set SleeveType
    def setSleeveType(self, sleeve_type):
        self.sleeve_type = sleeve_type
    
    #get SleeveType
    def getSleeveType(self):
        return self.sleeve_type
