import static java.lang.Integer.parseInt;

public class Profesor extends Persona {
    private double basico;
    private int antiguedad;

    public Profesor(String nombre, String apellido, int legajo)
    {
        super(nombre, apellido, legajo);
    }

    public double calcularSueldo(double sueldo,int antiguedad){
        return sueldo=sueldo+(sueldo*(antiguedad*0.10));

    }

    @Override
    public String toString() {
        return "Profesor: " +super.toString();
    }

    @Override
    public void ModificarDatos(String nombre, String apellido, String legajo) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(Integer.parseInt(String.valueOf(parseInt(legajo))));
    }
}
