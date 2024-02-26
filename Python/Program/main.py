#import kelas Shirt dari modul shirt
from shirt import Shirt

#fungsi addShirt untuk menambahkan baju ke dalam daftar list
def addShirt():
    print("Masukkan detail baju:")
    id = input("ID: ")
    name = input("Name: ")
    brand = input("Brand: ")
    price = float(input("Price: "))
    size = input("Size: ")
    material = input("Material: ")
    gender = input("Gender: ")
    color = input("Color: ")
    sleeve_type = input("Sleeve Type: ")
    
    shirt = Shirt()
    shirt.setId(id)
    shirt.setName(name)
    shirt.setBrand(brand)
    shirt.setPrice(price)
    shirt.setSize(size)
    shirt.setMaterial(material)
    shirt.setGender(gender)
    shirt.setColor(color)
    shirt.setSleeveType(sleeve_type)
    
    shirtList.append(shirt)

#fungsi displayShirts untuk menampilkan daftar baju
def displayShirts():
    print("Berikut adalah listnya:")
    if not shirtList:
        print("Tidak ada kemeja yang tersedia.")
        return

    #header tabel
    print("{:<10} {:<20} {:<20} {:<20} {:<20} {:<20} {:<20} {:<20} {:<20}".format("ID", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type"))
    #menampilkan setiap baris data dari objek Shirt
    for shirt in shirtList:
        print("{:<10} {:<20} {:<20} {:<20} {:<20} {:<20} {:<20} {:<20} {:<20}".format(shirt.getId(), shirt.getName(), shirt.getBrand(), shirt.getPrice(), shirt.getSize(), shirt.getMaterial(), shirt.getGender(), shirt.getColor(), shirt.getSleeveType()))

if __name__ == "__main__":
    shirtList = []  #inisialisasi daftar baju
    n = int(input())  #jumlah baju yang akan dimasukkan
    for _ in range(n):
        addShirt()  #panggil fungsi addShirt untuk memasukkan baju ke dalam daftar
    displayShirts()  #panggil fungsi displayShirts untuk menampilkan daftar baju
