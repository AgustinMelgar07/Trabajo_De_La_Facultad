import static java.lang.Integer.parseInt;
public class Estudiante extends Persona  implements Comparable<Estudiante>{


    public Estudiante(String nombre, String apellido, int legajo) {
        super(nombre, apellido, legajo);
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setNombre(String nombre) {
        super.setNombre(nombre);
    }

    @Override
    public String getApellido() {
        return super.getApellido();
    }

    @Override
    public void setApellido(String apellido) {
        super.setApellido(apellido);
    }

    @Override
    public int getLegajo() {
        return super.getLegajo();
    }

    @Override
    public void setLegajo(int legajo) {
        super.setLegajo(legajo);
    }

    @Override
    public void ModificarDatos(String nombre, String apellido, String nroLeg) {
        super.setNombre(nombre);
        super.setApellido(apellido);
        super.setLegajo(Integer.parseInt(String.valueOf(parseInt(nroLeg))));
    }



    @Override
    public String toString() {
        return  "Persona{" +
                "nombre='" +  nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", legajo=" + legajo +
                '}';
    };

    @Override
    public int compareTo(Estudiante o) {
        int salida;
        if (o.getApellido().compareToIgnoreCase(this.apellido)==0) {
            if (o.getNombre().compareToIgnoreCase(this.nombre) > 0) {
                salida = -1;
            } else if (o.getNombre().compareToIgnoreCase(this.nombre) < 0) {
                salida = 1;
            } else {
                salida = 0;
            }
        }else if (o.getApellido().compareToIgnoreCase(this.apellido)>0){
            salida= -1;
        }else {
            salida = 1;
        }
            return salida;
    }
}