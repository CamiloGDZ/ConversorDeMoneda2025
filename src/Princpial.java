
public class Princpial {
    public static void main(String[] args) {
        ConsultaConversion consulta = new ConsultaConversion();
        Calculos calculos = new Calculos(consulta);
        calculos.almacenarValores();

        String monedaBase = calculos.getMonedaBase();
        String monedaCambio = calculos.getMonedaCambio();
        double cantidad = calculos.getCantidad();

        String resultadoConversion = consulta.buscaConversion(monedaBase, monedaCambio,cantidad);
        System.out.println("El resultado es:  "+ resultadoConversion);

    }
}
