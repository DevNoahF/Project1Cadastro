package dev.Java10x.Projeto1SpringCadastro.Missoes;

 // LOCALHOST:8080/deletar/1 (quando quiser deletar pelo id)

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping ("missoes")
public class MissoesController {

    // GET -- Mandar uma requisição para mostrar as missoes
    @GetMapping("/listar") // quando voce quer dar para o usuario alguma coisa
    public String listarMissoao(){
        return "Missao listadas com sucesso!";
    }
    // Localhost:8080/missoes/criar
    // postMapping utilizado quando o usuario quer mandar algo
    @PostMapping("/criar")
    public String criarMissao(){
        return "Missao criada com sucesso!";
    }

    // put -- Mandar uma requisição para alterar missoes
    @PutMapping("/alterar") // voce vai alterar o metodo que ja esta criado no seu banco de dados
    public String alterarMissao(){
        return "Missao alterada com sucesso!";
    }

    // Delete --  Mandar uma requisição para deletar as missoes
    @DeleteMapping("/deletar")
    public String deletarMissao(){
        return "Missao deletada com sucesso!";
    }


}
