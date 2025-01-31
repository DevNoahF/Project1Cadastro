package dev.Java10x.Projeto1SpringCadastro.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class NinjaController {

        @GetMapping("/boa")
        @ResponseBody
        public String boasVindas(){
            return "Bem vindo ao sistema de cadastro de clientes!";
        }


}
