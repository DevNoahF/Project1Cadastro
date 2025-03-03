package dev.Java10x.Projeto1SpringCadastro.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service // vamos colocar service e nao rest por conta de ser uma camada de serviço
public class NinjaService {

    // @Autowired faz com que crie um constructor automaticamente
    // Porem é uma boa pratica voce escrever o construtor

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // listar todos os meus ninjas:
    // Essa função é a mesma coisa do que ir no db e escrever:
    // SELECT * FROM TB_CADASTRO
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll(); // .findAll() -> Basicamente como se fosse um 'INSERT INTO' no banco de dados
    }

    // listar todos os ninjas por ID
    // essa função é a mesma coisa do que ir no db e escrever:
    // SELECT * FROM TB_CADASTRO WHERE id=1;
    public NinjaModel listarNinjasId(Long id){
        Optional<NinjaModel> ninjaID = ninjaRepository.findById(id);
        return ninjaID.orElse(null); // se caso ouver um ninja por esse id ele me retorna, caso nao tenha, ele retorna null
    }

    // criar novo ninja
    // essa função é a mesmaa coisa do que ir no db e escrever:
    // INSERT INTO TB_CADASTRO(id, nome, email, idade, etc...
    // VALUES ''
    public NinjaModel criarNinja(NinjaModel ninja){
        return ninjaRepository.save(ninja);
    }
}
