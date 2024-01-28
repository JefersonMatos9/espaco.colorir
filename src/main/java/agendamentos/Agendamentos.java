package agendamentos;

import alunos.Beneficiario;
import funcionarias.Funcionarias;

import java.util.ArrayList;
import java.util.List;

public class Agendamentos {
    public static void main(String[] args) {

        AgendaTerapeutas agendaTerapeutas = new AgendaTerapeutas();

        System.out.println("AGENDAMENTO SEMANAL DO ALUNOS\n");
        System.out.println("=================================");

        // Chame o método Bruna() com uma hora específica
        agendaTerapeutas.agendar("Bruna", "Segunda", "07:00","Miguel");
        agendaTerapeutas.agendar("Bruna","Segunda","07:00","Helena");
        agendaTerapeutas.agendar("Bruna","Segunda","08:00","Helena");
    }
}
