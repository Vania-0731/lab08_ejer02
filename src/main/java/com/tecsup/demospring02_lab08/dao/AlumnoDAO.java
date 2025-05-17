package com.tecsup.demospring02_lab08.dao;

import com.tecsup.demospring02_lab08.model.Alumno;

import java.util.List;

public interface AlumnoDAO {
    List<Alumno> listar();
    Alumno buscarPorId(Long id);
    void guardar(Alumno alumno);
    void actualizar(Alumno alumno);
    void eliminar(Long id);
}
