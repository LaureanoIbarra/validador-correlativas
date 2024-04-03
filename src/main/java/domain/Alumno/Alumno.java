package domain.Alumno;
import domain.Materia.Materia;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Alumno {
    private String legajo;
    private List<Materia> materiasAprobadas;

    public Alumno(String legajo) {
        this.legajo = legajo;
        this.materiasAprobadas = new ArrayList<>();
    }

    public String getLegajo() {
        return legajo;
    }

    public void setLegajo(String legajo) {
        this.legajo = legajo;
    }
    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }

    public void agregarMaterias(Materia... materias){
        Collections.addAll(this.materiasAprobadas, materias);
    }

    public Boolean cumpleCorrelatvivas(Materia materia){
        return this.materiasAprobadas.containsAll(materia.getCorrelativas());
    }
}
