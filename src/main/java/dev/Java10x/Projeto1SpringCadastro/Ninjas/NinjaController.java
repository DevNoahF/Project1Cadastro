package dev.Java10x.Projeto1SpringCadastro.Ninjas;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // fala que isso é um controller
@RequestMapping("/ninjas")
public class NinjaController {


    private NinjaService ninjaService; // para a utiização do rest, precisamos fazer injeção de dependencias, assim podendo utilizar metodos do ninjaService

    public NinjaController(NinjaService ninjaService) { // sempre que inserir a dependencia criar um construtor junto
        this.ninjaService = ninjaService;
    }

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
    @GetMapping("/listar")
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // mostrar ninjas por ID (READ)
    @GetMapping("/listarID")
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
