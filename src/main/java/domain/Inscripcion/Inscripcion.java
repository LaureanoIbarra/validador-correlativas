package domain.Inscripcion;

import domain.Alumno.Alumno;
import domain.Materia.Materia;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {

    private Materia materia;
    private Alumno alumno;

    public Inscripcion(Materia materia, Alumno alumno) {
        this.materia = materia;
        this.alumno = alumno;
    }


    public Boolean aprobada(){
        return alumno.cumpleCorrelatvivas(materia);
    }

}
