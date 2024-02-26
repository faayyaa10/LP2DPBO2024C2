#include "Shirt.cpp"
#include <vector>
#include <iostream>
#include <iomanip> // tambahkan header untuk setw()
using namespace std;

int main() {
    vector<Shirt> shirtList;
    int n;
    cout << "Masukkan jumlah baju: ";
    cin >> n;

    for (int i = 0; i < n; i++) {
        string id, name, brand, size, material, gender, color, sleeveType;
        double price;

        cout << "Masukkan detail baju:" << endl;
        cout << "ID: ";
        cin >> id;
        cout << "Name: ";
        cin >> name;
        cout << "Brand: ";
        cin >> brand;
        cout << "Price: ";
        cin >> price;
        cout << "Size: ";
        cin >> size;
        cout << "Material: ";
        cin >> material;
        cout << "Gender: ";
        cin >> gender;
        cout << "Color: ";
        cin >> color;
        cout << "Sleeve Type: ";
        cin >> sleeveType;

        Shirt shirt(color, sleeveType);
        shirt.setId(id);
        shirt.setName(name);
        shirt.setBrand(brand);
        shirt.setPrice(price);
        shirt.setSize(size);
        shirt.setMaterial(material);
        shirt.setGender(gender);

        shirtList.push_back(shirt);
    }

    cout << "Berikut adalah listnya:" << endl;
    if (shirtList.empty()) {
        cout << "Tidak ada kemeja yang tersedia." << endl;
        return 0; // ubah return; menjadi return 0;
    }

    //mencetak header tabel
    cout << left << setw(10) << "ID" << setw(20) << "Name" << setw(20) << "Brand" << setw(20) << "Price" << setw(20) << "Size" << setw(20) << "Material" << setw(20) << "Gender" << setw(20) << "Color" << setw(20) << "Sleeve Type" << endl;

    //mencetak setiap baris data dari objek Shirt
    for (Shirt shirt : shirtList) {
        cout << left << setw(10) << shirt.getId() << setw(20) << shirt.getName() << setw(20) << shirt.getBrand() << setw(20) << shirt.getPrice() << setw(20) << shirt.getSize() << setw(20) << shirt.getMaterial() << setw(20) << shirt.getGender() << setw(20) << shirt.getColor() << setw(20) << shirt.getSleeveType() << endl;
    }

    return 0;
}
