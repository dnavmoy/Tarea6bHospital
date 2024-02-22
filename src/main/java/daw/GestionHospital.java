/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package daw;

import java.time.LocalDate;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author Dan_n
 */
public class GestionHospital {

    public static void main(String[] args) {

        Hospital costa = new Hospital("COSTA DEL SOL", "N340", 180);

        costa.contratarEmpleado(crearMedico());
        costa.contratarEmpleado(crearMedico());
        costa.contratarEmpleado(crearPersonalPAS());
        costa.contratarEmpleado(crearPersonalPAS());
        costa.contratarEmpleado(crearPersonalPAS());

        costa.ingresarPaciente(crearPaciente());
        costa.ingresarPaciente(crearPaciente());
        costa.ingresarPaciente(crearPaciente());
        costa.ingresarPaciente(crearPaciente());
        costa.ingresarPaciente(crearPaciente());

        Random r = new Random();
        boolean medicoEncontrado = false;
        do {
            int aleatorio = r.nextInt(costa.getListaEmpleados().size());
            if (costa.getListaEmpleados().get(aleatorio) instanceof Medico) {
                Medico medico = (Medico) costa.getListaEmpleados().get(aleatorio);
                medico.tratar(costa.getListaPacientes().get(r.nextInt(costa.getListaPacientes().size())), "Pancetamol");
                medicoEncontrado = true;
            }
        } while (!medicoEncontrado);

        costa.getListaPacientes().get(0).renovarNIF(LocalDate.now());

        for (int i = 0; i < costa.getListaEmpleados().size(); i++) {

            double irpf = costa.getListaEmpleados().get(i).calcularIrpf();
            System.out.println("El irpf es : " + irpf);

        }

    }

    public static Paciente crearPaciente() {
        Random r = new Random();
        Paciente paciente = new Paciente(randomLetras(5), randomLetras(8), randomLetras(8), new Nif(1111, LocalDate.now()));
        return paciente;
    }

    public static Medico crearMedico() {
        Random r = new Random();
        String especialidad = "";
        if (r.nextBoolean()) {
            especialidad = "cirugia";
        } else {
            especialidad = randomLetras(5);
        }

        Medico medico = new Medico(especialidad, randomLetras(5), r.nextInt(2000), randomLetras(5), randomLetras(8), new Nif(1111, LocalDate.now()));
        return medico;
    }

    public static Administrativo crearPersonalPAS() {
        Random r = new Random();
        Administrativo administrativo = new Administrativo(Grupo.randomGrupo(), randomLetras(5), 0, randomLetras(5), randomLetras(8), new Nif(1111, LocalDate.now()));
        return administrativo;
    }

    public static String randomLetras(int numero) {

        return RandomStringUtils.randomAlphabetic(numero);
    }
}
