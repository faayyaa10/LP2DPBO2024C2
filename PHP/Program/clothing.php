<?php
//impor product.php
require_once 'product.php';

//kelas Clothing turunan dari Product
class Clothing extends Product {
    //properti yang dilindungi
    protected $size; //untuk ukuran pakaian
    protected $material; //untuk bahan pakaian
    protected $gender; //untuk jenis kelamin

    //contructors
    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender) {
        //memanggil konstruktor kelas induk
        parent::__construct($idProduct, $name, $brand, $price);
        $this->size = $size; //inisialisasi ukuran pakaian
        $this->material = $material; //inisialisasi bahan pakaian
        $this->gender = $gender; //inisialisasi jenis kelamin
    }

    //get ukuran pakaian
    public function getSize() {
        return $this->size;
    }

    //get bahan pakaian
    public function getMaterial() {
        return $this->material;
    }

    //get jenis kelamin
    public function getGender() {
        return $this->gender;
    }
}
?>
