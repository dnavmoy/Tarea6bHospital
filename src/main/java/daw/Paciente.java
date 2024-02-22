/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.util.Objects;
import java.util.Random;

/**
 *
 * @author Dan_n
 */
public class Paciente extends Persona implements Nadador{
    
    private String numeroHistoria;

    public Paciente(String numeroHistoria, String nombre, String apellidos, Nif nif) {
        super(nombre, apellidos, nif);
        this.numeroHistoria = numeroHistoria;
    }

    

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.numeroHistoria);
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
        final Paciente other = (Paciente) obj;
        return Objects.equals(this.numeroHistoria, other.numeroHistoria);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Paciente{");
        sb.append("numeroHistoria=").append(numeroHistoria);
        sb.append('}');
        return sb.toString();
    }

    public void tomarMedicina(String medicina){
        Random r = new Random();
        
        if(r.nextBoolean()){
            System.out.println("El paciente se ha curado");
        }else{
            System.out.println("El paciente no se ha curado");
        }
        
    }
    
    public void serNadador(){
        System.out.println("Soy un paciente que nada");
    }
    
    
    
    
}
