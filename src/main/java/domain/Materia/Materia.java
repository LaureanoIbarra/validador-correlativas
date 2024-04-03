package domain.Materia;

import java.util.ArrayList;
import java.util.List;

public class Materia {
    private String nombreMateria;
    private List<Materia> correlativas;

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
        this.correlativas = new ArrayList<>();
    }

    public String getNombreMateria() {
        return nombreMateria;
    }
    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }
    public List<Materia> getCorrelativas() {
        return correlativas;
    }
}
