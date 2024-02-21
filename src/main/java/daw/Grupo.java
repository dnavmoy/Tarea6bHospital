/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package daw;

import java.util.Random;

/**
 *
 * @author Dan_n
 */
public enum Grupo {
    
    C(0.17),D(0.18),E(0.185);
    
    
    private final double IRPF;

    private Grupo(double IRPF) {
        
        this.IRPF = IRPF;
    }

    public static Grupo getC() {
        return C;
    }

    public static Grupo getD() {
        return D;
    }

    public static Grupo getE() {
        return E;
    }

    

    public double getIRPF() {
        return IRPF;
    }

      public static Grupo randomGrupo(){
          Random r= new Random(); 
          r.nextInt(4);
          Grupo[] array=Grupo.values();
          return array[r.nextInt(3)];
      }
    
    
}
