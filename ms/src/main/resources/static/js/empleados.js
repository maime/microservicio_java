$(document).ready(function(){
    cargarEmpleados();
    $("#dataTable").DataTable();
});

async function cargarEmpleados(){
    const rawResponse = await fetch('/api/v1/empleados', {
    method: 'GET',
    headers: {
      'Accept': 'application/json',
      'Content-Type': 'application/json'
    },
  });
  const empleados = await rawResponse.json();

  let htmlTabla = '';
  for(let empleado of empleados){
    let empleadoHtml = '<tr><td>'+
    empleado.id+'</td><td>'+
    empleado.nombre+'</td><td>'+
    empleado.edad+'</td><td>'+
    empleado.cargo+'</td><td>'+
    empleado.anios+'</td><td>'+
    '<a href="#" class="btn btn-danger btn-circle btn-sm" onclick="eliminarEmpleado('+empleado.id+')"><i class="fas fa-trash btn-sm"></i></a>'+
    '</td></tr>'
    htmlTabla += empleadoHtml;
  }
  $("#dataTable tbody").html(htmlTabla);


  //return empleados;
  }

  async function eliminarEmpleado(id){
  if (!confirm('¿Desea eliminar empleado?')) {
      return;
    }

  const rawResponse = await fetch('/api/v1/empleados/'+id, {
      method: 'DELETE',
      headers: {
        'Accept': 'application/json',
        'Content-Type': 'application/json'
      },
    });
    //const empleados = await rawResponse.json();
    location.reload();
  }

