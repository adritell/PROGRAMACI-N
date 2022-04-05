package Entrega_UD6UD7;


import java.io.*;
import java.util.*;

public class uso_alumno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Set<Alumno> setalum = new TreeSet<>();
        Map<String, Alumno> alumnos = new LinkedHashMap<>();

        String opcion;

        do {
            mostrarMenu();
            System.out.println("Introduce la opcion");
            opcion = teclado.nextLine();
            switch (opcion) {

                case "1":
                    String dni_alumno, nombre_alumno, apellidos_alumno,
                            direccion_alumno, email_alumno, curso_alumno, respuesta_alumno;
                    boolean dual_alumno;
                    System.out.println("Introduce el dni del alumno a insertar:");
                    dni_alumno = teclado.nextLine();
                    System.out.println("Introduce el nombre del alumno a insertar:");
                    nombre_alumno = teclado.nextLine();
                    System.out.println("Introduce los apellidos del alumno a insertar:");
                    apellidos_alumno = teclado.nextLine();
                    System.out.println("Introduce la direccion del alumno a insertar:");
                    direccion_alumno = teclado.nextLine();
                    System.out.println("Introduce el email del alumno a insertar:");
                    email_alumno = teclado.nextLine();
                    System.out.println("Introduce el curso del alumno a insertar:");
                    curso_alumno = teclado.nextLine();
                    System.out.println("Indica si el alumno a insertar es dual o no(s/n):");
                    respuesta_alumno = teclado.nextLine();
                    if (respuesta_alumno.equalsIgnoreCase("s")) {
                        dual_alumno = true;
                    } else {
                        dual_alumno = false;
                    }

                    Alumno a = new Alumno(dni_alumno, nombre_alumno, apellidos_alumno, direccion_alumno,
                            email_alumno, curso_alumno, dual_alumno);

                    alumnos.put(dni_alumno, a);

                    setalum.add(a);
                    break;

                case "2":
                    String clave;
                    System.out.println("Introduce el dni del alumno que quieras borrar:");
                    clave = teclado.nextLine();

                    if (alumnos.containsKey(clave)) {
                        alumnos.remove(clave);
                    }
                    System.out.println("El alumno no existe");

                    break;
                case "3":
                    System.out.println(setalum);

                    break;
                case "4":
                    System.out.println("Introduce el curso del alumno que quieras mostrar");
                    String curso = teclado.nextLine();

                    if (alumnos.containsValue(curso)) {
                        System.out.println();
                    }
                    System.out.println("El curso no existe");

                    break;
                case "5":
                    String nombre;
                    String DNI;
                    String apellidos, direccion, email, cursos;

                    System.out.println("Introduce DNI del alumno a modificar:");
                    DNI = teclado.nextLine();

                    if (alumnos.containsKey(DNI)) {
                        System.out.println("Introduce el nombre");
                        nombre = teclado.nextLine();
                        System.out.println("Introduce los apellidos");
                        apellidos = teclado.nextLine();
                        System.out.println("Introduce la direccion");
                        direccion = teclado.nextLine();
                        System.out.println("Introduce el email");
                        email = teclado.nextLine();
                        System.out.println("Introduce el curso");
                        cursos = teclado.nextLine();
                        System.out.println("Indica si el alumno es dual o no(s/n):");
                        String respuesta = teclado.nextLine();


                        a = alumnos.get(DNI);

                        a.setNombre(nombre);
                        a.setApellidos(apellidos);
                        a.setDireccion(direccion);
                        a.setEmail(email);
                        a.setCurso(cursos);
                        if (respuesta.equalsIgnoreCase("s")) {
                            a.setDual(true);
                        }
                        a.setDual(false);


                    }
                    System.out.println("Ese alumno no existe");


                    break;
                case "6":
                    ObjectOutputStream out = null;
                    try {
                        out = new ObjectOutputStream(new FileOutputStream("alumnos.dat",true));

                        Collection<Alumno> lista = alumnos.values();
                        for (Alumno alumno : lista) {
                            out.writeObject(alumno);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    } finally {
                        try {
                            out.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }

                    }
                    System.out.println(alumnos);
                    System.out.println(setalum);

            }
        } while (!opcion.equals("6"));
    }

    public void borrarAlumno() {

    }

    public static void mostrarMenu() {

        System.out.println("1.INSERTAR ALUMNO");
        System.out.println("2.BORRAR ALUMNO");
        System.out.println("3.MOSTRAR ALUMNO");
        System.out.println("4.MOSTAR ALUMNOS DE UN CURSO");
        System.out.println("5.MODIFICAR ALUMNO");
        System.out.println("6.SALIR");
    }
}