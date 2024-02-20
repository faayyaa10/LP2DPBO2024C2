import java.util.List;
import java.util.Scanner;

class Clothing extends Product{
    //atribut
    String size;
    String material;
    String gender;

    //contructors
    Clothing(){
        
    }

    //contructor w/ parameter
    Clothing(String size, String material, String gender){
        this.size = size;
        this.material = material;
        this.gender = gender;
    }

    //bikin get sama set
    //get size
    String getSize(){
        return this.size;
    }

    //set size
    void setSize(String size){
        this.size = size;
    }

    String getMaterial(){
        return this.material;
    }

    //set material
    void setMaterial(String material){
        this.material = material;
    }

    String getGender(){
        return this.gender;
    }

    //set material
    void setGender(String gender){
        this.gender = gender;
    }
}