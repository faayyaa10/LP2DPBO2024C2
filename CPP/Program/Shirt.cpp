#include "Clothing.cpp"

class Shirt : public Clothing {
protected:
    string color;
    string sleeveType;

public:
    Shirt() {}

    Shirt(string c, string st) {
        color = c;
        sleeveType = st;
    }

    void setColor(string c) {
        color = c;
    }

    void setSleeveType(string st) {
        sleeveType = st;
    }

    string getColor() {
        return color;
    }

    string getSleeveType() {
        return sleeveType;
    }
};
