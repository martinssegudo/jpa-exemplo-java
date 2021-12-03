package br.com.exemplo.api;

import br.com.exemplo.entidades.Pessoa;
import br.com.exemplo.repositorio.PessoaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping(path = "/pessoa")
public class PessoaAPI {

    @Autowired
    private PessoaRepositorio pessoaRepositorio;

    @PostMapping
    @Transactional
    public Pessoa salvaPessoa(@RequestBody Pessoa pessoa){
        return pessoaRepositorio.save(pessoa);
    }

    @GetMapping
    public List<Pessoa> getPessoa(){
        return pessoaRepositorio.findAll();
    }

    @GetMapping("/find/{id}")
    public Pessoa getPessoa(@PathVariable("id") Long id){
        return pessoaRepositorio.findById(id).orElse(null);
    }
}
