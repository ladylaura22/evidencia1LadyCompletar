public class Vehiculo {
    private String codigo; // Código único del vehículo
    private String marca; // Marca del vehículo
    private String tipo; // Tipo de vehículo (Auto, Camioneta, Motocicleta)
    private int modelo; // Año del modelo
    private double kilometraje; // Kilometraje del vehículo

    // Constructor de la clase Vehiculo
    // EL METODO CONSTRUCTOR SE UTILIZA PARA PREDEFINIR VALORES O INICIALIZAR LAS VARIABLES.
    public Vehiculo(String codigo, String marca, String tipo, int modelo, double kilometraje) {
        this.codigo = codigo;
        this.marca = marca;
        this.tipo = tipo;
        this.modelo = modelo;
        this.kilometraje = kilometraje; // EL PARAMETRO SE INICIALIZA COMO KILOMETRAJE
    }

    // Métodos getter para obtener los valores de los atributos
    // LOS METODOS GET SE USAN PARA MOSTRAR VALORES QUE ESTÁN ENCAPSULADOS
    public String getCodigo() {
        return codigo;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }

    public int getModelo() {
        return modelo;
    }

    public double getKilometraje() {
        return kilometraje;
    }

    // Método toString para representar la información del vehículo en texto
    // ESTE METODO NOS PERMITE VER LOS ATRIBUTPS COMO STRINGS
    @Override
    public String toString() {
        return "[Codigo: " + codigo + ", Marca: " + marca + ", Tipo: " + tipo + ", Modelo: " + modelo + ", Kilometraje: " + kilometraje + "]";
    }
}
// AQUI SE EVIDENCIA UNO DE LOS PILARES: LA HERENCIA
// Clases derivadas de Vehiculo
class Auto extends Vehiculo {
    // Constructor de la clase Auto
    // LA CLASE SUPER HEREDA LOS ATRIBUTOS DE LA CLASE PADRE, PERO YA TIENE DEFINIDO EL TIPO
    public Auto(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, "Auto", modelo, kilometraje); // Llama al constructor de Vehiculo
    }
}
//SE CONVIERTE EN CLASE CAMIONETA
class Camioneta extends Vehiculo {
    // Constructor de la clase Camioneta
    public Camioneta(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca,"Camioneta", modelo, kilometraje); // Llama al constructor de Vehiculo
    }
}


class Motocicleta extends Vehiculo {
    // Constructor de la clase Motocicleta
    public Motocicleta(String codigo, String marca, int modelo, double kilometraje) {
        super(codigo, marca, "Motocicleta", modelo, kilometraje);
    }
}
