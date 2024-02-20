import java.util.List;
import java.util.Scanner;

class Product{
    //atribut
    String id;
    String name;
    String brand;
    Double price;

    //contructors
    Product(){

    }

    //contructor w/ parameter
    Product(String id, String name, String brand, Double price){
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    //bikin get sama set
    //get id
    String getId(){
        return this.id;
    }

    //set id
    void setId(String id){
        this.id = id;
    }

    String getName(){
        return this.name;
    }

    //set name
    void setName(String name){
        this.name = name;
    }

    String getBrand(){
        return this.brand;
    }

    //set name
    void setBrand(String brand){
        this.brand = brand;
    }

    Double getPrice(){
        return this.price;
    }

    //set name
    void setPrice(Double price){
        this.price = price;
    }
}