package domain.Inscripcion;

import domain.Alumno.Alumno;
import domain.Materia.Materia;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.Assert;

public class InscripcionTest extends TestCase {

    @Test
    public void testAprobada() {
        Materia am1 = new Materia("AM1");
        Materia aga = new Materia("Algebra y geometria analitica");
        Materia am2 = new Materia("AM2");
        am2.agregarCorrelativas(aga, am1);
        Alumno alumno1 = new Alumno("1234567");
        alumno1.agregarMaterias(am1, aga);
        Inscripcion inscripcion1 = new Inscripcion(am2, alumno1);

        Assert.assertEquals(true, inscripcion1.aprobada());

    }
    @Test
    public void testDesaprobado() {
        Materia am1 = new Materia("AM1");
        Materia aga = new Materia("Algebra y geometria analitica");
        Materia am2 = new Materia("AM2");
        am2.agregarCorrelativas(aga, am1);
        Alumno alumno2 = new Alumno("1234568");
        alumno2.agregarMaterias(aga);
        Inscripcion inscripcion1 = new Inscripcion(am2, alumno2);

        Assert.assertEquals(false, inscripcion1.aprobada());
    }
}