package com.empleados.ms.dao;

import com.empleados.ms.model.Empleado;

import java.util.List;

public interface EmpleadoDao {
    List<Empleado> getEmpleado();

    void eliminar(int id);

    void crear(Empleado empleado);

}
