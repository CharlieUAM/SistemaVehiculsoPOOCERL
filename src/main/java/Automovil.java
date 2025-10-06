public class Automovil extends Vehiculo implements Combustible, Mantenimiento {
    private double nivelCombustible;


    public Automovil(String marca, String modelo, int anio, double nivelCombustible) {
        super(marca, modelo, anio);
        this.nivelCombustible = nivelCombustible;
    }


    @Override
    public void mover() {
        if (nivelCombustible > 0) {
            System.out.println("El automóvil " + marca + " " + modelo + " está conduciendo.");
            nivelCombustible -= 0.5;
            if (nivelCombustible < 0) nivelCombustible = 0;
        } else {
            System.out.println("El automóvil " + marca + " " + modelo + " no tiene combustible.");
        }
    }


    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Combustible: " + nivelCombustible + " L";
    }


    @Override
    public void recargarCombustible() {
        nivelCombustible = 50.0;
        System.out.println("El automóvil " + marca + " " + modelo + " ha sido recargado (50 L).");
    }


    @Override
    public double obtenerNivelCombustible() {
        return nivelCombustible;
    }


    @Override
    public void realizarMantenimiento() {
        System.out.println("Revisando motor y niveles del automóvil " + marca + " " + modelo + ".");
    }
}