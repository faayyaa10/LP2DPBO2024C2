<?php
class Product {
    //atribut yang dilindungi dan hanya dapat diakses oleh kelas turunan
    protected $idProduct; //untuk id produk
    protected $name; //untuk nama produk
    protected $brand; //untuk merek produk
    protected $price; //untuk harga produk

    //contructors
    public function __construct($idProduct, $name, $brand, $price) {
        $this->idProduct = $idProduct; //inisialisasi id produk
        $this->name = $name; //inisialisasi nama produk
        $this->brand = $brand; //inisialisasi merek produk
        $this->price = $price; //inisialisasi harga produk
    }

    //get id produk
    public function getIdProduct() {
        return $this->idProduct;
    }

    //get nama produk
    public function getName() {
        return $this->name;
    }

    //get merek produk
    public function getBrand() {
        return $this->brand;
    }

    //get harga produk
    public function getPrice() {
        return $this->price;
    }
}
?>
