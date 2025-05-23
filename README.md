# Conversor de Monedas

Este es un simple conversor de monedas desarrollado en Java. Permite al usuario elegir entre un menú de conversiones predefinidas y muestra el resultado.

## Funcionalidades

* Muestra un menú de conversiones predefinidas:
    -  Dólar a Peso Argentino
      
    -  Peso Argentino a Dólar
       
    -  Dólar a Real Brasileño
       
    -  Real Brasileño a Dólar
       
    -  Dólar a Peso Colombiano
       
    -  Peso Colombiano a Dólar
 
      
      
* Permite al usuario ingresar la cantidad a convertir.
* Utiliza una API externa (`exchangerate-api.com`) para obtener las tasas de cambio en tiempo real.
* Muestra el resultado de la conversión en la consola.

## Cómo usar

1.  **Abrir el proyecto en IntelliJ IDEA (o cualquier IDE de Java).**

2.  **Ejecutar la clase `Principal.java`.**

3.  **En la consola, se mostrará el menú de opciones. Ingresa el número de la conversión deseada.**

4.  **Luego, ingresa la cantidad que deseas convertir y presiona Enter.**

5.  **El resultado de la conversión se mostrará en la consola.**

## Menu de interaccion:

### Seleccion de operacion

![Seleccion de operacion](images/ingresodivisas.png)
### Ingreso de divisas para el cambio 

![ingreso divisas.png](images/ingresodivisas.png)

## Tecnologías utilizadas

* Java
* Gson (para el manejo de JSON)
* Java HTTP Client (para las peticiones a la API)
* [ExchangeRate-API](https://www.exchangerate-api.com/) (como fuente de las tasas de cambio)


## Autor

Camilo E Giraldo.

Perfil Gthub: https://github.com/CamiloGDZ


