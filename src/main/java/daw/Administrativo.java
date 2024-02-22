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
public final class Administrativo extends Empleado{
    
    private Grupo grupo;

    public Administrativo(Grupo grupo, String numeroSeguridadSocial, double salario, String nombre, String apellidos, Nif nif) {
        super(numeroSeguridadSocial, salario, nombre, apellidos, nif);
        this.grupo = grupo;
    }

    

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.grupo);
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
        final Administrativo other = (Administrativo) obj;
        return this.grupo == other.grupo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Administrativo{");
        sb.append("grupo=").append(grupo);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double calcularIrpf() {
       return this.getSalario()*this.grupo.getIRPF();
    }

    public void registrarDocumento(String nombreDoc){
        System.out.println("El administrativo : " + this.getNombre() +" "+ this.getApellidos()
        +" registra el documento " + nombreDoc+ " " + nombreDoc.hashCode());
        
    }
    
    
    
}
