import java.util.Collections;
import java.util.LinkedList;

public class Carrera implements Informacion,Comparable<Carrera> {
    private String nombre;
    public LinkedList<Materia> coleccionMateria;

    public Carrera(String nombre) {
        this.nombre = nombre;
        this.coleccionMateria = new LinkedList<Materia>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void agregarMateria(Materia materias){
        coleccionMateria.add(materias);
    }

    public boolean encontrarMateria(String NombreMateria) {
        boolean ExistenciaDeLaMateria = false;
        for (Materia materia : coleccionMateria) {
            if (materia.getNombre().equals(NombreMateria)) {
                ExistenciaDeLaMateria = true;
                break;
            }
        }
        return ExistenciaDeLaMateria;
    }

    public boolean eliminarMateria(String NombreMateria) {
        boolean ExistenciaDeLaMateria = false;
        for (Materia materia : coleccionMateria) {
            if (materia.getNombre().equals(NombreMateria)) {
                coleccionMateria.remove(materia);
                ExistenciaDeLaMateria = true;
                break;
            }
        }
        return ExistenciaDeLaMateria;
    }
    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                '}';
    }

    public void mostrarMaterias() {
        for (Materia materia : coleccionMateria) {
            System.out.println(" "+ materia.toString());
        }
    }

    @Override
    public void Vercantidad() {
        System.out.println("\n cantidad de materias en la carrera: "+coleccionMateria.size());
    }

    @Override
    public void listarcontenido() {
        Collections.sort(coleccionMateria);
        for (Materia materia: coleccionMateria) {
            System.out.println(materia.toString());
        }
    }

    @Override
    public int compareTo(Carrera o) {
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