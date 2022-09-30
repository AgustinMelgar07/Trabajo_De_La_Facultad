import java.util.Collections;
import java.util.LinkedList;

public class Facultad implements Informacion {

    private String nombre;
    public LinkedList<Carrera> coleccionCarreras;

    public Facultad(String nombre) {
        this.nombre = nombre;
        this.coleccionCarreras = new LinkedList<Carrera>();
    }


    public void agregarCarreras(Carrera carrerasNuevas) {
        coleccionCarreras.add(carrerasNuevas);
    }


    public void mostrarCarreras() {
        for (Carrera carreras : coleccionCarreras) {
            System.out.println(" "+ carreras.toString());
        }
    }
    public boolean eliminarCarrera(String nombreCarrera) {
        boolean ExistenciaDeLaCarrera = false;
        for (Carrera carrera : coleccionCarreras) {
            if (carrera.getNombre().equals(nombreCarrera)) {
                coleccionCarreras.remove(carrera);
                ExistenciaDeLaCarrera = true;
                break;
            }
        }
        return ExistenciaDeLaCarrera;
    }

    @Override
    public void Vercantidad() {
        System.out.println("\n cantidad de carreras en la facultad: "+coleccionCarreras.size());
    }

    @Override
    public void listarcontenido() {
        Collections.sort(coleccionCarreras);
        for (Carrera carrera: coleccionCarreras) {
            System.out.println(carrera.toString());
        }
    }
}