package posto_de_saude;

import java.util.ArrayList;
import java.util.List;

public  class CarteiradeVacinacao extends info{
private Paciente paciente; 
private Posto posto;
private List<Vacina> Vacinas = new ArrayList<Vacina>();
public  CarteiradeVacinacao(Paciente paciente, Posto posto){
     this.paciente = paciente;
     this.posto = posto;
}

protected void VacinarPaciente(Vacina vacina){
    Vacinas.add(vacina);
    paciente.addImunidade(vacina);
    
    
}


    @Override
    void Exibir() {
    System.out.println("===CARTEIRA DE VACINAÇÃO================");
    System.out.println("Nome: " + this.paciente.getNome());
    System.out.println("Idade: " + paciente.getIdade());
    
    for(int i = 0; i < Vacinas.size();i++){
     System.out.println("NOME DA VACINA: " + Vacinas.get(i).getNome() + " - UNIDADE DE SAÚDE: " +  posto.getNome());
    }
    
   
    }
}
