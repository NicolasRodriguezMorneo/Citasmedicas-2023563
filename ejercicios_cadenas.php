<?php
echo "Ejercicio 1";
echo "<br>";
$nombre = "Diego Palacio";
$numero = 5284108;
echo $nombre." ".$numero;
echo "<br>";
echo "<br>";
?>

<?php
echo "Ejercicio 2";
echo "<br>";
$pasword = "dapv0102";
echo sha1($pasword)."<br/>";
echo md5($pasword);
echo "<br>";
echo "<br>";
?>

<?php
echo "Ejercicio 3";
echo "<br>";
$txt = "Buenos días estimados estudiantes.Hoy vamos aprender PHP";
echo strlen($txt);
echo "<br>";
echo "<br>";
?>

<?php
echo "Ejercicio 4";
echo "<br>";
$nombre = "Michael Santiago Garcia Piamba";
$mayus = strtoupper($nombre);
echo $mayus;
echo "<br>";
echo "<br>";
?>

<?php
echo "Ejercicio 5";
echo "<br>";
$nombre = "MICHAEL SANTIAGO GARCIA PIAMBA";
$minus = strtolower($nombre);
echo $minus;
echo "<br>";
echo "<br>";
?>