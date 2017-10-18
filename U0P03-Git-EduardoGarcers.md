###### *Desarrollo Web en Entorno Servidor - Curso 2017/2018 - IES Leonardo Da Vinci - Alberto Ruiz*
## U0P03 - Git
#### Entrega de: *pon aquí tu nombre*
----

#### 1. Descripción:

Git es el sistema de control de versiones más utilizado en la actualidad: podríamos decir que es un estándar *de facto*. Han aparecido plataformas como GitHub (la más popular) y GitLab que almacenan en *la nube* repositorios de proyectos, de forma que personas de todo el mundo pueden colaborar en ellos. Vamos a crear una cuenta en GitHub con un repositorio, y después aprenderemos los conceptos básicos de Git mediante ejemplos.

#### 2. Formato de entrega:

Iremos incluyendo capturas de pantalla en este documento para ilustrar los diferentes pasos. Decide en qué puntos es interesante incluir captura: si dudas, es mejor que la incluyas. Puedes incluir también notas, comentarios o problemas que vayas encontrando: este documento se convertirá así en tu propio tutorial para configurar GitHub.

#### 3. Trabajo a realizar:

##### Parte 1. Creación de una cuenta en GitHub y creación de un repositorio

1. Antes de comenzar, visualiza este [vídeo explicativo sobre GitHub](https://www.youtube.com/watch?v=w3jLJU7DT5E)
2. Accede a [la web de GitHub](https://github.com/)
3. En esta parte tendréis que trabajar con dos cuentas de GitHub diferentes: por tanto debéis trabajar en dos máquinas diferentes (por ejemplo virtual y real) o bien con dos navegadores diferentes. Crea por separado una nueva cuenta para los alumnos A y B, utilizando vuestros nombres. Utilizaréis esta cuenta para el resto del curso.
![Git1](Imagenes/Git1.PNG)

1. Una vez creada la cuenta, el usuario A creará un nuevo repositorio público (no hay otra opción gratuita en GitHub) llamado **pruebaGitXX** donde XX sea tu número de equipo.


1. Utiliza el archivo *README.md* para poner vuestros nombres y el propósito de este repositorio (almacenar los proyectos de este módulo profesional). Observa la extensión del archivo: *md*. Markdown es el formato estándar para editar archivos en  GitHub. Alterna entre las pestañas *Edit file* y *Preview changes* para ver el resultado de tu edición.
![Git2](Imagenes/Git2.PNG)

1. Usuario A: accede a tu repositorio, en concreto a la pestaña `Settings` → `Collaborators`, y da de alta al usuario B localizándolo por su nombre de usuario o por su correo electrónico
![Git3](Imagenes/Git3.PNG)

1. Usuario B: comprueba que puedes acceder al repositorio
```
Estas capturas están hechas desde el usuario B
```



![Git4](Imagenes/Git4.png)

##### Parte 2. Modificación del proyecto: la rama *master* y la operación *commit* 

La versión principal del proyecto es la rama *master*. Vamos a realizar modificaciones en ella.

1. Usuario A: Añade al documento una línea concreta, por ejemplo: "Vamos a trabajar con Java en este módulo profesional". Recuerda que puedes previsualizar los cambios.

![Git5](Imagenes/Git5.PNG)

1. Usuario A:  Realiza la operación *commit* (cuya traducción más satisfactoria, si bien no es literal, sería *confirmar*). Esta operación incluirá tus cambios en la rama principal del proyecto. De cara al historial, se te solicitará un breve título para la actualización, y un comentario opcional más largo. Como título pon "Mención a Java"

![Git5r.](Imagenes/Git5.PNG)

1. Usuario B: Actualiza tu repositorio y comprueba que los cambios se han mantenido

![Git6](Imagenes/Git6.PNG)

1. Usuario B: Accede al historial del archivo con el botón situado en la parte superior derecha, y comprueba que se van registrando las modificaciones. Además, el botón *Blame* (echar la culpa) permite rastrear los cambios hasta averiguar quién ha metido la pata y provocado un fallo en nuestro proyecto.

![Git7](Imagenes/Git7.png)

1. Si lo deseáis, repetid esta parte invirtiendo los papeles de los usuarios A y B

##### Parte 3. Operaciones con GitHub: gestión de ramas (*branches*), *pull request*, *merge* 

En principio, a lo largo del módulo sólo necesitarás la rama principal. Sin embargo, vamos a comprobar brevemente cómo se trabaja en equipo con GitHub: el usuario B creará una nueva rama (branch) para experimentar una nueva funcionalidad del proyecto sin comprometer la estabilidad del mismo. Una vez esté satisfecho con los cambios, solicitará su aprobación. El usuario A lo aprobará y la nueva rama se fundirá (*merge*) con la rama principal *master*. Finalmente se eliminará la rama nueva, ya innecesaria.

Si lo deseas, consulta [este tutorial](https://guides.github.com/activities/hello-world/) oficial que repasa de forma simplificada lo que haremos en esta parte.

1. Usuario B: Accede al archivo README y pulsa en el botón desplegable `Branch: master` situado en la parte superior izquierda


![Git8](Imagenes/Git8.png)

1. Usuario B: Escribe el nombre de la nueva rama, por ejemplo *propuestaPHP*
2. Usuario B: Modifica la frase de antes para añadir PHP a los lenguajes que se van a manejar en el módulo
3. Usuario B: Realiza la operación *commit*: observa que por defecto se te sugiere confirmar a la nueva rama. Si no hubiésemos creado la rama en el paso anterior, aquí también podríamos hacerlo con la segunda opción ("Crear una nueva rama")


![Git9](Imagenes/Git9.PNG)

1. Usuario A: Comprueba que no percibes cambios en el documento de momento


```
Comprobado.
```

1. Usuario B: Podrías trabajar el tiempo que desees en esta rama y hacer diferentes modificaciones. Suponiendo que ya estás satisfecho con los cambios, vamos a realizar la operación *pull request*, que consiste en la petición de incorporación de los cambios a la rama principal. Es probable que cuando accedas a la vista principal de tu repositorio te aparezca una opción destacada *Compare & pull request*. Si es así, puedes saltarte el siguiente paso


1. Usuario B: En la vista principal del repositorio, haz clic en la pestaña `Pull requests` → `New Pull Request`. Como rama base escoge *master*, y para comparar, la nueva rama *PropuestaPHP*


![Git10](Imagenes/Git10.PNG)

1. Usuario B: GitHub te mostrará la comparativa entre ambos archivos y dará su aprobación para la fusión (*merge*), al no haber conflictos. Haz clic en *Create pull request* y añade un título, como *Incorporación PHP*. En el texto, menciona al Usuario A, por ejemplo: "¿Qué te parece el cambio, @loginA?"


![Git11](Imagenes/Git11.PNG)

1. Usuario B: Se te indicará que no hay conflictos y puedes hacer una fusión automática sin perjudicar a otros usuarios. Si quisieras, podrías realizar tú mismo la fusión haciendo clic en *Merge*, pero vamos a dejar que lo haga el Usuario A.
2. Usuario A: Comprueba que has recibido un correo electrónico por haber sido mencionado en el comentario del Usuario B


```
Recibido.
```



1. Usuario A: En la vista principal del repositorio, accede a la pestaña `Pull requests` y haz clic en la petición creada por tu compañero
2. Usuario A: Haz clic en *Merge pull request* y después en *Confirm merge*. Ambos recibiréis confirmación vía correo electrónico


![Git12](Imagenes/Git12.PNG)

1. Usuario A: Verás un mensaje que indica que la rama *PropuestaPHP* ya puede ser eliminada, y un botón `Delete branch`. Puedes pulsarlo y se eliminará. Si has accedido a otra sección y has perdido el mensaje, accede a la vista principal del repositorio y haz clic en la pestaña `Branches`. Desde allí podrás eliminar la rama.


```
Realizado.
```



#####Parte 4. Conflictos al trabajar con GitHub

Insistimos: no es el propósito de este módulo el trabajar intensivamente con Git, y por tanto nuestra estrategia de cara a los conflictos será prevenirlos al trabajar únicamente con la rama principal y de forma muy controlada. Pero vamos a ver un pequeño ejemplo de qué sucede cuando surgen conflictos.

1. Usuario A: Crea una rama llamada *inglés*

```
Hecho.
```



1. Usuario B: En la rama principal, modifica la frase que incluimos antes, por ejemplo cambiándola a: "Vamos a trabajar con muchos lenguajes de programación en este módulo profesional". Realiza la confirmación (*commit*)

![Git13](Imagenes/Git13.PNG)

1. Usuario A: En la rama *inglés*, observa que ves la frase original: estás trabajando con lo que era el proyecto en el momento de la separación de las ramas. Se diría que ahora hay dos proyectos que evolucionan por separado, y que en un momento dado volverán a juntarse. Sustituye la frase por una traducción al inglés de la misma y realiza la confirmación

![Git14](Imagenes/Git14.PNG)

1. Usuario A: Suponiendo que ya has realizado todos los cambios que deseabas en esta rama, solicita la incorporación de los mismos (*pull request*) como hicimos en la parte anterior. Observa que recibes un aviso de que hay conflictos.
2. Cualquiera de los dos usuarios puede ahora acceder a la sección de `Pull requests` y lidiar con este problema: se indica que es necesario solucionar los conflictos y aparece el botón `Resolve conflicts`. Visualmente, en la parte inferior puedes ver los borrados y adiciones en rojo y en verde. También puedes elegir ver los cambios en los dos documentos por separado haciendo clic en `Split`
3. Haced clic en el botón para resolver el conflicto, y decidid qué texto será el definitivo. A continuación podréis confirmar, realizar la fusión, y eliminar la rama secundaria que ya no será necesaria.

![Git15](Imagenes/Git15.PNG)

#####Parte 5 (opcional). Limpieza

En la siguiente práctica vamos a crear otro repositorio, que utilizaremos durante todo el curso. Si lo deseas, podrás reutilizar este cambiándolo de nombre. Si prefieres empezar de cero, elimina ahora el repositorio, siguiendo los siguientes pasos:

1. Usuarios A y B: Acceded a la vista principal del repositorio

![Git16](Imagenes/Git16.PNG)

1. Comprobad que sólo el usuario que creó el repositorio tiene una pestaña accesible llamada `Settings`

```
Comprobado.
```

1. En esa pestaña, en la parte inferior, está la opción para eliminar el repositorio

![Git17](Imagenes/Git17.PNG)