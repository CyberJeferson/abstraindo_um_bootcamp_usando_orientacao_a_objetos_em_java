package posto_de_saude;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter  
public class Paciente extends info {
   private int idade;
   private boolean adiciona;
   private List<String> imunidade = new ArrayList<String>();

  
    public void addImunidade(Vacina vacina) {
        adiciona = true;
        for(int i = 0; i < imunidade.size(); i++){
            if(imunidade.get(i).compareTo(vacina.getVirus()) ==0){
                adiciona = false;
                
            }
               
            
        }
        if(adiciona == true){
         imunidade.add(vacina.getVirus());   
        }
        
    }
  

    @Override
    void Exibir() {
            System.out.println("===IMUNIDADES DO PACIENTE===");
        System.out.println("Nome: " + getNome());
        System.out.println("idade: " + idade);
        for(int i = 0; i < imunidade.size();i++){
              System.out.println("Imune á:" + imunidade.get(i));
        }
        
    }

   
   
    
}
