package dev.Java10x.Projeto1SpringCadastro.Missoes;

import dev.Java10x.Projeto1SpringCadastro.Ninjas.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
@NoArgsConstructor // faz com que seja criado um construtor sem argumentos
@AllArgsConstructor // faz com que seja criado um cosntrutor com argumentos
@Data // Cria todos os getters and setters
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;

    //todo: Sempre que utilizamos ONETOMANY precizamos marcar o MAPPEDBY para indicar que a chave estrangeira está na outra tabela
    @OneToMany(mappedBy = "missoes") // Uma missão para muitos ninjas
    private List<NinjaModel> ninjas;
}
