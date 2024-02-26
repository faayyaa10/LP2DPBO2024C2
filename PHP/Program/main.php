<?php
require_once 'SHIRT.php';

//masukkan yang dihardcode
$shirt1 = new Shirt(1, "Heeseung", "Prada", 100000, "L", "Cotton", "Male", "White", "Short");
$shirt2 = new Shirt(2, "Jungwon", "Givenchy", 120000, "M", "Denim", "Male", "Blue", "Long");
$shirt3 = new Shirt(3, "Riki", "Dior", 90000, "XL", "Silk", "Male", "Red", "Short");

//untuk membuat tampilan tabel
echo "<h2>Detail Baju:</h2>";
echo "<table border='1'>";
echo "<tr>
      <th>ID Product </th>
      <th>Name </th>
      <th>Brand </th>
      <th>Price </th>
      <th>Size </th>
      <th>Material </th>
      <th>Gender </th>
      <th>Color </th>
      <th>Sleeve Type </th>
    </tr>";
foreach ([$shirt1, $shirt2, $shirt3] as $shirt) {
    echo "<tr>";
    echo "<td>{$shirt->getIdProduct()}</td>";
    echo "<td>{$shirt->getName()}</td>";
    echo "<td>{$shirt->getBrand()}</td>";
    echo "<td>{$shirt->getPrice()}</td>";
    echo "<td>{$shirt->getSize()}</td>";
    echo "<td>{$shirt->getMaterial()}</td>";
    echo "<td>{$shirt->getGender()}</td>";
    echo "<td>{$shirt->getColor()}</td>";
    echo "<td>{$shirt->getSleeveType()}</td>";
    echo "</tr>";
}
echo "</table>";
?>