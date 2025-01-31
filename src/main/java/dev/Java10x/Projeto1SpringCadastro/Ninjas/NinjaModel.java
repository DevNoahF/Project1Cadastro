package dev.Java10x.Projeto1SpringCadastro.Ninjas;
import dev.Java10x.Projeto1SpringCadastro.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity ele transforma uma classe em uma entidade do banco de dados (DB)
// JPA -> Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor // faz com que seja criado um construtor sem argumentos
@AllArgsConstructor // faz com que seja criado um cosntrutor com argumentos
@Data // Cria todos os getters and setters
public class NinjaModel {

    // OneToOne -> Um para um
    // OneToMany -> Um para muitos

    // Id é a chave primária
    @Id // Indica que é a chave primária da tabela do banco de dados (DB)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera um valor automaticamente (passa o jeito que vc quer que gere o ID)
    Long id;
    String nome;
    String email;
    int idade;

    @ManyToOne// Muitos ninjas para uma missão
    @JoinColumn(name = "missoes_id") // Indica que é uma chave estrangeira, é pra ser utilizada sempre que usar o MANYTOONE
    private MissoesModel missoes;



}
