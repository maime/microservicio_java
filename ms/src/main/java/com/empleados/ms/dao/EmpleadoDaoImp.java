package com.empleados.ms.dao;

import com.empleados.ms.model.Empleado;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class EmpleadoDaoImp implements EmpleadoDao {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    @Transactional
    public List<Empleado> getEmpleado() {
        String query = "FROM Empleado";
        return entityManager.createQuery(query).getResultList();

    }

    @Override
    public void eliminar(int id) {
        Empleado empleado = entityManager.find(Empleado.class, id);
        entityManager.remove(empleado);
    }

    @Override
    public void crear(Empleado empleado) {
        entityManager.merge(empleado);
    }
}
