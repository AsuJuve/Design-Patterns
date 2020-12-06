# README

### **Nombre del Alumno:**

- Juventino Aguilar Correa

### **Matrícula:**

- 39203872

### Patrón de Diseño implementado:

- Bridge
    - Decidí usar este patrón de diseño porque como en el tip que se nos da en la descripción del problema; se debe cambiar la herencia por composición. Entonces en lo que nos ayuda el *Bridge* es no tener que tener todas las combinaciones forma-color, si no que ahora una clase `Forma` se compone de una clase `Color` (y también un dato númerico, ésto solo para hacer más explícito el concepto de forma calculando su área y perímetro).
    - Siendo así esta referencia de un color desde una forma nuestro *Bridge.*
    - Cuando deseemos añadir un nuevo color o forma, simplemente hay que crear otra clase para éste, en el programa agregamos la clase `Verde` para hacer más claro éste ejemplo.

---

## Instrucciones de Ejecución

1. Entrar a la carpeta *Bridge* (que es donde se encuentra el código fuente).
2. Abrir una terminal e ingresar el siguiente comando:
    1. `java PruebaBridge`

## Versión de Java requerida

```java
java version "1.8.0_241"
Java(TM) SE Runtime Environment (build 1.8.0_241-b07)
Java HotSpot(TM) 64-Bit Server VM (build 25.241-b07, mixed mode)
```