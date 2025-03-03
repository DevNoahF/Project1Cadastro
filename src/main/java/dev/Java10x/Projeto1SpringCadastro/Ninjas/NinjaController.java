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
    @PostMapping("/criar") // post manda para o banco de dados
    public NinjaModel criarNinja(@RequestBody NinjaModel ninja){ // RequestBody faz com que ele mande no corpo da requisição ele vai mandar um json e pegamos e mandamos para o banco de dados
            return ninjaService.criarNinja(ninja);
    }

    // mostrar todos os ninjas (READ)
    @GetMapping("/listar") // get esta mostrando
    public List<NinjaModel> listarNinjas(){
        return ninjaService.listarNinjas();
    }

    // mostrar ninjas por ID (READ)
    @GetMapping("/listar/{id}") // path variable -> variavel do caminho(path)
    public NinjaModel listarNinjasId(@PathVariable Long id){
            return ninjaService.listarNinjasId(id);
    }
    //alterar dados do ninja(UPDATE)
    @PutMapping("/alterarID") // put esta modificando algo ja enviado
    public String alterarNinja(){
            return "Ninja alterado com sucesso!";
    }
    // deletar ninja(DELETE)
    @DeleteMapping("/deletarID") // delete é deletar algo do banco de dados
    public String deletarNinja(){
            return "Ninja deletado com sucesso!";
    }
}
