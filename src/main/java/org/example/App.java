package org.example;

import domain.Alumno.Alumno;
import domain.Inscripcion.Inscripcion;
import domain.Materia.Materia;


public class App
{
    public static void main( String[] args ){
        Materia am1 = new Materia("AM1");
        Materia f1 = new Materia("Fisica 1");
        Materia am2 = new Materia("AM2");
        am2.agregarCorrelativas(am1, f1);
        Alumno a = new Alumno("123");
        a.agregarMaterias(am1, f1);
        Inscripcion i = new Inscripcion(am2, a);

        System.out.print(i.aprobada());
    }
}
