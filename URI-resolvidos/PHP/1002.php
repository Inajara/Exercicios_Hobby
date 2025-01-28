<?php

$r = readline();
$pi = 3.14159;
$area = ($r*$r)*$pi;
$area = number_format($area, 4, '.', '');

echo "A={$area}\n";
?>