/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.ArrayList;
import java.util.Objects;

/**
 *
 * @author Dan_n
 */
public class Hospital {
    
    private String nombre;
    private String direccion;
    private int numeroCamas;
    private ArrayList<Empleado> listaEmpleados;
    private ArrayList<Paciente> listaPacientes;

    public Hospital(String nombre, String direccion, int numeroCamas) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroCamas = numeroCamas;
        this.listaEmpleados = new ArrayList<Empleado>();
        this.listaPacientes = new ArrayList<Paciente>();
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.nombre);
        hash = 97 * hash + Objects.hashCode(this.direccion);
        hash = 97 * hash + this.numeroCamas;
        hash = 97 * hash + Objects.hashCode(this.listaEmpleados);
        hash = 97 * hash + Objects.hashCode(this.listaPacientes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Hospital other = (Hospital) obj;
        if (this.numeroCamas != other.numeroCamas) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.direccion, other.direccion)) {
            return false;
        }
        if (!Objects.equals(this.listaEmpleados, other.listaEmpleados)) {
            return false;
        }
        return Objects.equals(this.listaPacientes, other.listaPacientes);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Hospital{");
        sb.append("nombre=").append(nombre);
        sb.append(", direccion=").append(direccion);
        sb.append(", numeroCamas=").append(numeroCamas);
        sb.append(", listaMedicos=").append(listaEmpleados);
        sb.append(", listaPacientes=").append(listaPacientes);
        sb.append('}');
        return sb.toString();
    }
    
    

   
   
    
    public void contratarEmpleado(Empleado emp){
        listaEmpleados.add(emp);
        
        
    }
    
    public void ingresarPaciente(Paciente paciente){
        listaPacientes.add(paciente);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroCamas() {
        return numeroCamas;
    }

    public void setNumeroCamas(int numeroCamas) {
        this.numeroCamas = numeroCamas;
    }

    public ArrayList<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public void setListaEmpleados(ArrayList<Empleado> listaEmpleados) {
        this.listaEmpleados = listaEmpleados;
    }

    public ArrayList<Paciente> getListaPacientes() {
        return listaPacientes;
    }

    public void setListaPacientes(ArrayList<Paciente> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }
    
}
