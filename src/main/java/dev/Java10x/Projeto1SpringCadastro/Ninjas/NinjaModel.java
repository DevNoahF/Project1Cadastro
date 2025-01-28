package dev.Java10x.Projeto1SpringCadastro.Ninjas;
import dev.Java10x.Projeto1SpringCadastro.Missoes.MissoesModel;
import jakarta.persistence.*;

import java.util.List;

// Entity ele transforma uma classe em uma entidade do banco de dados (DB)
// JPA -> Java Persistence API
@Entity
@Table(name = "tb_cadastro")
public class NinjaModel {

    // Id é a chave primária
    @Id // Indica que é a chave primária da tabela do banco de dados (DB)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera um valor automaticamente (passa o jeito que vc quer que gere o ID)
    private Long id;
    private String nome;
    private String email;
    private int idade;

    @ManyToOne // Um ninja tem apenas uma missao
    @JoinColumn(name = "missoes_id") // (foreing key = chave estrangeira) Nome da coluna que vai ser criada na tabela do banco de dados (DB)
    private MissoesModel missoes;

    public NinjaModel() {
    }

    public NinjaModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
