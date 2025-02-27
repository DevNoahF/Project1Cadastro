package dev.Java10x.Projeto1SpringCadastro.Ninjas;

import org.springframework.stereotype.Service;

import java.util.List;

@Service // vamos colocar service e nao rest por conta de ser uma camada de serviço
public class NinjaService {

    // @Autowired faz com que crie um constructor automaticamente
    // Porem é uma boa pratica voce escrever o construtor

    private NinjaRepository ninjaRepository;

    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // listar todos os meus ninjas:
    public List<NinjaModel> listarNinjas(){
        return ninjaRepository.findAll(); // .findAll() -> Basicamente como se fosse um 'INSERT INTO' no banco de dados


    }
}
