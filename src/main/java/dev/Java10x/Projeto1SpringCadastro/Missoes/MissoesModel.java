package dev.Java10x.Projeto1SpringCadastro.Missoes;

import dev.Java10x.Projeto1SpringCadastro.Ninjas.NinjaModel;
import jakarta.persistence.*;


@Entity
@Table(name = "tb_missoes")
public class MissoesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String dificuldade;
    private NinjaModel ninja;

    public MissoesModel() {
    }

    public MissoesModel(Long id, String nome, String dificudade) {
        this.id = id;
        this.nome = nome;
        this.dificuldade = dificudade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    
}
