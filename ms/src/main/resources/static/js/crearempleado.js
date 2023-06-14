    async function crearEmpleado(id){
    if (!confirm('¿Desea crear empleado?')) {
        return;
      }

    let datos = {};

    datos.nombre = document.getElementById("nombre").value;
    datos.edad = document.getElementById("edad").value;
    datos.pais = document.getElementById("pais").value;
    datos.cargo = document.getElementById("cargo").value;
    datos.anios = document.getElementById("anios").value;

    const rawResponse = await fetch('/api/v1/empleados', {
        method: 'POST',
        headers: {
          'Accept': 'application/json',
          'Content-Type': 'application/json'
        },
      body: JSON.stringify(datos)
        });
        alert("Empleado registrado con exito!");
        window.location.href = 'empleados.html'
    }