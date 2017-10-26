###### *Desarrollo Web en Entorno Servidor - Curso 2017/2018 - IES Leonardo Da Vinci - Alberto Ruiz*
## U2P02 - Fundamentos de PHP
#### Entrega de: *Eduardo Garcés Ortega*
----
#### 1. Descripción:

El objetivo de la práctica es familiarizarse con el lenguaje PHP y codificar un programa en el que queden ejemplificados sus componentes y estructuras básicas, sirviendo más adelante como referencia básica.

#### 2. Formato de entrega:

Inserta el código en este documento.

#### 3. Trabajo a realizar:

Crea un proyecto *U2P02-PHP* y codifica un programa PHP en el que incluyas ejemplos propios de los elementos que se van indicando. Incluye estos apartados antes de cada prueba en forma de comentario de línea. Recuerda incluir este archivo en la carpeta `doc` dentro del proyecto:

* Comentarios de los tres tipos

  ````php
  <?php
  echo 'Primer comentario'; // Esto es un comentario al estilo de c++ de una sola línea
  echo 'Segundo comentario';/* Esto es un comentario multilínea
  y otra lína de comentarios */
  echo 'Tercer comentario'; # Esto es un comentario al estilo de consola de una sola línea
  ?>
  ````


* Sentencias echo con los dos tipos de comillas

  ```php
  echo "sentencia con 2 comillas";
  echo 'sentencia con 1 comilla';
  ```

  ​

* Uso de al menos tres operadores de comparación y dos operadores lógicos

  ```php
  $a=4;
  $b=5;
  if($a<$b)//comparador 1
  if($a==$b)//comparador 2
  if($a!=$b)//comparador 3
  if($a || $b)//operador logico 1
  if($a && $b)//opreador logico 2
  ```

  ​

* Uso de un operador de asignación


```php
$a +=$b;
```



* Declaración y uso de una variable por referencia

  ```php
  $salario=1000;
  $salariopersona= &$salario;
  echo "$salariopersona";
  ```

  ​

* Declaración y uso de dos constantes, una que obligue a respetar las mayúsculas en su uso y otra que no lo haga


```php
define("VARIABLE", "x",true);
echo "Nuestra variable es ".variable;
echo "<br/>";
define("VARIABLE", "x");
echo "Nuestra variable es ".VARIABLE;
```



* Declaración y uso de un variable booleana y otra de tipo double

  ```php
  echo "<br/>";
  $boolean = true;
  $double = 9.6;
  echo "$boolean";
  echo "<br/>";
  echo "$double";
  ```

  ​

* Uso de is_numeric, is_bool y is_double con estas variables

  ```php
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
  ```

  ​

* Declaración de una variable de tipo string. Pruebas con la función *strlen* y con tres de las funciones indicadas en el enlace.

  ```php
  $mistring= 'hola buenas tardes';
  echo "La longitud de $mistring es :".strlen($mistring);
  ```

  ​

* Declaración de un array escalar y uno asociativo

  ```php
  $arrayesc= array("Espada","Lanza","Escudo","Armadura");//array escalar
  $elementos= array("Fuego"=>"Rojo","Planta"=>"Verde","Agua"=>"Azul","Tierra"=>"Marron");//array asociativo

  ```

  ​

* Ordenación y volcado de información con *var_dump* siguiendo dos criterios de ordenación en cada uno de los arrays

  ```php
  $a=5;
  $b=true;
  var_dump($a,$b);
  ```

  ​

* Una estructura de control de cada tipo (if-elsif-else, switch, while, do-while, for)


```php
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
```



* Un recorrido por cada uno de los dos arrays utilizando foreach, generando por ejemplo una lista ordenada con sus elementos

  ```php
  $compis = array("Felix","Pedro","Jose","Sergio");
      echo "<ol>";
      foreach ($compis as $nombres){
          echo "<li>$nombres</li>";
      }
      echo "</ol>";
      echo "<br/>";

  ```

  ​

* Dos pruebas con la variable superglobal _SERVER

  ```php
    echo $_SERVER['SERVER_NAME'];
      echo "<br/>";
      echo $_SERVER['SERVER_ADDR'];
      echo "<br/>";
  ```

  ​

* Dos pruebas de funciones: una devolverá algun tipo, la otra no

  ```php
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
  ```

  ​

* Impresion de la fecha y hora con todo el detalle posible


```php
 echo "hoy es ".date("d-m-y")." y son las ".date("h:i");
```



* Una función que utilice una variable global


```php
   global $w;
   $w=4;
   function xx() {
       echo $a;
   }
```



* Un formulario que reciba tu nombre y lo muestre por pantalla


```php
  <form action="<?php echo $_SERVER['PHP_SElF'];?>" method="post">
   Nombre: <input type="text" name="nombre">
   Edad: <input type="text" name="edad">
   <input type="submit" name="enviar">
   </form>
```

