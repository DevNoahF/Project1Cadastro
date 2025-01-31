package dev.Java10x.Projeto1SpringCadastro.Missoes;

import dev.Java10x.Projeto1SpringCadastro.Ninjas.NinjaModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tb_missoes")
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
