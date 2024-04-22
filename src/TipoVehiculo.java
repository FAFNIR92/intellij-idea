public class TipoVehiculo {
    public static void main(String[] args) {
        int codigoVehiculo = 2;
        String tipoVehiculo;

        switch (codigoVehiculo) {
            case 1:
                tipoVehiculo = "Automóvil";
                break;
            case 2:
                tipoVehiculo = "Motocicleta";
                break;
            case 3:
                tipoVehiculo = "Camión";
                break;
            case 4:
                tipoVehiculo = "Bicicleta";
                break;
            default:
                tipoVehiculo = "Vehículo desconocido";
                break;
        }

        System.out.println("El código " + codigoVehiculo + " corresponde al tipo de vehículo: " + tipoVehiculo);
    }
}
