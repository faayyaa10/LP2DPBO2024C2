import java.util.List;
import java.util.Scanner;

class Shirt extends Clothing{
    //atribut
    String color;
    String sleeve_type;

    //contructors
    Shirt(){
        
    }

    //contructor w/ parameter
    Shirt(String color, String sleeve_type){
        this.color = color;
        this.sleeve_type = sleeve_type;
    }

    //bikin get sama set
    //get color
    String getColor(){
        return this.color;
    }

    //set color
    void setColor(String color){
        this.color = color;
    }

    String getSleeve_type(){
        return this.sleeve_type;
    }

    //set sleeve_type
    void setSleeve_type(String sleeve_type){
        this.sleeve_type = sleeve_type;
    }
}