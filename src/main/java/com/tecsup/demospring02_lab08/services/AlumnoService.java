package com.tecsup.demospring02_lab08.services;
import com.tecsup.demospring02_lab08.model.Alumno;
import java.util.List;

public interface AlumnoService {
    List<Alumno> listar();
    Alumno obtener(Long id);
    void crear(Alumno alumno);
    void actualizar(Alumno alumno);
    void eliminar(Long id);
}
