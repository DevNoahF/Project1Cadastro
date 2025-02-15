package dev.Java10x.Projeto1SpringCadastro.Ninjas;
import dev.Java10x.Projeto1SpringCadastro.Missoes.MissoesModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

// Entity ele transforma uma classe em uma entidade do banco de dados (DB)
// JPA -> Java Persistence API
@Entity
@Table(name = "tb_cadastro")
@NoArgsConstructor // faz com que seja criado um construtor sem argumentos
@AllArgsConstructor // faz com que seja criado um cosntrutor com argumentos
@Data // Cria todos os getters and setters
@ToString(exclude = "missoes")
public class NinjaModel {

    // OneToOne -> Um para um
    // OneToMany -> Um para muitos

    // Id é a chave primária
    @Id // Indica que é a chave primária da tabela do banco de dados (DB)
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera um valor automaticamente (passa o jeito que vc quer que gere o ID)

    @Column(name = "id") // Indica que é uma coluna no banco de dados (DB)
    private Long id;

    @Column(name = "nome")
    private String nome;

    @Column (unique = true) // Indica que o email é único
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column(name = "idade")
    private int idade;

    @ManyToOne// Muitos ninjas para uma missão
    @JoinColumn(name = "missoes_id") // Indica que é uma chave estrangeira, é pra ser utilizada sempre que usar o MANYTOONE
    private MissoesModel missoes;



}
