package com.empleados.ms.controllers;

import com.empleados.ms.dao.EmpleadoDao;
import com.empleados.ms.model.Empleado;
import com.empleados.ms.service.EmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpleadoController {

    @Autowired
    //private EmpleadoDao empleadoDao;
    private EmpleadoService empleadoService;

    //@RequestMapping(value = "api/v1/empleados", method = RequestMethod.GET)
    @GetMapping(value = "api/v1/empleados", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Empleado> getEmpleado() {
        return empleadoService.getEmpleados();
    }

    //@RequestMapping(value = "api/v1/empleados", method = RequestMethod.POST)
    @PostMapping(value = "api/v1/empleados", produces = MediaType.APPLICATION_JSON_VALUE)
    public void crear(@RequestBody Empleado empleado) {
        empleadoService.crearEmpleado(empleado);
    }

    //@RequestMapping(value = "api/v1/empleados/{id}", method = RequestMethod.DELETE)
    @DeleteMapping(value = "api/v1/empleados/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void eliminar(@PathVariable int id) {
        empleadoService.eliminarEmpleado(id);
    }

}
