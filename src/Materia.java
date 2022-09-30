import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;


public class Materia implements Comparable<Materia>, Informacion {
    private String nombre;
    public Profesor titular;
    public LinkedList<Estudiante> coleccionEstudiantes;

    public Materia(String nombremateria, Profesor titular){
        this.nombre = nombremateria;
        this.titular = titular;
        this.coleccionEstudiantes = new LinkedList<Estudiante>();
    }


    public void eliminarEstudiante(int legajo){
        boolean ExistenciaDelAlumno = false;
        for(Estudiante estudiante: coleccionEstudiantes){
            if(estudiante.getLegajo()==legajo){
                coleccionEstudiantes.remove(estudiante);
                ExistenciaDelAlumno = true;
                break;
            }
        }
    }

    public void agregarEstudiante(Estudiante estudianteNuevo){
        this.coleccionEstudiantes.add(estudianteNuevo);
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                ", titular=" + titular +

                '}';
    }

    public void listarEstudiantes(){
        for (Estudiante estudiante: coleccionEstudiantes) {
            System.out.println(estudiante.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void Vercantidad() {
        System.out.println("\n cantidad de estudiantes en la materia: "+coleccionEstudiantes.size());
    }

    @Override
    public void listarcontenido() {
        Collections.sort(coleccionEstudiantes);
        for (Estudiante estudiante: coleccionEstudiantes) {
            System.out.println(estudiante.toString());
        }
    }

    @Override
    public int compareTo(Materia o) {
        int salida;
        if (o.getNombre().compareToIgnoreCase(this.nombre)==0) {
            if (o.getNombre().compareToIgnoreCase(this.nombre) > 0) {
                salida = -1;
            } else if (o.getNombre().compareToIgnoreCase(this.nombre) < 0) {
                salida = 1;
            } else {
                salida = 0;
            }
        }else if (o.getNombre().compareToIgnoreCase(this.nombre)>0){
            salida= -1;
        }else {
            salida = 1;
        }
        return salida;
    }
}