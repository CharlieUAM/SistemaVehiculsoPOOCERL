public class main {


    public static void procesarVehiculos(Vehiculo[] vehiculos) {
        for (Vehiculo v : vehiculos) {
            System.out.println("-----");
            v.mover();
            System.out.println(v.obtenerDetalles());


            if (v instanceof Combustible) {
                Combustible c = (Combustible) v;
                System.out.println("Nivel de combustible actual: " + c.obtenerNivelCombustible() + " L");
                c.recargarCombustible();
                System.out.println("Nivel de combustible después de recarga: " + c.obtenerNivelCombustible() + " L");
            }


            if (v instanceof Mantenimiento) {
                ((Mantenimiento) v).realizarMantenimiento();
            }
        }
    }


    public static void main(String[] args) {
        Vehiculo auto = new Automovil("Toyota", "Corolla", 2020, 40.0);
        Vehiculo bici = new Bicicleta("Trek", "Mountain", 2022, 21);
        Vehiculo moto = new Motocicleta("Honda", "CBR", 2021, 250, 5.0);


        System.out.println("=== Pruebas rápidas ===");
        auto.mover();
        System.out.println(auto.obtenerDetalles());


        bici.mover();
        System.out.println(bici.obtenerDetalles());


        moto.mover();
        System.out.println(moto.obtenerDetalles());


        System.out.println("\n=== Procesando arreglo de vehículos ===");
        Vehiculo[] parque = { auto, bici, moto };
        procesarVehiculos(parque);
    }
}