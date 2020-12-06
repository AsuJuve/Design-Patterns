# README

### **Nombre del Alumno:**

- Juventino Aguilar Correa

### **Matrícula:**

- 39203872

### Patrón de Diseño implementado:

- Observer
    - En esta solución utilicé el patrón *Observer*, ya que este es un problema muy común para este patrón, donde tenemos varios objetos (en este caso los de la clase `Suscriptor`) que observan los cambios de estado de otro objeto (en este ejemplo sería la clase `Redactor`).
    - De esta forma la implementación es muy simple, teniendo el objeto `RedactorConcreto` una lista de suscriptores puede agregar o eliminarlos con los métodos `agregarSuscriptores()` y `eliminarSuscriptores()` respectivamente , solo nos queda el de notificarles cuando el nuevo periodico esté listo (lo cual sería nuestra lógica de negocio). Esto último se logra mediante el método `notificarNuevoPeriodico()`, el cual manda llamar el método `serNotificado()` de cada `SuscriptorConcreto`.
    - El programa cuenta con un menu de consola, y desde ahí se pueden realizar todas las acciones descritas en los puntos anteriores. Se recomienda que el ingresar el Nombre y Correo de un nuevo suscriptor sea sin utilizar espacios, para que los datos sean tomados de manera correcta. Y además también se recomienda que cuando el programa solicite un número (para elegir un suscriptor o una opcion), se ingrese un valor numérico y no una cadena de caracteres (el sistema lo tomara como una opcion inválida y se lo hará saber al usuario)

---

## Instrucciones de Ejecución

1. Entrar a la carpeta *Observer* (que es donde se encuentra el código fuente).
2. Abrir una terminal e ingresar el siguiente comando:
    1. `java PruebaObserver`

## Versión de Java requerida

```java
java version "1.8.0_241"
Java(TM) SE Runtime Environment (build 1.8.0_241-b07)
Java HotSpot(TM) 64-Bit Server VM (build 25.241-b07, mixed mode)
```