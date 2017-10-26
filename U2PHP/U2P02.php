<?php
//Comentarios de los tres tipos
echo 'Primer comentario'; // Esto es un comentario al estilo de c++ de una sola línea
echo 'Segundo comentario';/* Esto es un comentario multilínea
y otra lína de comentarios */
echo 'Tercer comentario'; # Esto es un comentario al estilo de consola de una sola línea

//Sentencias echo con los dos tipos de comillas
echo "<br/>";
echo "sentencia con 2 comillas";
echo 'sentencia con 1 comilla';

//Uso de al menos tres operadores de comparación y dos operadores lógicos
echo "<br/>";
$a=4;
$b=5;
/*if($a<$b)//comparador 1
if($a==$b)//comparador 2
if($a!=$b)//comparador 3
if($a || $b)//operador logico 1
if($a && $b)//opreador logico 2*/

//Uso de un operador de asignacion
$a +=$b;
echo "$a";

//Declaración y uso de una variable por referencia
echo "<br/>";
$salario=1000;
$salariopersona= &$salario;
echo "$salariopersona";

//Declaración y uso de dos constantes, una que obligue a respetar las mayúsculas en su uso y otra que no lo haga
echo "<br/>";
define("VARIABLE", "x",true);
echo "Nuestra variable es ".variable;
echo "<br/>";
define("VARIABLE", "x");
echo "Nuestra variable es ".VARIABLE;

//Declaración y uso de un variable booleana y otra de tipo double
echo "<br/>";
$boolean = true;
$double = 9.6;
echo "$boolean";
echo "<br/>";
echo "$double";

//Uso de is_numeric, is_bool y is_double con estas variables
echo "<br/>";
if(is_numeric($boolean)){
    echo 'El $boolean es numerico';
}else echo 'El $boolean no es numerico';
echo "<br/>";
if(is_bool($boolean)){
    echo 'El $boolean es boolean';
}else echo 'El $boolean no es boolean';
echo "<br/>";
if(is_double($double)){
    echo 'El $double es double';
}else echo 'EL $double no es double';

//Declaración de una variable de tipo string. 
//Pruebas con la función strlen y con tres de las funciones indicadas en el enlace.
echo "<br/>";
$mistring= 'hola buenas tardes';
echo "La longitud de $mistring es :".strlen($mistring);

//Declaración de un array escalar y uno asociativo
echo "<br/>";
$arrayesc= array("Espada","Lanza","Escudo","Armadura");//array escalar
$elementos= array("Fuego"=>"Rojo","Planta"=>"Verde","Agua"=>"Azul","Tierra"=>"Marron");//array asociativo

//Ordenación y volcado de información con var_dump siguiendo 2 criterios de ordenación en cada uno de los arrays
echo "<br/>";
$a=5;
$b=true;
var_dump($a,$b);

//Una estructura de control de cada tipo (if-elsif-else, switch, while, do-while, for)
echo "<br/>";
$a=5;
$b=-1;
if($a>$b){
    echo '$a es mayor que $b';
}elseif ($b>$a){
    echo '$b es mayor que $a';
}else 
    echo 'Las dos variables tienen el mismo valor';
echo "<br/>";
while ($a>$b+1){
    $b+=1;
    echo "$b aun no es igual que $a  ";
    echo "<br/>";
}
echo '$a y $b ya son iguales';
echo "<br/>";

$opcion=1;
switch ($opcion){
    case 1: echo "Elegiste la opcion correcta";break;
    case 2: echo "Elegiste la opcion equivocada";break;
}
echo "<br/";
for($a=0;$a<3;$a++){
    echo $a;
    echo "<br/>";
}

//Un recorrido por cada uno de los dos arrays utilizando foreach, generando por ejemplo una lista ordenada con sus elementos
$compis = array("Felix","Pedro","Jose","Sergio");
    echo "<ol>";
    foreach ($compis as $nombres){
        echo "<li>$nombres</li>";
    }
    echo "</ol>";
    echo "<br/>";
    
 //Dos pruebas con la variable superglobal _SERVER
    echo $_SERVER['SERVER_NAME'];
    echo "<br/>";
    echo $_SERVER['SERVER_ADDR'];
    echo "<br/>";
    
    //Dos pruebas de funciones: una devolverá algun tipo, la otra no
    $a=4;
    $b=null;
    if(isset($a)){
        echo '$a tiene valor';
    }
    echo "<br/>";
    if(!isset($b)){
        echo  '$b no tiene valor';
    }
    echo "<br/>";
    
    //Impresion de la fecha y hora con todo el detalle posible
   echo "hoy es ".date("d-m-y")." y son las ".date("h:i");
   echo "<br/>";
   
   //Una función que utilice una variable global
   global $w;
   $w=4;
   function xx() {
       echo $a;
   }
   echo "<br/>";
   
   //Un formulario que reciba tu nombre y lo muestre por pantalla
   ?>
   <form action="<?php echo $_SERVER['PHP_SElF'];?>" method="post">
   Nombre: <input type="text" name="nombre">
   Edad: <input type="text" name="edad">
   <input type="submit" name="enviar">
   </form>








