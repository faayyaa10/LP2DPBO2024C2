<?php
//impor kelas Clothing.php
require_once 'clothing.php';

//kelas Shirt turunan dari kelas Clothing
class Shirt extends Clothing {
    //atribut yang dilindungi
    protected $color; //warna baju
    protected $sleeve_type; //jenis lengan

    //contructors
    public function __construct($idProduct, $name, $brand, $price, $size, $material, $gender, $color, $sleeve_type) {
        //memanggil konstruktor kelas induk
        parent::__construct($idProduct, $name, $brand, $price, $size, $material, $gender);
        $this->color = $color; //inisialisasi warna baju
        $this->sleeve_type = $sleeve_type; //inisialisasi jenis lengan
    }

    //get warna baju
    public function getColor() {
        return $this->color;
    }

    //get jenis lengan
    public function getSleeveType() {
        return $this->sleeve_type;
    }
}
?>
