package alunos;

public class Executar extends DadosCadastro{
    public static void main(String[] args) {

        DadosCadastro dados = new DadosCadastro();

        dados.addBeneficiario();
        dados.pai();
        dados.documento();
        dados.endRua();
        dados.deleteBeneficiario();




    }
}
