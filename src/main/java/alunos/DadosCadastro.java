package alunos;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.Date;


public class DadosCadastro implements Cadastro {

    Scanner scanner = new Scanner(System.in);
    List<Beneficiario>beneficiarios = new ArrayList<>();

    @Override
    public void addBeneficiario() {
        Beneficiario beneficiario = new Beneficiario();

        System.out.println("Nome do beneficiario:");
        beneficiario.nomeBeneficiario = scanner.nextLine();
beneficiarios.add(beneficiario);
    }

    @Override
    public void pai() {
        Beneficiario beneficiario = new Beneficiario();
        System.out.println("Nome do Pai:");
        beneficiario.nomeBeneficiario = scanner.nextLine();
        beneficiarios.add(beneficiario);
    }
    @Override
    public void mae() {
        Beneficiario beneficiario = new Beneficiario();
        System.out.println("Nome da Mãe:");
        beneficiario.nomeBeneficiario = scanner.nextLine();
        beneficiarios.add(beneficiario);
    }
    @Override
    public void documento() {
        Beneficiario beneficiario = new Beneficiario();
        System.out.println("Rg ou Cpf do Pai ou Mãe:");
        beneficiario.docResponsavel = scanner.nextLong();
        beneficiarios.add(beneficiario);
    }
public void endRua(){
        Beneficiario beneficiario = new Beneficiario();
    System.out.println("Rua:");
    beneficiario.rua = scanner.nextLine();
    beneficiarios.add(beneficiario);
}
    public void deleteBeneficiario() {
        Beneficiario beneficiario = new Beneficiario();
        System.out.println("Digite o nome do Beneficiario que deseja excluir: ");
        String nomeBeneficiario = scanner.nextLine();
        boolean existeBeneficiario = beneficiarios.stream().anyMatch(b ->
                b.nomeBeneficiario != null && b.nomeBeneficiario
                        .equals(nomeBeneficiario));
        if (existeBeneficiario) {
            beneficiarios.removeIf(b -> b.nomeBeneficiario.equals
                    (nomeBeneficiario));
            System.out.println("Beneficiario Removido com Sucesso");

        } else System.out.println("Beneficiario não existe");
    }
}













