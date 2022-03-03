package posto_de_saude;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Posto extends info{
   private String cidade;
   private String estado;  

    @Override
    void Exibir() {
      System.out.println("==INFORMAÇÕES DO POSTO DE SAÚDE==" + "\n"
              + "Nome: " + getNome() + "\n"
                      + "Cidade: " + cidade + "\n"
                              + "Estado: " + estado);
    }

}
