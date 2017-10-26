<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
</head>
<body>
<?php
if(! isset($_POST['enviar'])){
?><h3>Introduzca dos numeros de entre el 1 y el 10</h3>

<form action=" <?php echo $_SERVER['PHP_SElF']; ?> " method="post">
   A: <input type="text" name="a">
   B: <input type="text" name="b">
   <input type="submit" name="enviar">
  </form>
<?php 
}else {
    $a=$_POST["a"];
    $b=$_POST["b"];
    $cont;
    $w=0;
    if($a>$b){
        $cont=$a-$b;
    }else $cont=$b-$a;
    while ($w<$cont+1){
        $w+=1;
        echo "*";
    }
}
?>
</body>
</html>