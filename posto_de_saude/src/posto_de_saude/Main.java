package posto_de_saude;

public class Main {

    public static void main(String[] args) {
     Paciente Jeferson = new Paciente();
     Posto ubs = new Posto();
     Vacina vacina = new Vacina();
      Vacina vacina2 = new Vacina();
     CarteiradeVacinacao carteira = new CarteiradeVacinacao(Jeferson,ubs);

     vacina.setVirus("Corona Vírus");
     vacina.setNome("CORONAVAC");
     vacina2.setVirus("Influenza (Gripe)");
     vacina2.setNome("Influvac");
     Jeferson.setNome("Jeferson Oliveira");
     Jeferson.setIdade(29);
     ubs.setNome("UBS ITAQUERA");
     ubs.setCidade("São Paulo");
     ubs.setEstado("SP");
     carteira.Exibir();
     Jeferson.Exibir();
     ubs.Exibir();
     vacina.Exibir();
    
    
     carteira.VacinarPaciente(vacina); //Vacinando o paciente com  coronavac
     
   
     carteira.Exibir();
     Jeferson.Exibir();
     ubs.Exibir();
     vacina.Exibir();
      carteira.VacinarPaciente(vacina); //Vacinando o paciente com  coronavac
       carteira.VacinarPaciente(vacina); //Vacinando o paciente com  coronavac
     carteira.VacinarPaciente(vacina2);//Vacinando o paciente com Influvac
     carteira.Exibir();
     Jeferson.Exibir();
     ubs.Exibir();
     vacina.Exibir();
        
    }
    
}
