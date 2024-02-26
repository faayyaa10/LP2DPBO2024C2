#include <iostream>
#include <string>
using namespace std;

class Product {
protected:
    string idProduct;
    string name;
    string brand;
    double price;

public:
    void setId(string id) {
        idProduct = id;
    }

    void setName(string n) {
        name = n;
    }

    void setBrand(string b) {
        brand = b;
    }

    void setPrice(double p) {
        price = p;
    }

    string getId() {
        return idProduct;
    }

    string getName() {
        return name;
    }

    string getBrand() {
        return brand;
    }

    double getPrice() {
        return price;
    }
};
