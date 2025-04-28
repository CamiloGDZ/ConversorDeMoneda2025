import java.util.Scanner;

public class Calculos {
    private String monedaBase;
    private String monedaCambio;
    private double cantidad;

    Scanner lectura = new Scanner(System.in);


    ConsultaConversion conversion;

    public Calculos(ConsultaConversion conversion) {
        this.conversion = conversion;
    }

    public String getMonedaBase() {
        return monedaBase;
    }

    public String getMonedaCambio() {
        return monedaCambio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void almacenarValores(){
        String menu = """
            \n***************************************************
            *** Sea bienvenido al Conversor de Monedas ***

            1) Dolar ---> Peso Argentino
            2) Peso Argentino ==>> Dolar
            3) Dolar ---> Real Brasileño
            4) Real Brasileño  ---> Dolar
            5) Dolar ---> Peso Colombiano
            6) Peso Colombiano ---> Dolar


            7) Salir
            ***************************************************
            """;

        System.out.println(menu);
        System.out.println("Ingrese el número de la opción deseada:");
        int opcion = Integer.parseInt(lectura.nextLine());

        switch (opcion) {
            case 1:
                this.monedaBase = "USD";
                this.monedaCambio = "ARS";
                break;
            case 2:
                this.monedaBase = "ARS";
                this.monedaCambio = "USD";
                break;
            case 3:
                this.monedaBase = "USD";
                this.monedaCambio = "BRL";
                break;
            case 4:
                this.monedaBase = "BRL";
                this.monedaCambio = "USD";
                break;
            case 5:
                this.monedaBase = "USD";
                this.monedaCambio = "COP";
                break;
            case 6:
                this.monedaBase = "COP";
                this.monedaCambio = "USD";
                break;
            case 7:
                System.out.println("Gracias por usar nuestro Conversor");
                System.exit(0); // Termina la ejecución del programa
                break;
            default:
                System.out.println("Opción inválida. Por favor, ingrese un número del 1 al 7.");
                // Podríamos agregar lógica para volver a mostrar el menú aquí
                break;
        }

        if (opcion >= 1 && opcion <= 6) {
            System.out.println("Ingrese el valor que deseas convertir:");
            this.cantidad = Double.parseDouble(lectura.nextLine());
        }
    }
}





