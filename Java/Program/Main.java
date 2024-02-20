import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    //membuat ArrayList untuk menyimpan objek Shirt
    static List<Shirt> shirtList = new ArrayList<>();
    //membuat objek Scanner untuk menerima input dari user
    static Scanner scanner = new Scanner(System.in);

    //method untuk menambahkan objek Shirt ke dalam shirtList
    public static void addShirt() {
        System.out.println("Enter Shirt details:");
        System.out.print("ID: ");
        String id = scanner.nextLine();
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Brand: ");
        String brand = scanner.nextLine();
        System.out.print("Price: ");
        Double price = scanner.nextDouble();
        scanner.nextLine(); 
        System.out.print("Size: ");
        String size = scanner.nextLine();
        System.out.print("Material: ");
        String material = scanner.nextLine();
        System.out.print("Gender: ");
        String gender = scanner.nextLine();
        System.out.print("Color: ");
        String color = scanner.nextLine();
        System.out.print("Sleeve Type: ");
        String sleeveType = scanner.nextLine();

        //membuat objek Shirt dengan detail yang dimasukkan oleh user
        Shirt shirt = new Shirt();
        shirt.setId(id);
        shirt.setName(name);
        shirt.setBrand(brand);
        shirt.setPrice(price);
        shirt.setSize(size);
        shirt.setMaterial(material);
        shirt.setGender(gender);
        shirt.setColor(color);
        shirt.setSleeve_type(sleeveType);

        //menambahkan objek Shirt ke dalam list
        shirtList.add(shirt);
    }

    //method untuk menampilkan semua objek Shirt yang telah dibuat
    public static void displayShirts() {
        System.out.println("List of Shirts:");
        if (shirtList.isEmpty()) {
            System.out.println("No shirts available.");
            return;
        }

        //mencetak header tabel
        System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s%n", "ID", "Name", "Brand", "Price", "Size", "Material", "Gender", "Color", "Sleeve Type");

        //mencetak setiap baris data dari objek Shirt
        for (Shirt shirt : shirtList) {
            System.out.printf("%-10s %-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s%n", shirt.getId(), shirt.getName(), shirt.getBrand(), shirt.getPrice(), shirt.getSize(), shirt.getMaterial(), shirt.getGender(), shirt.getColor(), shirt.getSleeve_type());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); 

        //meminta input sebanyak n objek Shirt
        for (int i = 0; i < n; i++) {
            addShirt();
        }

        //tampilkan semua objek Shirt
        displayShirts();
    }
}