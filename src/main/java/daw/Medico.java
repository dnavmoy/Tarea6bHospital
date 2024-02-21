/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author Dan_n
 */
public class Medico extends Empleado{
    
    private String especialidad;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, long numero, LocalDate fechaCaducidad) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, numero, fechaCaducidad);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 19 * hash + Objects.hashCode(this.especialidad);
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
        final Medico other = (Medico) obj;
        return Objects.equals(this.especialidad, other.especialidad);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Medico{");
        sb.append("especialidad=").append(especialidad);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularIrpf() {
        if(this.especialidad.equals("Cirugia")){
            return this.getSalario()*0.25;
        }else {
            return this.getSalario()*0.235;
        }
    }
    
    public void tratar(Paciente paciente, String medicina){
        
        System.out.println("El medico" + this.getNombre() + " "+ this.getApellidos()+
                " " + "trata al paciente: " +paciente.getNombre() + " "+ paciente.getApellidos()+
                " con la medicina: " + medicina);
        paciente.tomarMedicina(medicina);
    }

    

    
    
    
    
}
