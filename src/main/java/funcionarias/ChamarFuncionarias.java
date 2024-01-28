package funcionarias;



import java.util.ArrayList;
import java.util.List;



public class ChamarFuncionarias implements Funcionarias {

    String nome = "Bruna";
    String profissao = "Psicopedagoga";
    String cidade = "Araraquara";
    String rua = "Avenida tal tal";
    int numero = 254;
    String bairro = "Centro";
    int hrTrabalhada = 220;
    double salHr = 12.5;
    List<Funcionarias> funcionarias = new ArrayList<>();


    @Override
    public void funcionaria(){

        System.out.println("Nome: "+ nome);
    }
    @Override
   public void profissao() {
       System.out.println("Profissão: "+profissao);
    }
    @Override
    public void end(){
        System.out.println("Endereço: "+rua+ " ,n:"+numero+", Bairro: "+bairro+",Cidade: "+cidade+".");
    }
public void valorReceber(){
        double valorReceber = salHr * hrTrabalhada;
System.out.println("Valor total a receber: "+ valorReceber);
}
}


