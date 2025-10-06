public class Motocicleta extends Vehiculo implements Combustible, Mantenimiento {
    private int cilindrada;
    private double nivelCombustible;
    private final double capacidadTanque = 20.0;


    public Motocicleta(String marca, String modelo, int anio, int cilindrada, double nivelCombustible) {
        super(marca, modelo, anio);
        this.cilindrada = cilindrada;
        this.nivelCombustible = Math.min(nivelCombustible, capacidadTanque);
    }


    @Override
    public void mover() {
        if (nivelCombustible > 0) {
            System.out.println("La motocicleta " + marca + " " + modelo + " está acelerando con " + cilindrada + " cc.");
            nivelCombustible -= 0.3;
            if (nivelCombustible < 0) nivelCombustible = 0;
        } else {
            System.out.println("La motocicleta " + marca + " " + modelo + " no tiene combustible.");
        }
    }


    @Override
    public String obtenerDetalles() {
        return super.obtenerDetalles() + ", Cilindrada: " + cilindrada + " cc, Combustible: " + nivelCombustible + " L";
    }


    @Override
    public void recargarCombustible() {
        nivelCombustible = capacidadTanque;
        System.out.println("La motocicleta " + marca + " " + modelo + " ha sido recargada (" + capacidadTanque + " L).");
    }


    @Override
    public double obtenerNivelCombustible() {
        return nivelCombustible;
    }


    @Override
    public void realizarMantenimiento() {
        System.out.println("Cambiando aceite y revisando cadena de la motocicleta " + marca + " " + modelo + ".");
    }
}
