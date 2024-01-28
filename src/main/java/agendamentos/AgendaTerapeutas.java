package agendamentos;

import java.util.HashMap;
import java.util.Map;

public class AgendaTerapeutas {

    String[] terapeutas = {"Bruna","Geórgia","Amanda","Josiane"};
    String[] horas = {"07:00","08:00","09:00","10:00","11:00"};
    String[] dias = {"Segunda","terça","Quarta","Quinta","Sexta"};

    // Este mapa irá rastrear a disponibilidade de cada terapeuta
    Map<String, Map<String, Map<String, String>>> disponibilidade = new HashMap<>();

    public AgendaTerapeutas() {
        // Inicialmente, todos os horários de todos os dias para todas as terapeutas estão disponíveis
        for (String terapeuta : terapeutas) {
            Map<String, Map<String, String>> diasMap = new HashMap<>();
            for (String dia : dias) {
                Map<String, String> horasMap = new HashMap<>();
                for (String hora : horas) {
                    horasMap.put(hora, null); // null indica que o horário está disponível
                }
                diasMap.put(dia, horasMap);
            }
            disponibilidade.put(terapeuta, diasMap);
        }
    }

    public void agendar(String terapeuta, String dia, String hora, String aluno){
        if (disponibilidade.get(terapeuta).get(dia).get(hora) == null) {
            System.out.println("Horário da Terapeuta " + terapeuta + " às " + hora + " na " + dia + " reservado para o aluno " + aluno + ".");
            // Marcar o horário como indisponível
            disponibilidade.get(terapeuta).get(dia).put(hora, aluno);
        } else {
            System.out.println("Desculpe, o horário " + hora + " na " + dia + " com a terapeuta " + terapeuta + " já está reservado para o aluno " + disponibilidade.get(terapeuta).get(dia).get(hora) + ".");
        }
    }
}
