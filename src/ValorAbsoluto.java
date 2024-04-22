public class ValorAbsoluto {
    public static void main(String[] args) {
        int numero = -7;
        int valorAbsoluto = (numero >= 0) ? numero : -numero;
        System.out.println("El valor absoluto de " + numero + " es " + valorAbsoluto);
    }
}
