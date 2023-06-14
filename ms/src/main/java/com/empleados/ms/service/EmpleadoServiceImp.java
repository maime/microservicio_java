package com.empleados.ms.service;

import com.empleados.ms.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.empleados.ms.dao.EmpleadoDao;
import com.empleados.ms.model.Empleado;
@Service
public class EmpleadoServiceImp implements EmpleadoService{

    @Autowired
    EmpleadoDao empleadoDao;
    @Override
    public List<Empleado> getEmpleados() {
        return empleadoDao.getEmpleado();
    }

    @Override
    public void eliminarEmpleado(int id) {
        empleadoDao.eliminar(id);
    }

    @Override
    public void crearEmpleado(Empleado empleado) {
        empleadoDao.crear(empleado);
    }
}
