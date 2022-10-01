## Practica de entrada

# Pregunta 1
![Codigo 1](https://github.com/sergei270791/curso-CC3S2/blob/main/PracticaEntrada/img/pregunta1_codigo.png)
La salida del codigo anterior es: qpzj.  
Esto se debe a que primero agregaría la q en el constructor sin parametros de Canine, luego agregaría la p y  la z de los constructores de la clase Fox y por último se agrega la j del constructor con argumento entero de la clase Fennec y por ultimo la clase main imprime qpzj. 
# Pregunta 2
![Codigo 2](https://github.com/sergei270791/curso-CC3S2/blob/main/PracticaEntrada/img/pregunta2_codigo.png)
La respuesta es la opción e) El programa compila e imprime 3.  
Esto se debe a que en el método main se instancia un objeto de la clase Bird que particularmente es un Macaw con feathers = 4, luego se intenta castear el objeto p a uno de tipo de Parrot pero como un Macaw es un Parrot quedaría igual y al aplicar el método fly de Macaw esto retorna un Macaw con feathers = 3 que es lo que se termina imprimiendo.  
# Pregunta 3
a) Falso, Una clase solo puede extender de una clase.   
b) Verdadero, Una clase puede implementarse de varias interfaces.   
c) Verdadero, Todos los objetos heredan de java.lang.object.   
d) Verdadero, ya que B seria la clase padre osea la superclase de A.   
e) Verdadero, ya que esta implementado por la interface seria un subtipo de esta.   
f) Verdadero, la herencia multiple consiste que una clase pueda extender de varias clases padres a la vez directamente, caracteristica con la que no cuenta java.   
# Pregunta 4
![Codigo 4](https://github.com/sergei270791/curso-CC3S2/blob/main/PracticaEntrada/img/pregunta4_codigo.png)
Ahí esta el codigo completado para que este pueda compilar.    
Este no muestra nada ya que no hay la clase main como tal.    
# Pregunta 5
![Codigo 5 incorrecto](https://github.com/sergei270791/curso-CC3S2/blob/main/PracticaEntrada/img/pregunta5_codigo_incorrecto.png)
Este el codigo Incorrecto tal y como esta en la pregunta.   
No compila y muestra: Cannot invoke append(int) on the primitive type int   

![Codigo 5 corregido](https://github.com/sergei270791/curso-CC3S2/blob/main/PracticaEntrada/img/pregunta5_codigo_incorrecto.png)
Este sería el codigo corregido y el resultado en pantalla seria: ok.   
# Pregunta 6
![Pregunta6.1](https://github.com/sergei270791/curso-CC3S2/blob/main/PracticaEntrada/img/pregunta6_parte1.jpg)
a)Verdadero, ya que la interface solo tiene constantes y nombres de métodos mas no su implementación.      
b)Verdadero, un cambio en la interface como el valor de una constante o el nombre de un método haría que cambie también en la clase.   
c)Falso, lo que si se podría sería pasar un objeto de tipo SuperFastList a SuperFastCollection pero igual no habría una implementación.   
![Pregunta6.2](https://github.com/sergei270791/curso-CC3S2/blob/main/PracticaEntrada/img/pregunta6_parte2.jpg)
Aquí la respuesta correcta es la opción a), en la b) falla en que no importa si SuperFastCollection tiene mas métodos ya que de igual manera la clase SuperFastList podrá adicionarlos junto a la implementación de java.util.List, en la c)  falla en que no importa si no pertenecen a java.util.List mientras esten implementados en SuperFastList y en la d) falla en que obviamente SuperFastList puede contener métodos que no pertenecen a java.util.List suele pasar casi siempre lo que no se puede es lo contrario que java.util.List no puede tener mas métodos que SuperFastList.      
![Pregunta6.3](https://github.com/sergei270791/curso-CC3S2/blob/main/PracticaEntrada/img/pregunta6_parte3_1.jpg)
![Pregunta6.3](https://github.com/sergei270791/curso-CC3S2/blob/main/PracticaEntrada/img/pregunta6_parte3_2.jpg)
La respuesta sería la c)    