package domain.Inscripcion;

import domain.Alumno.Alumno;
import domain.Materia.Materia;

import java.util.ArrayList;
import java.util.List;

public class Inscripcion {

    private List<Materia> materias;
    private Alumno alumno;

    public Inscripcion(List<Materia> materias) {
        this.materias = new ArrayList<>();
    }
    public List<Materia> getMaterias() {
        return materias;
    }
    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }
}
