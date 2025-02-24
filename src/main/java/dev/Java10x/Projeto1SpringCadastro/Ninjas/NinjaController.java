package dev.Java10x.Projeto1SpringCadastro.Ninjas;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class NinjaController {

        @GetMapping("/boa")
        @ResponseBody
        public String boasVindas(){
            return "Bem vindo ao sistema de cadastro de clientes!";
        }


        // CRUD

    // adicionar ninja (CREATE)
    @PostMapping("/criar")
    public String criarNija(){
            return "Ninja criado com sucesso!";
    }

    // mostrar todos os ninjas (READ)
    @GetMapping("/todos")
    public String mostrarTodosNinjas(){
            return "Ninjas criadas!";
    }

    // mostrar ninjas por ID (READ)
    @GetMapping("/TodosID")
    public String mostrarTodosNinjasId(){
            return "Mostrar Ninja por ID!";
    }
    //alterar dados do ninja(UPDATE)
    @PutMapping("/alterarID")
    public String alterarNinja(){
            return "Ninja alterado com sucesso!";
    }
    // deletar ninja(DELETE)
    @DeleteMapping("/deletarID")
    public String deletarNinja(){
            return "Ninja deletado com sucesso!";
    }
}
