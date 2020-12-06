# README

### **Nombre del Alumno:**

- Juventino Aguilar Correa

### **Matrícula:**

- 39203872

### Patrón de Diseño implementado:

- Builder
    - El patrón de diseño *Builder* queda como añillo al dedo para éste problema, ya que nos permite abstrer nuestra interface `Empleado` (que vendría siendo nuestro Builder) para así tener así empleados especializados en distintos tipos de platillos, que en éste caso tenemos varios tipos de pizza y pasteles (se añadieron sabores para los pasteles para hacer un poco más grande el problema y se observe mejor la guncionalidad del patrón).
    - Al tener los empleados organizados así, solo basta con definir las pasos para realizar su trabajo (hornear), y éstos nos regresaran las pizzas o pasteles
    - El programa cuenta con un menú de consola a partir del cual podremos escoger que platillo es el que queremos que sea horneado por nuestro empleados, dependiendo del elemento que sea, se utilizará el empleado especializado en ordenar esa pizza o pastel
    - Se recomienda solo ingresar datos númericos que correspondan a las opciones del menú disponibles, de lo contrario el programa le notificará que la opción es inválida.
    - Para agregar más platillos al restaurante, se debe agregar un nuevo método de cocinar en la clase `Director`, una nueva clase de empleado especializado en ese platillo, y la clase de ese platillo.

---

## Instrucciones de Ejecución

1. Entrar a la carpeta *Builder* (que es donde se encuentra el código fuente).
2. Abrir una terminal e ingresar el siguiente comando:
    1. `java PruebaBuilder`

## Versión de Java requerida

```java
java version "1.8.0_241"
Java(TM) SE Runtime Environment (build 1.8.0_241-b07)
Java HotSpot(TM) 64-Bit Server VM (build 25.241-b07, mixed mode)
```