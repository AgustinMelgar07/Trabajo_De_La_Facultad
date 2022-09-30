import java.util.Scanner;
public class Main {

    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        Facultad f = new Facultad("UTN-Free");

        Carrera c1 = new Carrera("Programacion");
        Carrera c2 = new Carrera("Mecanica");
        Carrera c3 = new Carrera("profesorado");
        Carrera c4 = new Carrera("Arquitectura");


        //agregar carreras a la facultad
        f.coleccionCarreras.add(c1);
        f.coleccionCarreras.add(c2);
        f.coleccionCarreras.add(c3);
        f.coleccionCarreras.add(c4);
        System.out.println("\n-------------------------------------------------------------\n");
        System.out.println("Las carreras antes de ser eliminadas alguna: \n");
        f.mostrarCarreras();
        f.Vercantidad();
        System.out.println("\n-------------------------------------------------------------\n");


        //eliminar carreras de la facultad
        f.eliminarCarrera("profesorado");
        f.eliminarCarrera("Mecanica");
        System.out.println("\nLas carreras despues de ser eliminadas alguna: \n");
        f.mostrarCarreras();
        f.Vercantidad();


        Profesor Profe1 = new Profesor("Ricardo", "Alonso", 213);
        Profesor Profe2 = new Profesor("Federico", "Barassi", 312);


        Materia m1 = new Materia("Laboratorio de Computacion 2",Profe1);
        Materia m2 = new Materia("Programacion 2",Profe2);
        Materia m3 = new Materia("Ingles 2",null);
        Materia m4 = new Materia("Estadistica",null);



        Estudiante e1 = new Estudiante("Lucas","Villaboa",123);
        Estudiante e2 = new Estudiante("Agustin","Melgar",234);
        Estudiante e3 = new Estudiante("Juanchi","Nissen",345);
        Estudiante e4 = new Estudiante("Pedro","Messi",456);
        Estudiante e5 = new Estudiante("Diego","Sanchez",567);




        //agregar materias a una carrera
        c1.agregarMateria(m1);
        c1.agregarMateria(m2);
        c1.agregarMateria(m3);
        c1.agregarMateria(m4);


        System.out.println("\n-------------------------------------------------------------\n");
        System.out.println("\nLas Materias antes de ser eliminadas alguna: \n");

        //muestro materias de la carreras actualizadas
        c1.mostrarMaterias();
        c1.Vercantidad();

        System.out.println("\n-------------------------------------------------------------\n");


        System.out.println("\nLas Materias despues de ser eliminadas alguna: \n");

        c1.eliminarMateria("Ingles 2");
        c1.mostrarMaterias();
        c1.Vercantidad();

        System.out.println("\n-------------------------------------------------------------\n");


        if(c1.encontrarMateria("Estadistica")== true) {
            System.out.println("Â¿Desea eliminar esa materia? (1=(si), cualquier otro numero (no))");
            int respuesta = s.nextInt();
            System.out.println("\nLas Materias despues de tomar la desicion de eliminar o no una materia: \n");
            if (respuesta==1) {
                c1.eliminarMateria("Estadistica");
                c1.mostrarMaterias();
                c1.Vercantidad();

            } else if (respuesta !=1) {
                c1.mostrarMaterias();
                c1.Vercantidad();
            }
        }
        System.out.println("\n-------------------------------------------------------------\n");

        //agregar Materia
        m1.agregarEstudiante(e1);
        m1.agregarEstudiante(e2);
        m1.agregarEstudiante(e3);
        m1.agregarEstudiante(e4);
        m1.agregarEstudiante(e5);

        System.out.println("\nLos Estudiantes antes de ser eliminado alguno: \n");

        m1.listarEstudiantes();
        m1.Vercantidad();

        System.out.println("\n-------------------------------------------------------------\n");


        System.out.println("\nLos Estudiantes despues de ser eliminado alguno: \n");

        m1.eliminarEstudiante(456);
        m1.listarEstudiantes();
        m1.Vercantidad();

        System.out.println("\n-------------------------------------------------------------\n");


        System.out.println("Datos del progfesor titular sin modificar: ");
        System.out.println(m1.toString());
        System.out.println("\n-------------------------------------------------------------\n");


        Profe1.ModificarDatos("Marcos","Soler","213");

        System.out.println(m1.toString());
        System.out.println("\n-------------------------------------------------------------\n");

        System.out.println("El sueldo del "+Profe1+" , Sueldo:"+Profe1.calcularSueldo(100000,5));
        System.out.println("\n-------------------------------------------------------------\n");

        System.out.println("lista de carreras ordenada\n");
        f.listarcontenido();

        System.out.println("\n-------------------------------------------------------------\n");

        System.out.println("lista de materias ordenada\n");
        c1.listarcontenido();

        System.out.println("\n-------------------------------------------------------------\n");


        System.out.println("lista de estudiantes ordenada\n");
        m1.listarcontenido();

        System.out.println("\n-------------------------------------------------------------\n");

    }

}