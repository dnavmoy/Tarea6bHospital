/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Objects;

/**
 *
 * @author Dan_n
 */
public class Medico extends Empleado implements Nadador{
    
    private String especialidad;
    public static final double IRPF_CIRUJANO=0.25;
    public static final double IRPF_MEDICO=0.235;

    public Medico(String especialidad, String numeroSeguridadSocial, double salario, String nombre, String apellidos, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
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
            return this.getSalario()*IRPF_CIRUJANO;
        }else {
            return this.getSalario()*IRPF_MEDICO;
        }
    }
    
    public void tratar(Paciente paciente, String medicina){
        
        System.out.println("El medico" + this.getNombre() + " "+ this.getApellidos()+
                " " + "trata al paciente: " +paciente.getNombre() + " "+ paciente.getApellidos()+
                " con la medicina: " + medicina);
        paciente.tomarMedicina(medicina);
    }

    @Override
    public void serNadador() {
        System.out.println("Soy medico y nado");
    }

    

    
    
    
    
}
