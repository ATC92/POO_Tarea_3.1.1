class Vehiculo {
    // Atributos de la clase padre
    private String marca;
    private String modelo;
    private int año;
    private double kilometraje;
    private double precioPorDia;

    // Constructor
    public Vehiculo(String marca, String modelo, int año, double kilometraje, double precioPorDia) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.kilometraje = kilometraje;
        this.precioPorDia = precioPorDia;
    }

    // Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(double kilometraje) {
        this.kilometraje = kilometraje;
    }

    public double getPrecioPorDia() {
        return precioPorDia;
    }

    public void setPrecioPorDia(double precioPorDia) {
        this.precioPorDia = precioPorDia;
    }

    // Calcular el costo del alquiler basado en el numero de dias
    public double calcularCostoAlquiler(int dias) {
        return dias * precioPorDia;
    }

    // Metodo toString
    @Override
    public String toString() {
        return "Vehiculo [Marca=" + marca + ", Modelo=" + modelo + ", Año=" + año + ", Kilometraje=" + kilometraje + " km, Precio por día=" + precioPorDia + "]";
    }
}

class Automovil extends Vehiculo {
    // Atributos especificos de la clase hija
    private int cantidadDePuertas;
    private String tipoDeCombustible;

    // Constructor
    public Automovil(String marca, String modelo, int año, double kilometraje, double precioPorDia, int cantidadDePuertas, String tipoDeCombustible) {
        super(marca, modelo, año, kilometraje, precioPorDia);
        this.cantidadDePuertas = cantidadDePuertas;
        this.tipoDeCombustible = tipoDeCombustible;
    }

    // Getters y Setters
    public int getCantidadDePuertas() {
        return cantidadDePuertas;
    }

    public void setCantidadDePuertas(int cantidadDePuertas) {
        this.cantidadDePuertas = cantidadDePuertas;
    }

    public String getTipoDeCombustible() {
        return tipoDeCombustible;
    }

    public void setTipoDeCombustible(String tipoDeCombustible) {
        this.tipoDeCombustible = tipoDeCombustible;
    }

    // Metodo toString
    @Override
    public String toString() {
        return super.toString() + ", Automovil [Cantidad de Puertas=" + cantidadDePuertas + ", Tipo de Combustible=" + tipoDeCombustible + "]";
    }
}

public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Automovil
        Automovil auto1 = new Automovil("Toyota", "Corolla", 2020, 15000, 50.0, 4, "Gasolina");

        // Mostrar la informacion del automovil
        System.out.println(auto1);

        // Calcular el costo del alquiler por 5 dias
        double costoAlquiler = auto1.calcularCostoAlquiler(5);
        System.out.println("Costo de alquiler por 5 dias: $" + costoAlquiler);

        // Cambiar el tipo de combustible y la cantidad de puertas
        auto1.setTipoDeCombustible("Electrico");
        auto1.setCantidadDePuertas(2);

        // Mostrar la informacion actualizada del automovil
        System.out.println("Informacion actualizada del automovil:");
        System.out.println(auto1);
    }
}
