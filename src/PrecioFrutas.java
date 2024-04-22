public class PrecioFrutas {
    public static void main(String[] args) {
        String fruta = "manzana";
        double precio = (fruta.equals("manzana")) ? 0.5 : (fruta.equals("pera")) ? 0.6 : (fruta.equals("naranja")) ? 0.7 : 0.0;
        String mensaje = (precio != 0.0) ? "El precio de " + fruta + " es $" + precio + " por kilogramo." : "Lo siento, no tenemos el precio de la fruta ingresada.";
        System.out.println(mensaje);
    }
}
