public class ParImpar {
    public static void main(String[] args) {
        int numero = 5;
        String resultado = (numero % 2 == 0) ? "par" : "impar";
        System.out.println("El número " + numero + " es " + resultado);
    }
}
