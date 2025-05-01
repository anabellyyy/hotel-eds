/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.modelo;

import hotel.utilidades.Utilidades;

/**
 *
 * anabel ramos
 */
public class Cliente {
    private static int contadorClientes = 0;
    private int codigo;
    private String nombre;
    private String dni;
    private String telefono;

    
    public Cliente(String nombre, String dni, String telefono) throws Exception {
        // Validación del DNI, si no es correcto no creará el objeto
    	
        Utilidades.validarDNI(dni); 
        this.setNombre(nombre);
        this.setDni(dni);
        this.setTelefono(telefono);
        this.codigo = obtenerNumeroCliente();
    }

        private static int obtenerNumeroCliente() {
        contadorClientes++;
        return contadorClientes;
    }
        /**
         creo los getter y setter con el metodo refactor
         */

    /* creo getter y setters*/
        
    public String mostrarInformacion() {
        return "Código: " + codigo + ", Nombre: " + getNombre() + ", DNI: " + getDni() + ", Teléfono: " + getTelefono();
    }

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
