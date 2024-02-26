#include "Product.cpp"

class Clothing : public Product {
protected:
    string size;
    string material;
    string gender;

public:
    Clothing() {}

    Clothing(string s, string m, string g) {
        size = s;
        material = m;
        gender = g;
    }

    void setSize(string s) {
        size = s;
    }

    void setMaterial(string m) {
        material = m;
    }

    void setGender(string g) {
        gender = g;
    }

    string getSize() {
        return size;
    }

    string getMaterial() {
        return material;
    }

    string getGender() {
        return gender;
    }
};
