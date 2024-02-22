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
public class Nif {

    private long numero;
    private char letra;
    private LocalDate fechaCaducidad;

    public Nif(long numero, LocalDate fechaCaducidad) {
        this.numero = numero;
        this.letra = calcularletra(numero);
        this.fechaCaducidad = fechaCaducidad;
    }

    public long getNumero() {
        return numero;
    }

    public void setNumero(long numero) {
        this.numero = numero;
    }

    public char getLetra() {
        return letra;
    }

    //
    //public void setLetra(char letra) {
    //    this.letra = letra;
    //}

    public LocalDate getFechaCaducidad() {
        return fechaCaducidad;
    }

    //no debe estar ya que podria poner una fecha erronea
//    public void setFechaCaducidad(LocalDate fechaCaducidad) {
//        this.fechaCaducidad = fechaCaducidad;
//    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + (int) (this.numero ^ (this.numero >>> 32));
        hash = 37 * hash + this.letra;
        hash = 37 * hash + Objects.hashCode(this.fechaCaducidad);
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
        final Nif other = (Nif) obj;
        if (this.numero != other.numero) {
            return false;
        }
        if (this.letra != other.letra) {
            return false;
        }
        return Objects.equals(this.fechaCaducidad, other.fechaCaducidad);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nif{");
        sb.append("numero=").append(numero);
        sb.append(", letra=").append(letra);
        sb.append(", fechaCaducidad=").append(fechaCaducidad);
        sb.append('}');
        return sb.toString();
    }

    private char calcularletra(long numero) {

        int letranum = (int) numero % 23;

        char[] array = {'t', 'r', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J',
            'X', 'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
        return array[letranum];
    }

    public void renovarDni(LocalDate fecha) {
        this.fechaCaducidad = fecha.plusYears(10);
    }
}
