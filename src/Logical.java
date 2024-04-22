public class Logical {
    public static void main(String[] args) {
        boolean x = true;
        boolean y = false;

        boolean resultadoAnd = x && y;
        System.out.println("Resultado AND: " + resultadoAnd);

        boolean resultadoOr = x || y;
        System.out.println("Resultado OR: " + resultadoOr);

        boolean resultadoNot = !x;
        System.out.println("Resultado NOT: " + resultadoNot);
    }
}
