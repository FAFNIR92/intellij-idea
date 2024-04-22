public class Increment {
    public static void main(String[] args) {
        int x = 5;

        int resultadoIncrementoPrefijo = ++x;
        System.out.println("Incremento prefijo: " + resultadoIncrementoPrefijo);

        int resultadoDecrementoSufijo = x--;
        System.out.println("Decremento sufijo: " + resultadoDecrementoSufijo);
        System.out.println("Valor actual de x: " + x);

        int resultadoIncrementoSufijo = x++;
        System.out.println("Incremento sufijo: " + resultadoIncrementoSufijo);
        System.out.println("Valor actual de x: " + x);
    }
}
