package com.empleados.ms.service;

import com.empleados.ms.model.Empleado;

import java.util.List;

public interface EmpleadoService {

    List<Empleado> getEmpleados();

    void eliminarEmpleado(int id);

    void crearEmpleado(Empleado empleado);
}
