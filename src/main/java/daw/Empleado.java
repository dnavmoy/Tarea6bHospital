/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Dan_n
 */
public abstract class Empleado extends Persona{
    
    private String numeroSeguridadSocial;
    private double salario;

    public Empleado(String numeroSeguridadSocial, double salario, String nombre, String apellidos, long numero, LocalDate fechaCaducidad) {
        super(nombre, apellidos, numero, fechaCaducidad);
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.salario = salario;
    }

    public String getNumeroSeguridadSocial() {
        return numeroSeguridadSocial;
    }

    public void setNumeroSeguridadSocial(String numeroSeguridadSocial) {
        this.numeroSeguridadSocial = numeroSeguridadSocial;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 11 * hash + Objects.hashCode(this.numeroSeguridadSocial);
        hash = 11 * hash + (int) (Double.doubleToLongBits(this.salario) ^ (Double.doubleToLongBits(this.salario) >>> 32));
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
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(this.salario) != Double.doubleToLongBits(other.salario)) {
            return false;
        }
        return Objects.equals(this.numeroSeguridadSocial, other.numeroSeguridadSocial);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empleado{");
        sb.append("numeroSeguridadSocial=").append(numeroSeguridadSocial);
        sb.append(", salario=").append(salario);
        sb.append('}');
        return sb.toString();
    }

    public abstract double calcularIrpf();
   
   

  
    
    
    

}
