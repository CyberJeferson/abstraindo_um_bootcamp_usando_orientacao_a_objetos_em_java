
package posto_de_saude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Vacina extends info{
    private String virus;

    @Override
    void Exibir() {
        System.out.println("====INFORMAÇÕES DA VACINA=====");
         System.out.println("Nome da vacina:" + getNome() + "\n"
                 + "Imunidade: " + virus);
    }
    
}
