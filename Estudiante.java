/*7)La materia de estructura de datos tiene un rango de calificaciones, el jefe de programa requiere saber
cuáles de los estudiantes están por encima de 4, cuales estudiantes están por debajo de 4 y por encima de 3
y cuales están por debajo de tres, el jefe de programa solicito el nombre, apellido, carnet, semestre
y promedio hasta la fecha, los estudiantes deben estar agrupados por promedio y mostrar cada grupo
realizado por Camila Zapata David*/


public class Estudiante {
    private String nombre, apellido, carnet;
    private int semestre;
    private double promedio;

    public Estudiante(String nombre, String apellido, String carnet, int semestre, double promedio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.semestre = semestre;
        this.promedio = promedio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getCarnet() {
        return this.carnet;
    }

    public int getSemestre() {
        return this.semestre;
    }

    public double getPromedio() {
        return this.promedio;
    }

    @Override
    public String toString() {
        return "Estudiantes [nombre=" + nombre + ", apellido=" + apellido + ", carnet=" + carnet + ", semestre="
                + semestre + ", promedio=" + promedio + "]";
    }

}
